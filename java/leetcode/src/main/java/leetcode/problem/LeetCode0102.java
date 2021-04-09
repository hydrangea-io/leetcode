package leetcode.problem;

import leetcode.algorithm.TreeNode;

import java.util.Queue;
import java.util.List;
import java.util.LinkedList;

public class LeetCode0102 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();

        if (root == null) return result;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int level = q.size();
            List<Integer> l = new LinkedList<>();
            for (int i = 0; i < level; i++) {
                if (q.peek().left != null) q.offer(q.peek().left);
                if (q.peek().right != null) q.offer(q.peek().right);
                l.add(q.poll().val);
            }
            result.add(l);
        }
        return result;
    }
}