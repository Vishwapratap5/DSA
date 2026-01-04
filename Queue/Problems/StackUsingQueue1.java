package Problems;

import java.util.ArrayDeque;
import java.util.Queue;

public class StackUsingQueue1 {
    Queue<Integer> q1=new ArrayDeque<Integer>();
    Queue<Integer> q2=new ArrayDeque<>();

    public void push(int x) {
        q1.offer(x);
    }
    public int pop() {
        int x;
        if(q1.isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        while(q1.size()>1){
            x=q1.poll();
            q2.offer(x);
        }
        int data=q1.poll();
        while(q2.size()!=0){
            x=q2.poll();
            q1.offer(x);
        }
        return data;
    }

    public int peek() {
        int x;
        if(q1.isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        while(q1.size()>1){
            x=q1.poll();
            q2.offer(x);
        }
        int data=q1.poll();
        q2.offer(data);
        while(q2.size()!=0){
            x=q2.poll();
            q1.offer(x);
        }
        return data;

    }

    public static void main(String[] args) {
        StackUsingQueue1 s=new StackUsingQueue1();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.peek());
    }

}
