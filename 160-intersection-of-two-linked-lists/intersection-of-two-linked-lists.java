/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode head1, ListNode head2) {
        int n1=0;
        int n2=0;

       ListNode current1=head1;
        ListNode current2=head2;


        while(current1!=null){
            n1++;
            current1=current1.next;
        }

         while(current2!=null){
            n2++;
            current2=current2.next;
        }

        current1=head1;
        current2=head2;

        if(n1>n2){
            int diff=Math.abs(n1-n2);

            for(int i=0;i<diff;i++){
                current1=current1.next;
            }
        }else{
            int diff=Math.abs(n2-n1);

            for(int i=0;i<diff;i++){
                current2=current2.next;
            }
        }

        while(current1!=null && current2!=null){
            if(current1==current2){
                return current1;
            }
            current1=current1.next;
            current2=current2.next;
        }

        return null;
    }
}