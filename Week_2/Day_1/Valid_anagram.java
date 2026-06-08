package Week_2.Day_1;
//leetcode 242. Valid Anagram
// Approach: Frequency Array
// Time Complexity: O(n)
// Space Complexity: O(1) since only 26 lowercase chars
class Solution {
    public boolean isAnagram(String s, String t) {
        int[] sa= new int[26];
        int[] ta= new int[26];// storing count of lowercase alphabets so 26 size

        if(s.length()!= t.length()) return false; // they must be of same length for anagram

        for(int i=0; i<s.length(); i++){
            char c1= s.charAt(i);
            char c2= t.charAt(i);
            //check not required cuz ques says they are lowercase
            
            //if(c1>='a' && c1<='z'){ //for s
                sa[c1-97]++;
            //}

            //if(c2>='a' && c2<='z'){// for t, noti seperate for both
                ta[c2-97]++;
            //}
        }

        for(int i=0; i<sa.length; i++){
            if(sa[i]!=ta[i]) return false;
        }

        return true;
    }
}
