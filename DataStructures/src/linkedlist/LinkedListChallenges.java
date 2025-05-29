package linkedlist;

import java.util.HashSet;
import java.util.Set;

public class LinkedListChallenges {

    private Node head;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedListChallenges(int value) {
        Node newNode = new Node(value);
        head = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nLinked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void makeEmpty() {
        head = null;
        length = 0;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        length++;
    }

    public void removeDuplicatesI() {
        Node current = head;
        while (current != null) {
            Node runner = current;
            while (runner.next != null) {
                if (runner.next.value == current.value) {
                    runner.next = runner.next.next;
                    length -= 1;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }

    public void removeDuplicates() {
        Set<Integer> values = new HashSet<>();
        Node previous = null;
        Node current = head;
        while (current != null) {
            if (values.contains(current.value)) {
                previous.next = current.next;
                length -= 1;
            } else {
                values.add(current.value);
                previous = current;
            }
            current = current.next;
        }
    }

    public int binaryToDecimal() {
        int total = 0;
        int index = 0;
        Node node = head;
        while (index < length) {
            total = (total * 2 + (node.value));
            index++;
            node = node.next;
        }
        return total;
    }

    public void partitionList(int x) {
        if(head != null && head.next!= null) {
            Node dummy1 = new Node(0);
            Node dummy2 = new Node(0);
            Node prev1 = dummy1;
            Node prev2 = dummy2;
            Node current = head;

            while (current != null) {
                if (current.value < x) {
                    prev1.next = current;
                    prev1 = current;
                } else {
                    prev2.next = current;
                    prev2 = current;
                }
                current = current.next;
            }
            prev2.next = null;
            prev1.next = dummy2.next;
            head = dummy1.next;
        }
    }

    public void partitionList1(int x) {
        if (head == null) return;

        Node dummy1 = new Node(0);
        Node dummy2 = new Node(0);
        Node prev1 = dummy1;
        Node prev2 = dummy2;
        Node current = head;

        while (current != null) {
            if (current.value < x) {
                prev1.next = current;  // Link node to the end of the first list.
                prev1 = current;       // Update the end pointer of the first list.
            } else {
                prev2.next = current;  // Link node to the end of the second list.
                prev2 = current;       // Update the end pointer of the second list.
            }

            current = current.next;
        }

        prev2.next = null;

        prev1.next = dummy2.next;
        head = dummy1.next;
    }


    // WRITE THE REMOVEDUPLICATES METHOD HERE //
    //                                        //
    //                                        //
    //                                        //
    //                                        //
    ////////////////////////////////////////////

}
