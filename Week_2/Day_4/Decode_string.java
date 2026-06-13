package Week_2.Day_4;
//394. Decode String
//Approach: Stack
//Time Complexity: O(n) where n is the length of the input string s, since we are traversing the string once to decode it.
//Space Complexity: O(n) in the worst case, if the input string contains nested encoded patterns, the stack can grow to hold all the characters and numbers, which takes up space proportional to the length of the input string.

import java.util.Stack;

class Solution {
    public String decodeString(String s) {
        Stack<Integer> numstack = new Stack<>();
        Stack<String> stack = new Stack<>();
        int currentNum = 0; // used to build multi-digit numbers like 10, 100, 123

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // build complete number
            if (c >= '0' && c <= '9') {
                currentNum = currentNum * 10 + (c - '0');
            }

            // when '[' comes, number is complete
            else if (c == '[') {
                numstack.push(currentNum);
                currentNum = 0; // reset for next number
                stack.push("[");
            }

            // decode current block
            else if (c == ']') {
                int num = numstack.pop();
                StringBuilder str = new StringBuilder();
                // collect substring inside matching '['
                while (true) {
                    String top = stack.pop();
                    if (top.equals("[")) {
                        break;
                    }
                    // insert at front because stack pops in reverse order
                    str.insert(0, top);
                }

                String original = str.toString();
                // repeat substring num times
                for (int j = 1; j < num; j++) {
                    str.append(original);
                }
                // push decoded string back
                // important for nested cases like 3[a2[c]]
                stack.push(str.toString());
            }
            // normal letter
            else {
                stack.push(c + "");
            }
        }

        // build final answer from remaining stack
        StringBuilder ans = new StringBuilder();
        while (!stack.isEmpty()) {
            ans.insert(0, stack.pop());
        }
        return ans.toString();
    }
}