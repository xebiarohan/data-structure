package stack;

public class CustomStack {
    private Node top;
    private int height;

    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public CustomStack(int value) {
        top = new Node(value);
        height = 1;
    }

    public void printStack() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getTop() {
        System.out.println("Top: " + top.value);
    }

    public void getHeight() {
        System.out.println("Height: " + height);
    }

    public void push(int value) {
        Node node = new Node(value);
        if (top != null) {
            node.next = top;
        }
        top = node;
        height++;
    }

    public Node pop() {
        if(top == null) {
            return null;
        } else  {
            Node temp = top;
            top = top.next;
            temp.next = null;
            height--;
            return temp;
        }
    }
}
