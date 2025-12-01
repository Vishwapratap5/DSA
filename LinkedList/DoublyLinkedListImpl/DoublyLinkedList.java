package DoublyLinkedListImpl;

import java.util.Scanner;

public class DoublyLinkedList {
    static Node head;
    static Node tail=head;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Continue="y";
        do{
            System.out.println("Enter element:");
            int element = sc.nextInt();
            DoublyLinkedList.add(element);
            System.out.println("Done..! Do you Want to continue?");
            Continue = sc.next();
        }while(Continue.equalsIgnoreCase("y"));
        sc.close();
//        DoublyLinkedList.dataReverse(head,tail);
//        DoublyLinkedList.showForward(head);
        DoublyLinkedList.showForward(head);
//        DoublyLinkedList.DeleteHead();
        DoublyLinkedList.DeleteTail();
        DoublyLinkedList.showForward(head);
//        DoublyLinkedList.showBackward(tail);
    }

    private static void DeleteTail() {
        if(tail==head || head==null){
            tail=null;
            head=null;
            return;
        }
        tail = tail.prev;
        tail.next=null;
    }

    private static void DeleteHead() {
        if(head==null){
            return;
        }
        if(head==tail){
            head=null;
            tail=null;
            return;
        }

        head=head.next;
        head.prev=null;

    }

//    private static void show() {
//        Node temp = head;
//        System.out.print("null-->");
//        while (temp != null) {
//            System.out.print(temp.data+" --> ");
//            temp = temp.next;
//        }
//        System.out.print("null");
//    }

    private static void nodeReverse(Node head, Node tail) {
        Node Current=head;
        Node prev=null;

        while(Current!=null) {
            prev=Current.prev;
            Current.prev=Current.next;
            Current.next=prev;
            Current=Current.prev;
        }
        if (prev != null) {
            DoublyLinkedList.head = prev.prev; // new head = old tail
            DoublyLinkedList.tail = prev;      // new tail = old head
        }
    }

  /*  private static void dataReverse(Node head, Node tail) {
        while(head!=tail && head.prev!=tail) {
            int temp = head.data;
            head.data = tail.data;
            tail.data = temp;
            head = head.next;
            tail = tail.prev;
        }
    } */

   /* private static void insertFront(int data) {
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            tail = newNode;
        }else{
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
    }
*/
    private static void showForward(Node head) {
        Node temp = head;
        System.out.println("Forward Traversal:");
        System.out.print("null-->");
        while(temp != null) {
            System.out.print(temp.data+" --> ");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    /*
    private static void showBackward(Node tail) {
        Node temp = tail;
        System.out.println("Backward Traversal:");
        System.out.print("null-->");
        while(temp != null) {
            System.out.print(temp.data+" --> ");
            temp = temp.prev;
        }
        System.out.print("null");
        System.out.println();
    }*/
    private static void add(int element) {
        Node node = new Node(element);
        if (head == null) {
            head = node;
            tail = node;
        }else{
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
    }
}
