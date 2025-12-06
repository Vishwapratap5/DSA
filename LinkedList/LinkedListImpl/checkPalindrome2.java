package LinkedListImpl;

public class checkPalindrome2 {
    public static void main(String[] args) {
        SNode head = new SNode("M");
        head.next = new SNode("A");
        head.next.next = new SNode("D");
        head.next.next.next = new SNode("A");
        head.next.next.next.next = new SNode("M");
        System.out.println(checkPalindrome2.check(head));

    }

    private static boolean check(SNode head) {
        SNode slow = head;
        SNode fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
       if(fast!=null){
           slow = slow.next;
       }
       SNode secondData=slow;
        SNode curr=secondData;
        SNode prev=null;
        SNode next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        SNode temp1=prev;
        SNode temp2=head;
        while(temp1!=null){
            if(temp1.data!=temp2.data){
                return false;
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return true;
    }
}
