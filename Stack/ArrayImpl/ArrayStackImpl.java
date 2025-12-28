public class ArrayStackImpl {
    int[] stackArray;
    int top;
    int size;
    public ArrayStackImpl(int size) {
        this.size = size;
        stackArray = new int[size];
        top = -1;
    }
    public void push(int value) {
        if(top == size - 1) {
            System.out.println("Stack is full");
            return;
        }
        stackArray[++top] = value;
        System.out.println("Pushed: " + value);
    }
    public void showStack() {
        System.out.print("[ ");
        for(int x: stackArray) {
            if(x==0){
                break;
            }
            System.out.print(x+", ");
        }
        System.out.print("]");
    }
    public int pop() {
        if(top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        int topValue = stackArray[top];
        stackArray[top]=0;
        top--;
        System.out.println("Popped: " + topValue);
       return  topValue;
    }
    public int peek() {
        if(top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stackArray[top];
    }
    public int size() {
        return top+1;
    }
    public boolean isEmpty() {
        return top == -1;
    }
    @Override
    public String toString(){
        return (top==-1)?"Stack is empty":"size = " + size + ", top = " + top +", peek: "+ stackArray[top];
    }
    public static void main(String[] args) {
        ArrayStackImpl stack = new ArrayStackImpl(5);
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        stack.push(6);
        stack.pop();
        stack.pop();
       stack.pop();
        System.out.println(stack);
        stack.showStack();
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
    }
}
