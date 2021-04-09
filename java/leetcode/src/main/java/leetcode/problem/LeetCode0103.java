package leetcode.problem;

import leetcode.algorithm.TreeNode;

import java.util.List;
import java.util.Queue;
import java.util.LinkedList;

/**
 * Binary Tree Zigzag Level Order Traversal.
 */
public class LeetCode0103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        if (root == null) { return result; }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean fromLeft = false; // boolean flag to traverse from left or right
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> list = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                if (fromLeft) { list.add(0, node.val); } else { list.add(node.val); }
                if (node.left != null) { q.offer(node.left); }
                if (node.right != null) { q.offer(node.right); }
            }
            result.add(list);
            fromLeft = !fromLeft;
        }
        return result;
    }
}