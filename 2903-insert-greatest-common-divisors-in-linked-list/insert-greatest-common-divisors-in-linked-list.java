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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode dummy=new ListNode(0,head);
        ListNode current=head;
        ListNode prev=dummy;

        while(current.next!=null){
            int GCD=gcd(current.val,current.next.val);
            ListNode newNode=new ListNode(GCD);
           newNode.next = current.next;
            current.next = newNode;

            current = newNode.next;
        }
        return head;
    }

    public int gcd(int x,int y){
        while(x!=y){
            if(x>y){
                x-=y;
            }else{
                y-=x;
            }
        }
        return x;
    }
}