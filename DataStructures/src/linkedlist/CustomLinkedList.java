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
}
