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
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode first=head;
        ListNode second;

        if(fast==null){
            second=slow;
        }else{
            second=slow.next;
        }

        ListNode reversedHead=reverse(second);
        return compareNode(first,reversedHead);

    }

    ListNode reverse(ListNode head){
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

    boolean compareNode(ListNode head1,ListNode head2){
        ListNode current1=head1;
        ListNode current2=head2;

        while(current1!=null && current2!=null){
            if((current1.val!=current2.val)){
                return false;
            }
            current1=current1.next;
            current2=current2.next;
        }
        return true;
    }

}