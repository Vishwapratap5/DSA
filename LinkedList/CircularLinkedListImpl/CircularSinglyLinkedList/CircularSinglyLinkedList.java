package CircularLinkedListImpl.CircularSinglyLinkedList;


import java.util.Scanner;

public class CircularSinglyLinkedList {
    static Node head;
    static Node tail;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Continue="y";
        do{
            System.out.println("Enter element:");
            int element = sc.nextInt();
//            CircularSinglyLinkedList.add(element);
            CircularSinglyLinkedList.insertFront(element);
            System.out.println("Done..! Do you Want to continue?");
            Continue = sc.next();
        }while(Continue.equalsIgnoreCase("y"));
        sc.close();
        CircularSinglyLinkedList.show();
        CircularSinglyLinkedList.deleteTail();
        CircularSinglyLinkedList.show();
    }

    private static void deleteTail() {
        if(head==null){
            System.out.println("Empty List");
        }else if(head.next==head){
            head=null;
            tail=null;
        }else{
            Node Current=head;
            while(Current.next!=tail){
                Current=Current.next;
            }
            Current.next=head;
            tail=Current;
        }
    }

    private static void deleteAtPos(int pos) {
        int currentPos=1;
        Node currentNode=head;
        if(pos==1){
            deleteHead();
            return;
        }
        while(currentPos<pos-1 && currentNode.next!=head){
            currentNode=currentNode.next;
            currentPos++;
        }
        Node nodeToDelete=currentNode.next;
        if(nodeToDelete==tail){
            currentNode.next=head;
            tail=currentNode;
            return;
        }
        if (currentNode.next == head) {
            System.out.println("Position out of range");
        }
        else{
            currentNode.next=nodeToDelete.next;
        }


    }

    private static void deleteHead() {
        if(head == null){
            System.out.println("Empty List");
        }else if(head.next ==head){
            head=null;
            tail=null;
        }else{
            head = head.next;
            tail.next = head;
        }
    }

    private static void insertFront(int data) {
        Node node = new Node(data);
        if(head == null){
            head = node;
            tail = node;
            tail.next = head;
        }else{
           node.next = head;
           head = node;
           tail.next=head;
        }
    }

    private static void show() {
        Node current = head;
        if(current==null){
            System.out.println("List is empty");
            return;
        }
        do {
            System.out.print(current.data + " --> ");
            current = current.next;
        } while (current != head);

        System.out.println("HEAD");
    }

    private static void add(int element) {
        Node node = new Node(element);
        if (head == null) {
            head = node;
            tail = node;
            tail.next = head;
        }else{
            tail.next = node;
            node.next = head;
            tail = node;
        }
    }
}
