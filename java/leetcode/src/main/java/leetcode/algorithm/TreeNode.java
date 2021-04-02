package leetcode.algorithm;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter @Setter @NoArgsConstructor
public class TreeNode {
    private int val;
    private TreeNode left;
    private TreeNode right;
    public TreeNode(int val) { this.val = val; }
}
