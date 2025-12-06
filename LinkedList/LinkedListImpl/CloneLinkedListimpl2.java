package LinkedListImpl;

public class CloneLinkedListimpl2 {
    static cloneNode tail;
    static cloneNode head;
    public static void main(String[] args) {
        cloneNode A = new cloneNode(7);
        cloneNode B = new cloneNode(13);
        cloneNode C = new cloneNode(11);
        cloneNode D = new cloneNode(10);
        cloneNode E = new cloneNode(1);

// next pointers
        A.next = B;
        B.next = C;
        C.next = D;
        D.next = E;

// random pointers
        A.random = null;
        B.random = A;
        C.random = E;
        D.random = C;
        E.random = A;

        cloneNode head = A;
        CloneLinkedListimpl2.show(head);
        cloneNode cloneHead= CloneLinkedListimpl2.clone(head);
        System.out.println();
        CloneLinkedListimpl2.show(cloneHead);
    }

    private static cloneNode clone(cloneNode head) {
       cloneNode current=head;
       while(current!=null){
           cloneNode newNode=new cloneNode(current.data);
           newNode.next=current.next;
           current.next=newNode;
           current=newNode.next;
       }
       cloneNode temp=head;
       while(temp!=null){
           if(temp.random!=null){
               temp.next.random=temp.random.next;
           }
           temp=temp.next.next;
       }
       cloneNode temp2=head;
       cloneNode clone=head.next;
       cloneNode cloneHead=clone;
       while(temp2!=null){
           temp2.next=temp2.next.next;
           if(clone.next!=null){
               clone.next=clone.next.next;
           }
           temp2=temp2.next;
           clone=clone.next;
       }
       return cloneHead;
    }
    private static void show(cloneNode head) {
        cloneNode curr = head;

        while (curr != null) {
            int randomData = (curr.random != null) ? curr.random.data : -1;

            System.out.print(" | Node: " + curr.data +
                    " :: Random: " + randomData+ ":: hashcode: "+curr.hashCode()+" | -->");

            curr = curr.next;
        }
    }
}
