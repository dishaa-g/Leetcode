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
    public static ListNode reverse(ListNode head){
        if(head==null || head.next==null) return head;
        ListNode prev=null, current=head;
        while(current !=null){
            ListNode nextNode=current.next;
            current.next=prev;
            prev=current;
            current=nextNode;
        }
        return prev;
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode newHead = reverse(slow.next);
        ListNode secondHalf = newHead;
        ListNode firstHalf = head;

        while(secondHalf!=null){
            if(firstHalf.val!=secondHalf.val){
                head= reverse(newHead);
                return false;
            }
            firstHalf= firstHalf.next;
            secondHalf= secondHalf.next;
        }
        reverse(newHead);
        return true;
    }
}
