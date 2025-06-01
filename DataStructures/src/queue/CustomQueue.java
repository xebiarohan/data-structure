package queue;

public class CustomQueue {

    private Node first;
    private Node last;
    private int length;


    public CustomQueue(int value){
        Node node = new Node(value);
        first = node;
        last = node;
        length++;
    }

    class Node {
        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public void printStack() {
        CustomQueue.Node temp = first;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getFirst() {
        System.out.println("First: " + first.value);
    }

    public void getLast() {
        System.out.println("Last: " + last.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void enqueue(int value) {
        Node node = new Node(value);
        if(length == 0) {
            first = node;
            last = node;
        } else {
            last.next = node;
            last = node;
        }
        length++;
    }

    public Node dequeue() {
        if(length == 0) {
            return null;
        } else {
            Node temp = first;
            first = first.next;
            length--;
            if(length == 0) {
                last = null;
            }
            temp.next = null;
            return temp;
        }

    }
}
