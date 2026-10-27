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
        
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=head;
        ListNode current=head;
        int n=0;

        while(current!=null){
            n++;
            current=current.next;
        }
        if(n==0){
            return null;
        }
        k=(k%n);
        if(k==0){
            return head;
        }

        for(int i=1;i<k;i++){
            fast=fast.next;
            if(fast==null){
                return null;
            }
        }
        while(fast.next!=null){
            fast=fast.next;
            prev=slow;
            slow=slow.next;
        }
        prev.next=null;
        fast.next=head;
        head=slow;
        return head;
    }
}