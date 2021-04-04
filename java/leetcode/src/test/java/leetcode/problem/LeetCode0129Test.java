package leetcode.problem;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import leetcode.problem.LeetCode0129;
import leetcode.algorithm.TreeNode;

public class LeetCode0129Test {

    private LeetCode0129 leetcode;
    @BeforeEach
    public void setUp() throws Exception {
        leetcode = new LeetCode0129();
    }

    @Test
    @DisplayName("LeetCode 0129 Test 1.")
    public void test() {
        TreeNode root = new TreeNode(4);
        TreeNode t1 = new TreeNode(9);
        TreeNode t2 = new TreeNode(0);
        TreeNode t3 = new TreeNode(5);
        TreeNode t4 = new TreeNode(1);
        root.left = t1; root.right = t2;
        t1.left = t3; t1.right = t4;
        int sum = leetcode.sumNumbers(root);
        assertEquals(1026, sum);
    }
}