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
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head==null){
            return head;
        }
        ListNode current=head;
       ListNode dummy=new ListNode(-1,head);
        ListNode prev=dummy;
        while(current!=null){
            if(current.next!=null && current.val==current.next.val){
                int val=current.val;
               while(current!=null && current.val==val){
                current=current.next;
               }
               prev.next=current;
            }else{
                prev=current;
                current=current.next;
            }
            
        }
        return dummy.next;
    }
}