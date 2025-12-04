package LinkedListImpl;

public class DetectAndRemoveCycle {
    static Node head;
    static Node tail;
    public static void main(String[] args) {
        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = head;
        System.out.println(DetectAndRemoveCycle.detectAndRemove());
        DetectAndRemoveCycle.show();
    }

    private static String detectAndRemove() {
        Node fast = head;
        Node slow = head;
        while(fast!=null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                break;
            }
        }
        if(slow!=fast){
            return "no loop detected";
        }else{
            slow=head;
            while(slow.next!=fast.next){
                slow = slow.next;
                fast = fast.next;
            }
            Node ptr=fast;
            while(ptr.next!=slow){
                ptr = ptr.next;
            }
            ptr.next=null;
            fast=ptr;
        }
        return "Detected & Removed Cycle";
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
