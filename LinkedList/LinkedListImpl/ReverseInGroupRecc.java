package LinkedListImpl;

import java.util.Scanner;

public class ReverseInGroupRecc {
    static Node head;
    static Node tail;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Continue="y";
        do{
            System.out.println("Enter element:");
            int element = sc.nextInt();
            ReverseInGroupRecc.add(element);
            System.out.println("Done..! Do you Want to continue?");
            Continue = sc.next();
        }while(Continue.equalsIgnoreCase("y"));
        sc.close();
        ReverseInGroupRecc.show();
        head= ReverseInGroupRecc.Revesrse(head,3);
        ReverseInGroupRecc.show();
    }

    private static Node Revesrse(Node head,int range) {
    Node current = head;
    Node prev = null;
    Node next = null;
    if(head==null){
        System.out.println("Nothing to reverse");
        return null;
    }
    int count = 0;
    while(current!=null && count<range){
        next = current.next;
        current.next = prev;
        prev = current;
        current = next;
        count++;
    }
    if(next!=null){
        head.next=Revesrse(next,range);
    }
    return prev;
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

    private static void add(int data) {
        Node node = new Node(data);
        if(head == null) {
            head = node;
            tail = node;
        }else{
            Node current = head;
            while(current.next != null) {
                current= current.next;
            }
            current.next = node;
            tail=node;
        }

    }
}
