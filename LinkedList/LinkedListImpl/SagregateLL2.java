package LinkedListImpl;

public class SagregateLL2 {
    static Node tail;
    public static void main(String[] args) {
        Node MainHead=null;
        MainHead=SagregateLL2.add(MainHead,10);
        SagregateLL2.add(MainHead,2) ;
        SagregateLL2.add(MainHead,8) ;
        SagregateLL2.add(MainHead,4) ;
        SagregateLL2.add(MainHead,15) ;
        SagregateLL2.add(MainHead,10) ;
        MainHead=SagregateLL2.sagregate(MainHead);
        SagregateLL2.show(MainHead);
    }

    private static Node sagregate(Node node) {
        Node CurrentNode=node;
        Node evenTail=null;
        Node oddTail=null;
        Node evenHead=null;
        Node oddHead=null;
        Node Next=node;
        while(Next!=null) {
            Next=CurrentNode.next;
            CurrentNode.next=null;
            if(CurrentNode.data%2==0){
                if(evenHead==null) {
                    evenHead=CurrentNode;
                    evenTail=CurrentNode;
                }else{
                    evenTail.next=CurrentNode;
                    evenTail=CurrentNode;
                }
            }else{
                if(oddHead==null) {
                    oddHead=CurrentNode;
                    oddTail=CurrentNode;
                }else{
                    oddTail.next=CurrentNode;
                    oddTail=CurrentNode;
                }
            }
            CurrentNode=Next;
        }
        if(evenHead==null) {
            return oddHead;
        }else if(oddHead==null) {
            return evenHead;
        }
        evenTail.next=oddHead;
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
