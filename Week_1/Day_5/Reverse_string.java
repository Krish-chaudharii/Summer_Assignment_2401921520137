package Week_1.Day_5;

// 344. Reverse String
// Approach: Two Pointers
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public void reverseString(char[] s) {
        int back=s.length-1;
        for(int i=0; i<s.length/2; i++,back--){
            char t= s[i];
            s[i]=s[back];
            s[back]=t;
        }
    }
}