/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        // Step 1: Find the middle of the linked list
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half of the linked list
        ListNode secondHalf = reverseList(slow);
        ListNode firstHalf = head;
        ListNode temp = secondHalf; // Keep track of reversed half to restore later

        // Step 3: Compare both halves
        boolean isPalin = true;
        while (temp != null) {
            if (firstHalf.val != temp.val) {
                isPalin = false;
                break;
            }
            firstHalf = firstHalf.next;
            temp = temp.next;
        }

        // Step 4: Restore the list (optional)
        reverseList(secondHalf);

        return isPalin;
    }

    private ListNode reverseList(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
