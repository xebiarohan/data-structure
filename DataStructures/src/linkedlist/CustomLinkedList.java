package linkedlist;

import java.util.LinkedList;

public class CustomLinkedList {
    private Node head;
    private Node tail;
    private int length;

    private static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            next = null;
        }
    }

    public CustomLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void append(int data) {
        Node node = new Node(data);
        if(length == 0) {
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;
        length++;
    }

    public Node removeLast() {
        if(length == 0) {
            return null;
        } else {
            Node current = head;
            Node previous = head;

            while(current.next != null) {
                previous = current;
                current = current.next;
            }

            tail = previous;
            tail.next = null;
            length--;
            if(length == 0) {
                head = null;
                tail = null;
            }
            return current;
        }
    }

    public void prepand(int value) {
        Node node = new Node(value);
        if(length == 0) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head = node;
        }
        length++;
    }

    public Node removeFirst() {
        if(head == null) {
            return null;
        } else {
            Node node = head;
            head = head.next;
            node.next = null;
            length--;
            if(length == 0) {
                tail = null;
            }
            return node;
        }
    }

    public Node get(int index) {
        if(index >= length || index < 0) {
            return null;
        }
        int tempIndex = 0;
        Node temp = head;
        while(tempIndex != index) {
            temp = temp.next;
            tempIndex++;
        }

        return temp;
    }

    public boolean setValue(int index, int value) {
        if(index >= length || index < 0) {
            return false;
        }

        int tempIndex = 0;
        Node temp = head;

        while(tempIndex != index) {
            temp = temp.next;
            tempIndex++;
        }

        temp.value = value;
        return true;
    }

    public boolean insert(int index, int value) {
        if(index < 0 || index > length) {
            return false;
        } else if(index == 0) {
            prepand(value);
            return true;
        } else if(index == length) {
            append(value);
            return true;
        } else {
            Node node = new Node(value);
            Node previous = head;
            Node current = head;
            int tempIndex = 0;

            while(tempIndex != index) {
                previous = current;
                current = current.next;
                tempIndex++;
            }

            node.next = current;
            previous.next = node;
            length++;
            return true;
        }
    }

    public Node remove(int index) {
        if(index < 0 || index > length-1) {
            return null;
        } else if(index == 0) {
            return removeFirst();
        } else if(index == length-1) {
            return removeLast();
        } else {

            Node previousNode = get(index - 1);
            Node currentNode = previousNode.next;
            previousNode.next = currentNode.next;
            currentNode.next = null;
            length--;
            return currentNode;
        }
    }

    public void reverse() {
        Node current = head;
        head = tail;
        tail = current;
        Node after = current.next;
        Node before = null;
        int i=0;
        while (i < length) {
            after = current.next;
            current.next = before;
            before = current;
            current = after;
            i++;
        }
    }
}
