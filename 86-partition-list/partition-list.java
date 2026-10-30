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
    public ListNode partition(ListNode head, int x) {
        ListNode current=head;
        ListNode smallNode=new ListNode(-1);
        ListNode temp1=smallNode;
        ListNode greaterNode=new ListNode(-1);
        ListNode temp2=greaterNode;

        if(head==null || head.next==null ){
            return head;
        }
        while(current!=null){

            if(current.val<x){
                ListNode temp=current.next;
                smallNode.next=current;
                current.next=null;
                smallNode=smallNode.next;
                current=temp;
            }else{
                ListNode temp=current.next;
                greaterNode.next=current;
                current.next=null;
                greaterNode=greaterNode.next;
                current=temp;
            }
        }
        if(temp1.next==null){
            head=temp2.next;

        }else{
             head=temp1.next;
            smallNode.next=temp2.next;
        }
        return head;
    }
}