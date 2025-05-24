package linkedlist;

public class DoublyLinkedList {
    public Node head;
    public Node tail;
    public int length;

    private static class Node {
        int value;
        Node previous;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public DoublyLinkedList(int value) {
        Node node = new Node(value);
        head = node;
        tail = node;
        length++;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
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

    public void append(int value) {
        Node node = new Node(value);
        if (length == 0) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.previous = tail;
            tail = node;
        }
        length++;
    }

    public Node removeLast() {
        if (length == 0) {
            return null;
        } else if (length == 1) {
            Node temp = tail;
            head = null;
            tail = null;
            length--;
            return temp;
        } else {
            Node temp = tail;
            tail = tail.previous;
            tail.next = null;
            temp.previous = null;
            length--;
            return temp;
        }
    }

    public void prepand(int value) {
        Node node = new Node(value);
        if(length == 0) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head.previous = node;
            head = node;
        }
        length++;
    }
}
