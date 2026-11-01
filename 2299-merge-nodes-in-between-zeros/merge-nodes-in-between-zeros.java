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
    public ListNode mergeNodes(ListNode head) {
        
        if(head==null || head.next==null){
            return head;
        }

        ListNode  slow=head;
        ListNode  fast=head.next;
        ListNode  dummy=new  ListNode(-1,head);
        ListNode current=dummy;
        int sum=0;
        while(fast!=null){
            sum+=fast.val;

            if(fast.val==0){
               /*  ListNode newNode= new ListNode(sum);
                 current.next=newNode;
                 current=current.next;
                 slow=fast;
                 fast=fast.next;
                 sum=0; */
               
               slow.val = sum;
                slow.next = fast.next;  // Skip the ending zero

                slow = slow.next;

                if (slow == null) {
                    break;
                }

                fast = slow;
                sum = 0;
            }else{
                fast=fast.next;
            }
        }
        return dummy.next;
    }
}