package LinkedListImpl;

import java.util.Scanner;

public class RemoveDuplicates {
    static Node head;
    static Node tail;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Continue="y";
        do{
            System.out.println("Enter element:");
            int element = sc.nextInt();
            RemoveDuplicates.add(element);
            System.out.println("Done..! Do you Want to continue?");
            Continue = sc.next();
        }while(Continue.equalsIgnoreCase("y"));
        sc.close();
        RemoveDuplicates.show();
        RemoveDuplicates.RemoveDuplicates();
        RemoveDuplicates.show();
    }

    private static void RemoveDuplicates() {
       Node current = head;
       if(head == null){
           System.out.println("Nothing to remove");
           return;
       }
       while(current!=null &&   current.next!= null){
           if(current.data!=current.next.data){
               current = current.next;
           }
           else{
               current.next = current.next.next;
           }

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
