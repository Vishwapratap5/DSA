class Solution {

   public ListNode removeNodes(ListNode head) {

       ListNode current=head;
      ListNode reverseHead=reverse(current);
        ListNode dummy=new ListNode(-1);
        dummy.next=reverseHead;
       ListNode prev=dummy;
         current=reverseHead;
        
        // Node prev=reverseHead;
         while(current!=null){
             ListNode temp=current.next;
             
             if(current.val<prev.val){
                 prev.next=temp;
             }else{
                 prev=current;
             }
             current=temp;
         }
         return reverse(dummy.next);
    }

    public ListNode reverse(ListNode head) {

        ListNode prev = null;
        ListNode current = head;

        while (current != null) {

            ListNode next = current.next;

            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
}