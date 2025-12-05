package LinkedListImpl;

import java.util.HashSet;

public class IntersectionNode2 {
    public static void main(String[] args) {
        Node head1 = new Node(10);
        head1.next=new Node(15);
        head1.next.next=new Node(20);
        head1.next.next.next=new Node(25);
        head1.next.next.next.next=new Node(30);
        Node head2 = new Node(5);
        head2.next=head1.next.next;
        System.out.println( IntersectionNode2.findIntersection(head1,head2));
    }

    private static int findIntersection(Node head1, Node head2) {
        Node current = head1;
        int count1 = 0;
        int count2 = 0;
        while (current != null) {
           count1++;
           current = current.next;
        }
        Node current2 = head2;
        while(current2 != null) {
           count2++;
           current2 = current2.next;
        }
        Node LongList=(count1>count2)?head1:head2;
        int difference=(count1>count2)?count1-count2:count2-count1;
        Node currentList=LongList;
        while(difference>0) {
            difference--;
            currentList=currentList.next;
        }
        Node l1=currentList;
        Node l2=head2;
        while(l1!=null && l2!=null) {
            if(l1==l2) {
                return l1.data;
            }
            l1=l1.next;
            l2=l2.next;
        }
        return -1;
    }
}
