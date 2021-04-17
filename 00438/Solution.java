import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public List<Integer> findAnagrams(String s, String t) {
        int tLen = t.length();
        char[] c = t.toCharArray();
        Arrays.sort(c);
        t = new String(c);
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            int rightBound = i + tLen;
            if (rightBound < s.length()) {
                String part = s.substr(i, rightBound);
                char[] sorted = Arrays.sort(part.toCharArray());
                String sortedStr = new String(sorted);
                if (t.equals(sortedStr)) {
                    ans.add(i);
                }
            }    
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        List<Integer> a1 = s.findAnagrams("cbaebabacd", "abc");
        System.out.println(a1.get(0));
        System.out.println(a1.get(1));
    }
}