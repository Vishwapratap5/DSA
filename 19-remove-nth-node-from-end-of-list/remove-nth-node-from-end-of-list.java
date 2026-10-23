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
       ListNode current=head;
       int size=1;

       while(current.next!=null){
        current=current.next;
        size++;
       }
    int p=size-n+1;
    return remove(head,p);
       
    }

   public ListNode remove(ListNode head,int p){
        if(head==null){
            return head;
        }
        
        if(p<=1){
            return head.next;
        }
        ListNode current=head;

        for(int i=1;i<p-1;i++){
            current=current.next;
        }
        current.next=current.next.next;
        return head;
    }
}