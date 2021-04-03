package leetcode.problem;

import leetcode.algorithm.ListNode;

public class LeetCode0234 {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }
        if (fast != null) {
            slow = slow.getNext();
        }
        slow = reverse(slow);
        fast = head;

        while (slow != null) {
            if (slow.getVal() != fast.getVal()) {
                return false;
            }
            fast = fast.getNext();
            slow = slow.getNext();
        }
        return true;
    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.getNext();
            head.setNext(prev);
            prev = head;
            head = next;
        }
        return prev;
    }
}