package LinkedListImpl;

import java.util.Scanner;
public class SortedInsert {
    static Node head;
    static Node tail;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Continue="y";
        do{
            System.out.println("Enter element:");
            int element = sc.nextInt();
            SortedInsert.add(element);
            System.out.println("Done..! Do you Want to continue?");
            Continue = sc.next();
        }while(Continue.equalsIgnoreCase("y"));
        sc.close();
        SortedInsert.show();
    }

    private static void show() {
        if(head==null){
            System.out.println("Nothing to show");
        }else{
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" --> ");
                temp = temp.next;
            }
        }
    }

    private static void add(int element) {
        Node newNode = new Node(element);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
    }
}
