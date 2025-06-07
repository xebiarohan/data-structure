package trees;

public class BinarySearchTree {
    private Node root;

    class Node {
        public int value;
        public Node left;
        public Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    public BinarySearchTree(int value) {
        root = new Node(value);
    }

    public BinarySearchTree() {
    }

    public boolean insert(int value) {
        Node node = new Node(value);
        if (root == null) {
            root = node;
            return true;
        }

        Node temp = root;
        while (true) {
            if (value == temp.value) {
                return false;
            } else if (value < temp.value) {
                if (temp.left == null) {
                    temp.left = node;
                    return true;
                } else {
                    temp = temp.left;
                }
            } else {
                if (temp.right == null) {
                    temp.right = node;
                    return true;
                } else {
                    temp = temp.right;
                }
            }
        }
    }

    public boolean contains(int value) {
        if(root == null) {
            return false;
        }
        Node temp = root;
        while (true) {
            if(temp.value == value) {
                return true;
            } else if(value < temp.value) {
                if(temp.left == null) {
                    return false;
                }
                temp = temp.left;
            } else {
                if(temp.right == null){
                    return false;
                }

                temp = temp.right;
            }
        }
    }

    public Node getRoot() {
        return root;
    }
}
