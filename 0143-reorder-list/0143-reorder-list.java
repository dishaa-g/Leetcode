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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null) return;
        //finding the middle
        ListNode slow=head,fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        //breaking the list in the middle
        ListNode h2=slow.next;
        slow.next=null;
        //reversing the second half
        ListNode a1=null, a2=h2, next;
        while(a2!=null){
            next=a2.next;
            a2.next=a1;
            a1=a2;
            a2=next;
        }
        h2=a1;
        //merging the two list alternately
        ListNode t1=head,t2=h2;
        while(t2!=null){
           ListNode n1 = t1.next, n2 = t2.next;
            t1.next = t2;
            t2.next = n1;
            t1 = n1;
            t2 = n2; 
        }


    }
}