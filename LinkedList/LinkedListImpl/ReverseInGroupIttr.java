package LinkedListImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReverseInGroupIttr {
    static Node head;
    static Node tail;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Continue="y";
        do{
            System.out.println("Enter element:");
            int element = sc.nextInt();
            ReverseInGroupIttr.add(element);
            System.out.println("Done..! Do you Want to continue?");
            Continue = sc.next();
        }while(Continue.equalsIgnoreCase("y"));
        sc.close();
        ReverseInGroupIttr.show();
        head= ReverseInGroupIttr.Revesrse(3);
        ReverseInGroupIttr.show();
    }

    private static Node Revesrse(int range) {
        Node  next=null;
        Node prev=null;
        Node curr=head;
        int count=range;
        Node end=head;
        Node start=head;
        int stepCount=0;
        while(end!=null && end.next!=null) {
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
