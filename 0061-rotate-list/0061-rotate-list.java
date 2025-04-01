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
    public ListNode rotateRight(ListNode head, int k) {
        if(k==0 || head== null || head.next==null) {
            return head;
        }
        ListNode curr= head;
        int length=1;
        while(curr.next!=null){
            curr=curr.next;
            length++;
        }
        curr.next=head;
        int n= length- (k%length);
        for(int i=0;i<n;i++){
            curr=curr.next;
        }
        head=curr.next;
        curr.next=null;
        return head;
    }
}