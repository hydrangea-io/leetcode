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
        return calcSum(root, 0);
    }

    private int calcSum(TreeNode root, int sum) {
        if (root == null) { return 0; }
        sum = sum * 10 + root.val;
        if (root.left == null && root.right == null) {
            return sum;
        }
        return calcSum(root.left, sum) + calcSum(root.right, sum);
    }

    public int maxDepth(TreeNode root) {
        if (root == null) { return 0; }
        if (root.left == null && root.right == null) { return 0; }
        return Math.max(maxDepth(root.left) + 1, maxDepth(root.right) + 1);
    }
}