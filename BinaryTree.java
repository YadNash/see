class BinaryTree {
   int data;
    BinaryTree left, right;

    public BinaryTree(int item) {
        data = item;
        left = right = null;
    }

    int getLevelDiff(BinaryTree node) {
        if (node == null)
            return 0;
        return node.data - getLevelDiff(node.left) - getLevelDiff(node.right);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(10);
        tree = new BinaryTree(10);
        tree.left = new BinaryTree(5);
        tree.right = new BinaryTree(15);
        tree.left.left = new BinaryTree(2);
        tree.left.right = new BinaryTree(7);
        tree.right.left = new BinaryTree(12);
        tree.left.right.left = new BinaryTree(8);
        int levelDiff = tree.getLevelDiff(tree);
        System.out.println("Difference between sum of odd and even levelnodes: " + levelDiff);
    }
}