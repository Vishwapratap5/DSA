package LinkedListImpl;

public class MergeTwoSortedLL {
    public static void main(String[] args) {
        Node head1 = new Node(1);
        Node head2 = new Node(2);
        head1.next=new Node(3);
        head2.next=new Node(4);
        head1.next.next=new Node(5);
        head1.next.next.next=new Node(7);
        head1.next.next.next.next=new Node(9);
        head2.next.next=new Node(6);
        Node head=MergeTwoSortedLL.merge(head1,head2);
        Node current=head;
        while(current!=null){
            System.out.print(current.data +" ");
            current=current.next;
        }
    }

    private static Node merge(Node head1, Node head2) {
        Node curr1 = head1;
        Node curr2 = head2;
        Node dummyHead = new Node(0);
        Node curr = dummyHead;
        while (curr1 != null && curr2 != null) {
          if (curr1.data < curr2.data) {
              curr.next = curr1;
              curr1 = curr1.next;
          }else{
              curr.next = curr2;
              curr2 = curr2.next;
          }
          curr = curr.next;
        }
        if (curr1 != null) {
            curr.next = curr1;
        }
        if (curr2 != null) {
            curr.next = curr2;
        }
        return dummyHead.next;
    }
}
