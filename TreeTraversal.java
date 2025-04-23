public class TreeTraversal {
    static class TreeNode {
        int data;
        TreeNode left, right;

        TreeNode(int val) {
            data = val;
            left = right = null;
        }
    }

    // Inorder Traversal: Left -> Root -> Right
    public static void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    // Preorder Traversal: Root -> Left -> Right
    public static void preorder(TreeNode root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    // Postorder Traversal: Left -> Right -> Root
    public static void postorder(TreeNode root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(24);
        root.right = new TreeNode(36);
        root.left.left = new TreeNode(48);
        root.left.right = new TreeNode(60);

        System.out.println("Inorder Traversal:");
        inorder(root); // Output: 48 24 60 12 36

        System.out.println("\nPreorder Traversal:");
        preorder(root); // Output: 12 24 48 60 36

        System.out.println("\nPostorder Traversal:");
        postorder(root); // Output: 48 60 24 36 12
    }
}
