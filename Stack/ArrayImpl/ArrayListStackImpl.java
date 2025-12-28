import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListStackImpl {
    int size = 0;
    ArrayList<Integer> list = new ArrayList();
    int top=-1;

    public void push(int value) {
        top++;
        list.add(value);
    }
    public int pop() {
        if(top==-1){
            System.out.println("Stack is Empty");
            return -1;
        }
        int topValue=(int)list.get(top);
        list.remove(top);
        top--;
        return topValue;
    }
    public int peek() {
        if(top==-1){
            System.out.println("Stack is Empty");
            return -1;
        }
        return (int)list.get(top);
    }
    public boolean isEmpty() {
        return top==-1;
    }
    public int size() {
        return top+1;
    }
    public void printStack() {
        Iterator it = list.iterator();
        while(it.hasNext()) {
            System.out.print(it.next());
        }
    }
    @Override
    public String toString(){
        return (top==-1)?"Stack is empty":"size = " + size + ", top = " + top +", peek: "+ list.get(top);
    }
    public static void main(String[] args) {
        ArrayListStackImpl stack = new ArrayListStackImpl();

        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.printStack();
        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack);
    }
}
