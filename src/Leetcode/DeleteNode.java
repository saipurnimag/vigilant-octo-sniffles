package Leetcode;

public class DeleteNode {
    public TreeNode deleteNode(TreeNode root, int key) {
        //find node
        TreeNode del = findNode(root, key);
        if (del == null) {
            return root;
        }
        // Case 1: del is a leaf
        if (del.left == null && del.right == null) {
            del = null;
        }
        // Case 2: del has only one child left or right
        else if (del.left == null || del.right == null) {
            if (del.left == null) {
                del.val = del.right.val;
                del.right = del.right.right;
                del.left = del.right.left;
            } else {
                del.val = del.left.val;
                del.right = del.left.right;
                del.left = del.left.left;
            }
        }
        // Case : del has both children
        else {
            del.val = del.left.val;

            TreeNode temp = del.right;
            while (temp.left != null) {
                temp = temp.left;
            }
            temp.left = del.left.right;
            del.left = del.left.left;
        }
        return root;
    }

    private TreeNode findNode(TreeNode root, int key) {
        while (root != null) {
            if (key == root.val) {

                return root;
            } else if (key > root.val) {
                root = root.right;
            } else {
                root = root.left;
            }
        }
        return root;
    }
}

