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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1=reverse(l1);
        ListNode p2=reverse(l2);
        int carry=0;

        ListNode dummy=new ListNode(-1);
        ListNode prev=dummy;

        while(p1!=null || p2!=null){
            int sum=carry;
            if(p1!=null){
                sum+=p1.val;
                p1=p1.next;
            }

            if(p2!=null){
                sum+=p2.val;
                p2=p2.next;
            }

            int digit=sum%10;
            carry=sum/10;

            ListNode newNode=new ListNode(digit);
            prev.next=newNode;
            prev=newNode;
        }
        if(carry > 0) {
            prev.next = new ListNode(carry);
        }
        return reverse(dummy.next);
    }

    public ListNode reverse(ListNode head){
        ListNode current=head;
        ListNode prev=null;

        while(current!=null){
            ListNode nextNode=current.next;
            current.next=prev;
           prev=current;
            current=nextNode;
        }
        return prev;
    }
}