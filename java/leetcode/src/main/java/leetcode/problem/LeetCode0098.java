package leetcode.problem;

import leetcode.algorithm.TreeNode;

public class LeetCode0098 {
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (root.left == null && root.right == null) {
            return true;
        }
        boolean isLeftValid;
        if (root.left != null) {
            if (root.left.val <= root.val) {
                isLeftValid = isValidBST(root.left);
            } else {
                return false;
            }
        } else {
            isLeftValid = true;
        }
        boolean isRightValid;
        if (root.right != null) {
            if (root.right.val > root.val) {
                isRightValid = isValidBST(root.right);
            } else {
                return false;
            }
        } else {
            isRightValid = true;
        }
    }
}
