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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null)
        return null;
        int count=1;
        ListNode temp=head;
        while(count<=k){
            if(temp==null)
            return head;
            temp=temp.next;
            count++;
        }
        ListNode newHead=reverse(head,temp);
        head.next=reverseKGroup(temp,k);

        return newHead;
    }
    private ListNode reverse(ListNode curr,ListNode tail){
        ListNode prev=null;
        while(curr!=tail){
            ListNode front=curr.next;
            curr.next=prev;
            prev=curr;
            curr=front;
        }
        return prev;
    }
}
