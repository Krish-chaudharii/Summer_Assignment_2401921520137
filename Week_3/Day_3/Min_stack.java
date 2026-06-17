package Week_3.Day_3;
import java.util.Stack;

//155. Min Stack
//Approach: Stack
//Time Complexity: O(1)
//Space Complexity: O(n)

class MinStack {

    Stack<Integer> stk;
    Stack<Integer> min;

    public MinStack() {
        stk = new Stack<>();
        min = new Stack<>();
    }
    
    public void push(int value) {
        stk.push(value);
        
        if(min.isEmpty() || value<=min.peek()){ // noti '<=' and it's not '<' cuz what if i push like 4 then 3 then 1 then 1... but '<' will not push last 1 a causes issue...
            min.push(value);
        }
    }
    
    public void pop() {
        if(!min.isEmpty() && stk.peek().equals(min.peek())) min.pop(); // '==' can cause issue for larger Integer cuz its not working on int, can work for small Integer object.... so write .equals()

        if(!stk.isEmpty()) stk.pop();
    }
    
    public int top() {
        if(!stk.isEmpty()) return stk.peek();
        else return -1;
    }
    
    public int getMin() {
        if(!min.isEmpty()) return min.peek();
        else return 0;
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
