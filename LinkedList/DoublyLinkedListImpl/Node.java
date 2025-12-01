package DoublyLinkedListImpl;

public class Node {
    int data;
    Node next;
    Node prev;
    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public String toString(){
        return" | prev:" + prev + ": data:" + data +" : next:" + next+ " | " ;
    }

}
