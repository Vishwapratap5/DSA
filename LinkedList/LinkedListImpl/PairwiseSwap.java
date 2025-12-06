package LinkedListImpl;

import java.util.Scanner;

public class PairwiseSwap {
    static Node tail;
    static Node head;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Continue="y";
        do{
            System.out.println("Enter element:");
            int element = sc.nextInt();
            PairwiseSwap.add(element);
            System.out.println("Done..! Do you Want to continue?");
            Continue = sc.next();
        }while(Continue.equalsIgnoreCase("y"));
        sc.close();
        PairwiseSwap.show();
        PairwiseSwap.swap();
        PairwiseSwap.show();
    }

    private static void swap() {
       Node dummy=new Node(0);
       dummy.next=head;
       Node prev=dummy;
       while(prev.next!=null && prev.next.next!=null){
           Node a=prev.next;
           Node b=prev.next.next;
           a.next=b.next;
           b.next=a;
           prev.next=b;
           prev=a;
       }
       head=dummy.next;
    }

    private static void add(int data) {
        Node node = new Node(data);
        if(head == null) {
            head = node;
            tail = node;
        }else{
            tail.next = node;
            tail = node;
        }
    }
    private static void show() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+" --> ");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
}
