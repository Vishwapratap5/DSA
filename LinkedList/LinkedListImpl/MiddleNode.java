package LinkedListImpl;

import java.util.Scanner;

public class MiddleNode {
    static Node head;
    static Node tail;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Continue="y";
        do{
            System.out.println("Enter element:");
            int element = sc.nextInt();
            MiddleNode.add(element);
            System.out.println("Done..! Do you Want to continue?");
            Continue = sc.next();
        }while(Continue.equalsIgnoreCase("y"));
        sc.close();
        MiddleNode.show();
        int mid=MiddleNode.findMiddle();
        System.out.println(mid);
    }

    private static int findMiddle() {
        Node current = head;
        int counter = 1;
        while (current.next != null) {
            counter++;
            current = current.next;
        }
        int mid=counter/2;
        Node temp = head;
        for(int i=0;i<mid;i++){
            temp = temp.next;
        }
        return temp.data;
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
