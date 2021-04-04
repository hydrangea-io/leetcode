package leetcode.problem;

import leetcode.algorithm.TreeNode;

/**
 * Given the root of a binary tree, containing digits from 0 to 9 only.
 * Each root-to-leaf in the tree represents a number.
 * 
 * Return the total sum of all root-to-leaf numbers.
 */
public class LeetCode0129 {

    public int sumNumbers(TreeNode root) {
        int d = maxDepth(root);
        return calcSum(root, 0, d);
    }

    private int calcSum(TreeNode root, int sum, int d) {
        if (root == null) { return 0; }
        if (root.left == null && root.right == null) {
            int totalSum = sum + root.val;
            System.out.println("total sub sum: " + totalSum);
            return sum + root.val;
        }
        int subSum = sum + root.val * (int) Math.pow(10, d);
        return calcSum(root.left, subSum, d-1) + calcSum(root.right, subSum, d-1);
    }

    private int maxDepth(TreeNode root) {
        if (root == null) { return 0; }
        if (root.left == null && root.right == null) { return 0; }
        return Math.max(maxDepth(root.left) + 1, maxDepth(root.right) + 1);
    }
}