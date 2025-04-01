class MinStack {
     Deque<Integer> st = new ArrayDeque<>();
    Deque<Integer> min = new ArrayDeque<>();

    public MinStack() {  
    min.push(Integer.MAX_VALUE);
    }
    
    public void push(int val) {
        st.push(val);
        min.push(Math.min(val,min.peek()));
    }
    
    public void pop() {
        st.pop();
        min.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */