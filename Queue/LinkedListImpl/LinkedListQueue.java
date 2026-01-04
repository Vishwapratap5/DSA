package LinkedListImpl;

class Node1 {
    int data;
    Node1 next;
    public Node1(int data){
        this.data = data;
        this.next = null;
    }
}
public class LinkedListQueue {
    private Node1 head;
    private Node1 tail;
    int size;
    public LinkedListQueue(){
        head = null;
        tail = null;
        size = 0;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public void enqueue(int data){
        Node1 newNode = new Node1(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return 0;
        }
        int data = head.data;
        head=head.next;
        size--;
        return data;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return 0;
        }
        return head.data;
    }
    public int size(){
        return size;
    }

    public static void main(String[] args) {
        LinkedListQueue queue = new LinkedListQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(9);
        queue.enqueue(10);
        System.out.println(queue.peek());
        System.out.println(queue.size());
        System.out.println(queue.dequeue());
        System.out.println(queue.peek());
        System.out.println(queue.dequeue());
        System.out.println(queue.peek());
        System.out.println(queue.size());
        System.out.println(queue.dequeue());
        System.out.println(queue.peek());
        System.out.println(queue.isEmpty());
    }

}
