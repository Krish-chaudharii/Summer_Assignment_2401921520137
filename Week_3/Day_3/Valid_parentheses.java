package Week_3.Day_3;
import java.util.Stack;
//20. Valid Parentheses
//Approach: Stack
//Time Complexity: O(n)
//Space Complexity: O(n)

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);

            if(c=='(' || c=='[' || c=='{') stk.push(c);
            else if(!stk.isEmpty()){ //"){"
                if(c==')'){
                    if(stk.peek()=='(') stk.pop();
                    else return false;
                }
                else if(c==']'){
                    if(stk.peek()=='[') stk.pop();
                    else return false;
                }
                else if(c=='}'){
                    if(stk.peek()=='{') stk.pop();
                    else return false;
                }
            }
            else return false; //"){"
        }

        if(stk.isEmpty()) //"((","["
            return true;
        else return false;
    }
}