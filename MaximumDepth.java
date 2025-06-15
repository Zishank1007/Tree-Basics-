class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BinaryTree {

    int maxDepth(TreeNode node) {
        if (node == null) return 0;

        int leftDepth = maxDepth(node.left);
        int rightDepth = maxDepth(node.right);

        return 1 + Math.max(leftDepth, rightDepth);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        int depth = tree.maxDepth(root);
        System.out.println("Maximum Depth: " + depth);
    }
}
