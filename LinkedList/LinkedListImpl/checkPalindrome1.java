package LinkedListImpl;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

class SNode{
    String data;
    SNode next;
    SNode(String d){
        data = d;
        next = null;
    }
    public String toString(){
        return (" | data: "+data+ " next: "+next+" | ");
    }
    public boolean equals(SNode n){
        return data.equals(n.data);
    }
}
public class checkPalindrome1 {
    public static void main(String[] args) {
        SNode head = new SNode("M");
        head.next = new SNode("A");
        head.next.next = new SNode("D");
        head.next.next.next = new SNode("A");
        head.next.next.next.next = new SNode("M");
        System.out.println(checkPalindrome1.check(head));

    }

    private static boolean check(SNode head) {
        Stack<String> stack = new Stack<String>();
        SNode current=head;
        while(current!=null){
            stack.push(current.data);
            current=current.next;
        }
        SNode temp=head;
        while(!stack.isEmpty()){
            if(temp.data!=stack.pop()){
                return false;
            }
            temp=temp.next;
        }
        return true;
    }
}

