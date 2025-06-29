package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

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
        if (root == null) {
            return false;
        }
        Node temp = root;
        while (true) {
            if (temp.value == value) {
                return true;
            } else if (value < temp.value) {
                if (temp.left == null) {
                    return false;
                }
                temp = temp.left;
            } else {
                if (temp.right == null) {
                    return false;
                }

                temp = temp.right;
            }
        }
    }

    public boolean rContains(int value) {
        return rContains(root, value);
    }

    private boolean rContains(Node currentNode, int value) {
        if (currentNode == null) {
            return false;
        } else if (currentNode.value == value) {
            return true;
        } else {
            if (value < currentNode.value) {
                return rContains(currentNode.left, value);
            } else {
                return rContains(currentNode.right, value);
            }
        }
    }

    private Node rInsert(Node currentNode, int value) {
        if (currentNode == null) {
            return new Node(value);
        }

        if (value < currentNode.value) {
            currentNode.left = rInsert(currentNode.left, value);
        } else if (value > currentNode.value) {
            currentNode.right = rInsert(currentNode.right, value);
        }
        return currentNode;
    }

    public void rInsert(int value) {
        if (root == null) {
            root = new Node(value);
        }
        rInsert(root, value);
    }

    private Node rDelete(Node currentNode, int value) {
        if (currentNode == null) {
            return null;
        }
        if (currentNode.value < value) {
            currentNode.right = rDelete(currentNode.right, value);
        } else if (currentNode.value > value) {
            currentNode.left = rDelete(currentNode.left, value);
        } else {
            // here we have to deal with the 4 situations
            // current node is a lead node, current node only has left node, only right node or has both left and right

            if (currentNode.left == null && currentNode.right == null) {
                return null;
            } else if (currentNode.left == null) {
                currentNode = currentNode.right;
            } else if (currentNode.right == null) {
                currentNode = currentNode.left;
            } else {
                int subTreeMin = minValue(currentNode.right);
                currentNode.value = subTreeMin;
                currentNode.right = rDelete(currentNode.right, subTreeMin);
            }
        }

        return currentNode;
    }

    public void delete(int value) {
        rDelete(root, value);
    }

    public int minValue(Node currentNode) {
        while (currentNode.left != null) {
            currentNode = currentNode.left;
        }
        return currentNode.value;
    }

    public Node getRoot() {
        return root;
    }

    public ArrayList<Integer> BFS() {
        Node currentNode = root;
        Queue<Node> queue = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList<>();
        queue.add(currentNode);

        while (!queue.isEmpty()) {
            Node node = queue.remove();
            result.add(node.value);
            if (currentNode.left != null) {
                queue.add(node.left);
            }
            if (currentNode.right != null) {
                queue.add(node.right);
            }
        }
        return result;
    }

    public ArrayList<Integer> DFSPreOrder() {
        ArrayList<Integer> result = new ArrayList<>();

        class Traverse {
            public Traverse(Node currentNode) {
                result.add(currentNode.value);
                if(currentNode.left != null) {
                    new Traverse(currentNode.left);
                }

                if(currentNode.right != null) {
                    new Traverse(currentNode.right);
                }
            }
        }
        new Traverse(root);
        return result;
    }

    public ArrayList<Integer> DFSPostOrder() {
        ArrayList<Integer> result = new ArrayList<>();

        class Traverse {
            public Traverse(Node currentNode) {
                if(currentNode.left !=null) {
                    new Traverse(currentNode.left);
                }

                if(currentNode.right != null) {
                    new Traverse(currentNode.right);
                }

                result.add(currentNode.value);
            }
        }
        new Traverse(root);
        return result;
    }

    public ArrayList<Integer>  DFSInOrder() {
        ArrayList<Integer> result = new ArrayList<>();

        class Traverse {
            public Traverse(Node currentNode) {
                if(currentNode.left !=null) {
                    new Traverse(currentNode.left);
                }

                result.add(currentNode.value);

                if(currentNode.right != null) {
                    new Traverse(currentNode.right);
                }
            }
        }
        new Traverse(root);
        return result;
    }
}
