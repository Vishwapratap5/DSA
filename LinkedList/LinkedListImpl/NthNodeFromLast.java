package LinkedListImpl;

import java.util.Scanner;

public class NthNodeFromLast {
    static Node head;
    static Node tail;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Continue="y";
        do{
            System.out.println("Enter element:");
            int element = sc.nextInt();
            NthNodeFromLast.add(element);
            System.out.println("Done..! Do you Want to continue?");
            Continue = sc.next();
        }while(Continue.equalsIgnoreCase("y"));
        sc.close();
        NthNodeFromLast.show();
        int mid=NthNodeFromLast.find(2);
        System.out.println(mid);
    }

    private static int find(int pos) {
        Node temp = head;
        int count = 1;
        while(temp != null) {
            count++;
            temp = temp.next;
        }
        int Actual_pos=count-pos;
        Node current = head;
        for(int i=1;i<Actual_pos;i++) {
            current = current.next;
        }
        return current.data;
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
