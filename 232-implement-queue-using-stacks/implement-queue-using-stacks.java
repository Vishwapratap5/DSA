class MyQueue {

    Stack<Integer> st;
    Stack<Integer> temp=new Stack<>();

    public MyQueue() {
        st=new Stack<>();
    }
    
    public void push(int x) {
        st.push(x);
    }
    
    public int pop() {

        while (!st.isEmpty()) {
      temp.push(st.pop());
    }
    int rem = -1;
    if(!temp.isEmpty()){
        rem = temp.pop();
    }
    while (!temp.isEmpty()) {
      st.push(temp.pop());
    }
        return rem;
    }
    
    public int peek() {
         while (!st.isEmpty()) {
      temp.push(st.pop());
    }
    int peek = -1;
    if(!temp.isEmpty()){
        peek = temp.peek();
    }
    while (!temp.isEmpty()) {
      st.push(temp.pop());
    }
        return peek;
    }
    
    public boolean empty() {
        return st.isEmpty();
    }

}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */