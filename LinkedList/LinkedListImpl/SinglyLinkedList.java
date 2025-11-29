package LinkedListImpl;
import java.util.Scanner;
public class SinglyLinkedList {
    static Node head;
    static Node tail;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Continue="y";
        do{
            System.out.println("Enter element:");
            int element = sc.nextInt();
            SinglyLinkedList.add(element);
            System.out.println("Done..! Do you Want to continue?");
            Continue = sc.next();
        }while(Continue.equalsIgnoreCase("y"));
        sc.close();
//        SinglyLinkedList.show();
//        SinglyLinkedList.delete(20);
//        SinglyLinkedList.show();
//        SinglyLinkedList.insertFront(5);
//        SinglyLinkedList.show();
//        SinglyLinkedList.insertAtPos(3,35);
//        SinglyLinkedList.deleteHead();
//        SinglyLinkedList.show();
//        SinglyLinkedList.deleteTail();
//        SinglyLinkedList.show();
//        SinglyLinkedList.deleteAtPos(3);
//        SinglyLinkedList.show();
//        int result= SinglyLinkedList.search(30);
//        System.out.println(result);
        int result1= SinglyLinkedList.reccSearch(30,head);
        System.out.println(result1);
    }
    static int rpos=1;
    private static int reccSearch(int target,Node node) {
        if(node==null){
            return -1;
        }
        if(node.data==target){
            return rpos;
        }else{
            rpos++;
        }
        return reccSearch(target,node.next);
    }

    private static int search(int target) {
        Node current = head;
        int position=1;
        if(head == null){
            return -1;
        }
        while(current != null){
            if(current.data==target){
                return position;
            }else{
                position++;
                current = current.next;
            }
        }
        return -1;
    }

    private static void deleteAtPos(int pos) {
        int countPos=1;
        Node current=head;
        if(head==null){
            System.out.println("Empty List");
            return;
        }
        if(pos==1){
           head=head.next;
           return;
        }
        while(countPos<pos-1 && current!=null){
            current=current.next;
            countPos++;
        }
        if(current==null){
            System.out.println("Invalid Position");
        }else{
            current.next=current.next.next;
        }

    }

    private static void deleteHead() {
        if(head == null){
            System.out.println("List is already empty");
        }else{
            head = head.next;
        }
    }
    private static void deleteTail() {
        if(head.next == null){
            head = null;
            return;
        }
        if(head == null){
            System.out.println("List is already empty");
        }else{
            Node temp = head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=null;
        }
    }

    private static void insertAtPos(int pos, int data) {
        int countPos=1;
        Node current=head;
        if(pos==1){
            insertFront(data);
            return;
        }
        if(head==null){
            System.out.println("Empty List");
            return;
        }
        Node newNode=new Node(data);
        while(countPos<pos-1 && current!=null){
            current=current.next;
            countPos++;
        }
        if(current==null){
            System.out.println("Invalid Position");
        }else{
           current.next=newNode;
           newNode.next=current.next;
        }

    }

    private static void insertFront(int data) {
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }

    }

    private static void delete(int i) {
        Node current = head;
        if(head.data == i){
            head = head.next;
        }else{
            while(current.next != null) {
                if(current.next.data == i){
                   current.next = current.next.next;
                }
                current = current.next;
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
