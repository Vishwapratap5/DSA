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
    public ListNode oddEvenList(ListNode head) {
        ListNode oddHead=new ListNode(-1);
        ListNode tempHead1=oddHead;
        ListNode evenHead=new ListNode(-1);
        ListNode tempHead2=evenHead;

        ListNode current=head;
        int size=1;
        while(current!=null){
            if(size%2!=0){
                ListNode temp=current.next;
                oddHead.next=current;
                current.next=null;
                oddHead=oddHead.next;
                current=temp;
            }else{
                ListNode temp=current.next;
                evenHead.next=current;
                current.next=null;
                evenHead=evenHead.next;
                current=temp;
            }
            size++;
        }
        oddHead.next=tempHead2.next;
        return tempHead1.next;
    }
}