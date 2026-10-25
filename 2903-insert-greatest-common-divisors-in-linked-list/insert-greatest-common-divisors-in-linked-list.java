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
        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummy = new ListNode(0, head);
        ListNode prev = head;
        ListNode current = head.next;

        while (current != null) {
            int value = gcd(prev.val, current.val);
            ListNode newNode = new ListNode(value);

            prev.next = newNode;
            newNode.next = current;

            prev = current;
            current = current.next;
    }
    return dummy.next; 
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