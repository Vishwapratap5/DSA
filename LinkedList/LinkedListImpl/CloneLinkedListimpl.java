package LinkedListImpl;

import java.util.HashMap;

public class CloneLinkedListimpl {
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
        CloneLinkedListimpl.show(head);
        cloneNode cloneHead= CloneLinkedListimpl.clone(head);
        System.out.println();
        CloneLinkedListimpl.show(cloneHead);
    }

    private static cloneNode clone(cloneNode head) {
        HashMap<cloneNode,cloneNode> map=new HashMap<cloneNode,cloneNode>();
        cloneNode current = head;
        while (current != null) {
            map.put(current,new cloneNode(current.data));
            current = current.next;
        }

        cloneNode temp=head;
        while(temp!=null) {
            cloneNode clone=map.get(temp);
            clone.next = map.get(temp.next);
            clone.random=map.get(temp.random);
            temp=temp.next;
        }

        return map.get(head);
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

