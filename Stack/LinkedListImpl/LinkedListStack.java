public class LinkedListStack {
    Node head;
    Node tail;
    public void push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.prev=null;
        }else{
            tail.next = newNode;
            newNode.prev=tail;
            tail = newNode;
        }
    }
    public int pop() {
        if (head == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        if (head == tail) {
            int temp = head.data;
            head = null;
            tail = null;
            return temp;
        }
        int data=tail.data;
        tail=tail.prev;
        tail.next=null;
        Node.count--;
        return data;
    }
    public int peek() {
        if (head == null) {
            System.out.println("Stack is empty");
            return -1;
        }else{
            return tail.data;
        }
    }
    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }
    public int size() {
        if (head == null) {
            return 0;
        }
        return Node.count;
    }
    public static void main(String[] args) {
        LinkedListStack lsStack = new LinkedListStack();
        lsStack.push(1);
        lsStack.push(2);
        lsStack.push(3);
        System.out.println(lsStack.pop());
        System.out.println(lsStack.peek());
        System.out.println(lsStack.size());
        System.out.println(lsStack.isEmpty());
        System.out.println(lsStack.size());
        System.out.println(lsStack.pop());
        System.out.println(lsStack.pop());
        System.out.println(lsStack.size());
        System.out.println(lsStack.isEmpty());
    }
}
