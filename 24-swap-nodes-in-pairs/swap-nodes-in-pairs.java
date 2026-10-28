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
    public ListNode swapPairs(ListNode head) {

        ListNode dummy = new ListNode(-1, head);
        ListNode prev = dummy;
        ListNode current = head;
        int size = 0;

        while (current != null) {
            size++;

            if (size == 2) {
                ListNode first = prev.next;
                ListNode temp = current.next;

                prev.next = current;
                current.next = first;
                first.next = temp;

                prev = first;
                current = temp;
                size = 0;
            } else {
                current = current.next;
            }
        }

        return dummy.next;
    }
}
