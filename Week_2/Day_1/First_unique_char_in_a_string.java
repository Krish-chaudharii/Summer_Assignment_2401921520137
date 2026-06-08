package Week_2.Day_1;
//leetcode 387. First Unique Character in a String
// Approach: Frequency Array
// Time Complexity: O(n)
// Space Complexity: O(1) since only 26 lowercase chars

class Solution {
    public int firstUniqChar(String s) {
        // two loops can be used, one for fetching, another for matching but that is O(n^2). better is to use freq. of each char as ques says it only consists on lowercase chars.

        int[] f = new int[26];

        for(int i=0; i<s.length(); i++){
            char c= s.charAt(i);
            f[c-97]++; // or s[c-'a']++;
        }

        // !!!Failed!!! for(int i=0; i<26; i++){
            //if(f[i]==1) return i;
        //}

        for(int i=0; i<s.length(); i++){
            char c= s.charAt(i);
            if(f[c-97]==1) return i;
        }

        return -1;
    }
}
