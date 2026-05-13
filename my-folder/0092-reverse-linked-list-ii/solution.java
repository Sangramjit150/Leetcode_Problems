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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null){
            return head;
        }
        if(left==right){
            return head;
        }
        while(left<right){
        int cnt=0;
        ListNode leftNode=null;
        ListNode rightNode=null;
        ListNode temp=head;
        while(temp!=null){
            cnt++;
            if(cnt==left){
                 leftNode=temp;
            }
            else if(cnt==right){
                 rightNode=temp;
            }
            temp=temp.next;
        }
        int t=leftNode.val;
        leftNode.val=rightNode.val;
        rightNode.val=t;
        left++;
        right--;
        }
        return head;
    }
}
