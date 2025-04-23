public class BinaryTreeExample {
    static class TreeNode {
        int data;
        TreeNode left, right;

        TreeNode(int val) {
            data = val;
            left = right = null;
        }
    }

    // Inorder Traversal (Left → Root → Right)
    public static void inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.data + " ");
            inorderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        // Creating the tree
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(24);
        root.right = new TreeNode(36);

        // Traversal Output
        System.out.println("Inorder Traversal of Binary Tree:");
        inorderTraversal(root);  // Output: 24 12 36
    }
}
