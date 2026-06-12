package Week_2.Day_2;

import java.util.*;
// 438. Find All Anagrams in a String
// Approach: Sliding Window
// Time Complexity: O(n) where n is the length of s, since we are traversing s once with a sliding window.
// Space Complexity: O(1) since we are using only a constant amount of extra space for the frequency arrays, which have a fixed size of 26 (for lowercase letters).

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> l = new ArrayList<>();
        if(p.length()>s.length()) return l;

        int[] arrfreq = new int[26];

        for(int i=0 ;i<p.length(); i++){
            arrfreq[p.charAt(i)-'a']++;
        }

        int start=0;
        int end=p.length()-1;

        int[] arr2freq= new int[26];
        for(int i=start; i<=end; i++){
            arr2freq[s.charAt(i)-'a']++;
        }

        while (end<s.length()){
            if(Arrays.equals(arrfreq,arr2freq)) l.add(start);
            
            arr2freq[s.charAt(start)-97]--;
            start++; 
            end++;
            if(end< s.length()) arr2freq[s.charAt(end)-97]++;
        }

        return l;
    }
}