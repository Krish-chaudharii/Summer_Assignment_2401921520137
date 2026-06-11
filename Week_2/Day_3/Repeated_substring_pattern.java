package Week_2.Day_3;
// 459. Repeated Substring Pattern
// Approach: Brute Force
// Time Complexity: O(n^2) in the worst case when the string is made of repeated characters, as we check all possible substring lengths and compare them with the original string.
// Space Complexity: O(1) since we are using only a constant amount of extra space

class Solution {
    public boolean repeatedSubstringPattern(String s) {
        
        for(int i=1; i<s.length(); i++){ //starts from 1 cus either it can be 1 char substring, or more...
            boolean match=true;// if you write match outside the loop, it will become false because inner loop is terminating always and never becomes true again, so always false. also noti that it is initiated true, not false... 
            if(s.length()%i==0){
                for(int j=0; j<s.length(); j++){
                    if(s.charAt(j)!=s.charAt(j%i)){// noti this j%i... gives 0,1,2...i-1
                        match = false;
                        break;
                    }
                }
                if(match) return true;
            }
        }
        return false;
    }
}