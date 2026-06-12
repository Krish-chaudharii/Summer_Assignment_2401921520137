package Week_2.Day_2;
// 567. Permutation in String
// Approach: Sliding Window
// Time Complexity: O(n) where n is the length of s2, since we are traversing s2 once with a sliding window.
// Space Complexity: O(1) since we are using only a constant amount of extra space for the frequency arrays, which have a fixed size of 26 (for lowercase letters).

import java.util.Arrays;
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        // this is most important
        if(s1.length()>s2.length()) return false;

        int[] arrfreq = new int[26];// if s1 to be present in s2 in any order, but continuous(just like anagram), frequecy must be same... Noti it is lowercase only...

        for(int i=0 ;i<s1.length(); i++){
            arrfreq[s1.charAt(i)-'a']++;
        }
        
        //using that frequency and testing it with frequency of a same size window of length(s1) in s2. if it matches true, else false.

        //1st submission of 567 (on leetcode) is not optimized. sliding window's aim is to avoid it...
        int start=0;
        int end=s1.length()-1;

        int[] arr2freq= new int[26];
        for(int i=start; i<=end; i++){
            arr2freq[s2.charAt(i)-'a']++;
        }

        while (end<s2.length()){
            if(Arrays.equals(arrfreq,arr2freq)) return true;
            else {
                arr2freq[s2.charAt(start)-97]--;
                start++; 
                end++;
                if(end< s2.length()) arr2freq[s2.charAt(end)-97]++;
            }
        }

        return false;
    }
}
