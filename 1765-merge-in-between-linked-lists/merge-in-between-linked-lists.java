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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
       
        ListNode start=list1;
        ListNode end=list1;

        int i=0;    
        int j=0;

        while(i<a-1){
            i++;
            start=start.next;
        }

        while(j<=b){
            j++;
            end=end.next;
        }

        ListNode current=list2;

        while(current.next!=null){
            current=current.next;
        }
        start.next=list2;
        current.next=end;
        return list1;
    }
}