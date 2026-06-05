package Week_1.Day_5;
// 14. Longest Common Prefix
// Approach: Vertical Scanning
// Time Complexity: O(n*m) where n is number of strings and m is the length of the longest string
// Space Complexity: O(1)
class Solution {
    public String longestCommonPrefix(String[] s) {
        
        for(int i=0; i<s[0].length(); i++){
            for(int j=1; j<s.length; j++){
                if(i>=s[j].length() || s[0].charAt(i)!=s[j].charAt(i))  {// another condition because 1st String can exceed other strings, hence error. but if 1st string is shorter then no issue...
                    return s[0].substring(0,i); // till i-1
                }
            }
        }
        return s[0];// not 'return ""; ' because it is already return by above return but if no mismatch then whole 1st string, not till the index where mis-match found.
    }
}