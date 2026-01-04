package LinkedListImpl;

public class SagregateLL {
    static Node tail;
    public static void main(String[] args) {
        Node MainHead=null;
        MainHead=SagregateLL.add(MainHead,10);
        SagregateLL.add(MainHead,2) ;
        SagregateLL.add(MainHead,8) ;
        SagregateLL.add(MainHead,4) ;
        SagregateLL.add(MainHead,15) ;
        SagregateLL.add(MainHead,10) ;
        MainHead=SagregateLL.sagregate(MainHead);
        SagregateLL.show(MainHead);

    }

    private static Node sagregate(Node mainHead) {

        Node evenHead = null, evenTail = null;
        Node oddHead = null, oddTail = null;

        Node current = mainHead;

        while (current != null) {

            // Create new Node1 (your approach)
            Node node = new Node(current.data);

            if (current.data % 2 == 0) {     // EVEN

                if (evenHead == null) {
                    evenHead = node;
                    evenTail = node;
                } else {
                    evenTail.next = node;
                    evenTail = node;
                }

            } else {                       // ODD

                if (oddHead == null) {
                    oddHead = node;
                    oddTail = node;
                } else {
                    oddTail.next = node;
                    oddTail = node;
                }
            }

            current = current.next;
        }

        // edge cases
        if (evenHead == null) return oddHead;
        if (oddHead == null) return evenHead;

        // connect even list → odd list
        evenTail.next = oddHead;

        return evenHead;
    }


    private static Node add(Node head,int data) {
        Node node = new Node(data);
        if(head == null) {
            head = node;
            tail = node;
        }else{
            tail.next = node;
            tail = node;
        }
    return head;
    }
    private static void show(Node head) {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+" --> ");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
}
