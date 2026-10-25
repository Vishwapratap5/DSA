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
    public ListNode deleteMiddle(ListNode head) {
        int size=0;
        ListNode current=head;

        while(current!=null){
            size++;
            current=current.next;
        }
        if(size==1){
            return null;
        }
        current=head;
        for(int i=1;i<size/2;i++){
            current=current.next;
        }
        current.next=current.next.next;
        return head;
    }

}