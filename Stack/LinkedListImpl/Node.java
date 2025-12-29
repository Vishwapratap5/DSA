public class Node {
    int data;
    Node next;
    Node prev;
    static int count;
    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
        count++;
    }

    public String toString() {
        return "Node[ data: " + data +" ]";
    }
}
