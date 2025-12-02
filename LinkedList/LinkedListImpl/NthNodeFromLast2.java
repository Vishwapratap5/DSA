package LinkedListImpl;

import java.util.Scanner;

public class NthNodeFromLast2 {
    static Node head;
    static Node tail;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Continue="y";
        do{
            System.out.println("Enter element:");
            int element = sc.nextInt();
            NthNodeFromLast2.add(element);
            System.out.println("Done..! Do you Want to continue?");
            Continue = sc.next();
        }while(Continue.equalsIgnoreCase("y"));
        sc.close();
        NthNodeFromLast2.show();
        int mid=NthNodeFromLast2.find(3);
        System.out.println(mid);
    }

    private static int find(int pos) {
       Node fast = head;
       Node slow = head;
       int count = 1;
       while(fast.next!=null){
           if(count < pos){
               if(fast==null){
                   return -1;
               }
               fast = fast.next;
               count++;
           }else if(count==pos){
               slow = slow.next;
               fast = fast.next;
           }
       }
       return slow.data;
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
