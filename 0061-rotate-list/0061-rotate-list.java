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
        // list ka length nikalne
        while(curr.next!=null){
            curr=curr.next;
            length++;
        }
        //idhr last node ko first node se connect krdiya 
        curr.next=head;
        // number of skips calculate krne
        int n= length- (k%length);
        for(int i=0;i<n;i++){
            curr=curr.next;
        }
        //loop me jaha tk skip krna tha vha tk krke next node ko head banadiya by putting null in the last node's address
        head=curr.next;
        curr.next=null;
        return head;
    }
}