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


// import java.util.Scanner;

// class TreeNode {
//     int data;
//     TreeNode left;
//     TreeNode right;

//     public TreeNode(int data) {
//         this.data = data;
//         this.left = null;
//         this.right = null;
//     }
// }

// class BinaryTree {
//     TreeNode root;

//     public BinaryTree() {
//         root = null;
//     }

//     // Recursive function to insert a node into the binary tree.
//     private TreeNode insert(TreeNode node, int data) {
//         if (node == null) {
//             return new TreeNode(data);
//         }

//         if (data < node.data) {
//             node.left = insert(node.left, data);
//         } else if (data > node.data) {
//             node.right = insert(node.right, data);
//         }

//         return node;
//     }

//     // Function to insert a new node into the binary tree.
//     public void insert(int data) {
//         root = insert(root, data);
//     }

//     // Recursive function to calculate the sum of nodes at odd and even levels.
//     private void calculateSums(TreeNode node, int level, int[] sums) {
//         if (node == null) {
//             return;
//         }

//         if (level % 2 == 0) {
//             // Even level
//             sums[1] += node.data;
//         } else {
//             // Odd level
//             sums[0] += node.data;
//         }

//         // Recursively calculate sums for left and right subtrees.
//         calculateSums(node.left, level + 1, sums);
//         calculateSums(node.right, level + 1, sums);
//     }

//     // Function to calculate the difference between the sum of odd and even level nodes.
//     public int calculateLevelDifference() {
//         int[] sums = new int[2]; // 0 index for odd level, 1 index for even level
//         calculateSums(root, 1, sums);
//         return sums[0] - sums[1];
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         BinaryTree tree = new BinaryTree();

//         System.out.print("Enter the number of nodes in the binary tree: ");
//         int n = scanner.nextInt();

//         System.out.println("Enter the values of the nodes:");
//         for (int i = 0; i < n; i++) {
//             int data = scanner.nextInt();
//             tree.insert(data);
//         }

//         int levelDifference = tree.calculateLevelDifference();
//         System.out.println("Difference between the sum of odd and even level nodes: " + levelDifference);
//     }
// }
