package LinkedListImpl;

import java.util.HashSet;
import java.util.Scanner;

public class FloydCycleDetection {
    static Node head;
    static Node tail;
    public static void main(String[] args) {
       head = new Node(10);
       head.next = new Node(20);
       head.next.next = new Node(30);
       head.next.next.next = new Node(40);
        System.out.println(FloydCycleDetection.detect());
    }

    private static boolean detect() {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            slow=slow.next;
            fast=fast.next.next;
            if (fast == slow) {
                return true;
            }
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
