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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || head.next==null) return null;
        ListNode temp=head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        if(n == size) {
            return head.next;
        }
        int k=size-n;
        temp=head;
        for(int i=1;i<k;i++){
            temp=temp.next;
        }
        if(temp.next!=null){
        temp.next=temp.next.next;
        }
        return head;
    }
}