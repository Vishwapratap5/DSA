package LinkedListImpl;

import java.util.HashSet;
import java.util.Scanner;

public class DetectLoop1 {
    static Node head;
    static Node tail;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Continue="y";
        do{
            System.out.println("Enter element:");
            int element = sc.nextInt();
            DetectLoop1.add(element);
            System.out.println("Done..! Do you Want to continue?");
            Continue = sc.next();
        }while(Continue.equalsIgnoreCase("y"));
        sc.close();
        DetectLoop1.show();
        System.out.println(DetectLoop1.isLoopPresent());
        DetectLoop1.show();
    }

    private static boolean isLoopPresent() {
        Node current = head;
        HashSet<Node> set=new HashSet<>();
        while(current!=null){
            if(set.contains(current)){
                return true;
            }else{
                set.add(current);
            }
            current = current.next;
        }
        return false;
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
