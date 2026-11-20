class MinStack {

    Stack<Integer> st;
    Stack<Integer> minimum=new Stack<>();

    int min=Integer.MAX_VALUE;

    public MinStack() {
        st=new Stack<>();        
    }
    
    public void push(int value) {
        if(minimum.isEmpty() || value <= minimum.peek()){
            minimum.push(value);
        }
        st.push(value);
    }
    
    public void pop() {

       if(st.peek().equals(minimum.peek())){
            minimum.pop();
        }

        st.pop();
        
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minimum.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */