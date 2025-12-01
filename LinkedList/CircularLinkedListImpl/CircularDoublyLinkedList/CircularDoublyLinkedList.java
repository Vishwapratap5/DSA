package CircularLinkedListImpl.CircularDoublyLinkedList;

import java.util.Scanner;

public class CircularDoublyLinkedList {
   static Node head;
    static Node tail;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Continue="y";
        do{
            System.out.println("Enter element:");
            int element = sc.nextInt();
//            CircularDoublyLinkedList.add(element);
            CircularDoublyLinkedList.insertFront(element);
            System.out.println("Done..! Do you Want to continue?");
            Continue = sc.next();
        }while(Continue.equalsIgnoreCase("y"));
        CircularDoublyLinkedList.show();

    }

    private static void insertFront(int element) {
        Node newNode = new Node(element);
        if (head == null) {
            head = newNode;
            tail = newNode;
            head.next=tail;
            tail.next=head;
        }else{
            newNode.next = head;
            newNode.prev=tail;
            head=newNode;
            tail.next=head;
        }
    }

    private static void show() {
        Node temp = head;
        if(temp == null){
            System.out.println("List is empty");
            return;
        }
        do{
            System.out.print(temp.data+" <--> ");
            temp = temp.next;
        }while(temp!=head);
        System.out.println("HEAD");
    }

    private static void add(int element) {
        Node newNode = new Node(element);
        if (head == null) {
            head = newNode;
            tail = newNode;
            head.next = tail;
            tail.prev = head;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            tail.next = head;
            head.prev = tail;
        }
    }
}
