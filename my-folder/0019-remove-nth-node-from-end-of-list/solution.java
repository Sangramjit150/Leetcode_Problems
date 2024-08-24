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
      ListNode first=head;
      for(int i=0;i<n;i++){
        first=first.next;
      }
      if(first==null)
      return head.next;
      ListNode slow=head;
      while(first.next!=null){
        first=first.next;
        slow=slow.next;
      }
      ListNode delNode=slow.next;
      slow.next=slow.next.next;
      return head;
    }
}
