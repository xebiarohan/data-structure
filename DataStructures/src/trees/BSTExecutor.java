package trees;

public class BSTExecutor {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(47);
        tree.insert(21);
        tree.insert(76);
        tree.insert(18);
        tree.insert(27);
        tree.insert(52);
        tree.insert(82);
//
//        tree.insert(27);
//
//        System.out.println(tree.getRoot().left.right.value);
//
//        System.out.println(tree.rContains(82));
//
//        tree.delete(52);
//        System.out.println(tree.rContains(52));

//        System.out.println(tree.DFSPreOrder());
//
//        System.out.println(tree.DFSPostOrder());

        tree.kthSmallest(2);
    }
}
