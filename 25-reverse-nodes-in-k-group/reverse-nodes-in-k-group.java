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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy=new ListNode(-1);
        ListNode res=dummy;
        int size=0;
        
        
        
        if(head==null || head.next==null){
            return head;
        }
      
        ListNode p1=head;
        ListNode p2=head;
        ListNode temp=null;
        
        while(p2!=null){
            size++;
            if(size<k){
             p2=p2.next;   
            }else if(size==k){
                temp=p2.next;
                p2.next=null;
                ListNode reversedHead=reverse(p1);
                res.next=reversedHead;
                ListNode current=reversedHead;
                
                while(current.next!=null){
                    current=current.next;
                }
                res=current;
                p1=temp;
                p2=temp;
                size=0;
            }
        }
        
        if(size<k){
            res.next=temp;
        }
    
        return dummy.next;
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