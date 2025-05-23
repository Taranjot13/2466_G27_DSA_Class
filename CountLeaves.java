public class CountLeaves {
    static class TreeNode {
        int data;
        TreeNode left, right;

        TreeNode(int val) {
            data = val;
            left = right = null;
        }
    }

    // Function to count leaf nodes
    public static int countLeaves(TreeNode root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 1;
        return countLeaves(root.left) + countLeaves(root.right);
    }

    public static void main(String[] args) {
        // Building the tree
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(24);
        root.right = new TreeNode(36);

        // Output
        System.out.println("Number of Leaves in Binary Tree is: " + countLeaves(root));
    }
}
