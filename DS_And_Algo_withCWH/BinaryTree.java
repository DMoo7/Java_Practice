import com.sun.source.tree.Tree;

import java.util.Stack;

public class BinaryTree {

    private TreeNode root;

    private class TreeNode {
        private int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    public void createBinaryTree() {

        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);

        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;

    }

    // Recursive preOrder Traversal
    public void preOrder (TreeNode root) {

        if (root == null) {
            return;
        }

        System.out.println(root.data + " preOrder");
        preOrder(root.left);
        preOrder(root.right);
    }

    // Iterative preOrder Traversal using stack
    public void preOrderStack () {

        if (root == null) {
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {

            TreeNode eachNode = stack.pop();
            System.out.println(eachNode.data + " preOrderStack");

            if (eachNode.right != null) {
                stack.push(eachNode.right);
            }

            if (eachNode.left != null) {
                stack.push(eachNode.left);
            }
        }
    }

    // Recursive inOrder Traversal
    public void inOrderRecursive(TreeNode root) {

        if (root == null ) {
            return;
        }

        inOrderRecursive(root.left);
        System.out.println(root.data + " ");
        inOrderRecursive(root.right);
    }

    // Iterative InOrder Traversal
    public void inOrderIterative() {

        if (root == null) {
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode eachNode = root;

        while( !stack.isEmpty() || eachNode != null) {

            if (eachNode.left != null) {
                stack.push(eachNode);
                eachNode = eachNode.left;
            } else {
                eachNode = stack.pop();
                System.out.println(eachNode.data + " ");
                eachNode = eachNode.right;
            }
        }
    }

    // Recursive postOrder Traversal
    public void postOrder(TreeNode root) {

        if (root == null) return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data + " ");
    }

    // Iterative postOrder Traversal
    public void postOrderIterative() {

    }
    public static void main(String[] args) {

        BinaryTree bt = new BinaryTree();
        bt.createBinaryTree();
//        bt.preOrder(bt.root);
        bt.preOrderStack();
    }
}
