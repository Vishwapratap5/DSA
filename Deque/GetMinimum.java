import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class GetMinimum {
    Deque<Integer> dq;
    Queue<Integer> q;
    public GetMinimum() {
        dq = new ArrayDeque<>();
        q = new ArrayDeque<>();
    }
    public void enqueue(int x) {
        q.offer(x);

        while(!dq.isEmpty() && dq.peekLast()>x){
            dq.pollLast();
        }
        dq.addLast(x);
    }
    public int dequeue() {
        if(q.isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int x = q.poll();
        if(dq.peekFirst()==x){
            dq.pollFirst();
        }
        return x;
    }
    public int getMin() {
        if(q.isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return dq.peekFirst();
    }
    public static void main(String[] args) {
        GetMinimum gm = new GetMinimum();
        gm.enqueue(4);
        gm.enqueue(2);
        gm.enqueue(1);
        gm.enqueue(6);
        System.out.println(gm.getMin());
        System.out.println(gm.dequeue());
        System.out.println(gm.getMin());
        System.out.println(gm.dequeue());
        System.out.println(gm.getMin());
        System.out.println(gm.dequeue());
        System.out.println(gm.getMin());

    }
}
