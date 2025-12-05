package LinkedListImpl;

import java.util.HashSet;

public class IntersectionNode {
    public static void main(String[] args) {
        Node head1 = new Node(10);
        head1.next=new Node(15);
        head1.next.next=new Node(20);
        head1.next.next.next=new Node(25);
        head1.next.next.next.next=new Node(30);
        Node head2 = new Node(5);
        head2.next=head1.next.next;
        System.out.println( IntersectionNode.findIntersection(head1,head2));
    }

    private static int findIntersection(Node head1, Node head2) {
        HashSet<Node> set = new HashSet<>();
        Node current = head1;
        while (current != null) {
            set.add(current);
            current = current.next;
        }
        Node current2 = head2;
        while(current2 != null) {
            if (set.contains(current2)) {
                return current2.data;
            }
            current2 = current2.next;
        }
        return -1;
    }
}
