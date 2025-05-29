package linkedlist;

public class DoublyLinkedList {
    public Node head;
    public Node tail;
    public int length;

    public static class Node {
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

    public void prepend(int value) {
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

    public Node removeFirst(){
        if(length == 0) {
            return null;
        } else if(length == 1) {
            Node temp = head;
            head = null;
            tail = null;
            length--;
            return temp;
        } else {
            Node temp = head;
            head = head.next;
            head.previous = null;
            temp.next = null;
            length--;
            return temp;
        }
    }

    public Node get(int index) {
        if(index < 0 || index >= length) {
            return null;
        } else if(index == 0) {
            return head;
        }

        Node previous = head;
        int temp = 0;
        while (temp != index-1) {
            previous = previous.next;
            temp++;
        }

        return previous.next;
    }

    public boolean set(int index, int value) {
        if(index < 0 || index >= length) {
            return false;
        }
        Node node = get(index);
        node.value = value;
        return true;
    }

    public boolean insert(int index, int value) {
        if(index < 0 || index > length) {
            return false;
        }

        if(index == 0) {
            prepend(value);
        } else if(index == length) {
            append(value);
        } else {
            Node node = new Node(value);
            Node previous;
            Node current;
            if(index < length/2) {
                int temp = 0;
                previous = head;
                current = head;
                while (temp < index) {
                    previous = current;
                    current = current.next;
                    temp++;
                }
            } else {
                int temp = length-1;
                current = tail;
                previous = tail.previous;

                while(temp > index) {
                   current = current.previous;
                   previous = current.previous;
                   temp--;
                }
            }
            node.next = current;
            previous.next = node;
            current.previous = node;
            node.previous = previous;
            length++;
        }

        return true;
    }

    public Node remove(int index) {
        if(index < 0 || index > length-1) {
            return null;
        }else if(index == 0) {
            return removeFirst();
        } else if(index == length-1){
            return removeLast();
        } else {
            Node node = get(index);
            Node previousNode = get(index-1);
            Node nextNode = get(index+1);

            previousNode.next = nextNode;
            nextNode.previous = previousNode;
            node.next = null;
            node.previous = null;
            length--;
            return node;
        }
    }
}
