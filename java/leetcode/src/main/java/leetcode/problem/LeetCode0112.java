package leetcode.problem;

import leetcode.algorithm.TreeNode;

/**
 * Given the root of a binary tree and an integer
 * `targetSum`, return `true` if the tree has a
 * root-to-leaf path such that adding up all the
 * values along the path equals `targetSum`.
 */
public class LeetCode0112 {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) { return false; }
        if (root.getLeft() == null && root.getRight() == null && root.getVal() == sum) {
            return true;
        } else {
            sum = sum - root.getVal();
            return hasPathSum(root.getLeft(), sum) || hasPathSum(root.getRight(), sum);
        }
    }
}