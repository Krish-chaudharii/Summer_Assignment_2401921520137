package Week_2.Day_2;
import java.util.HashSet;

// 3. Longest Substring Without Repeating Characters
// Approach: Sliding Window with HashSet
// Time Complexity: O(n) where n is the length of the string
// Space Complexity: O(min(m, n)) where m is the size of the character set and n is the length of the string    

class Solution {
    public int lengthOfLongestSubstring(String s) {
        // First thought: For each character, use another loop to check for duplicates.
        // This would work but takes O(n²) time.
        //
        // Optimized Approach:
        // Use a HashSet to maintain unique characters in the current window.
        // (An array could also be used if the character set is fixed, e.g. lowercase letters or ASCII.)
        //
        // Use a sliding window with two pointers (left and right).
        // Expand the window by moving right.
        // If a duplicate is found, keep shrinking the window from the left
        // until the duplicate is removed.
        // Once the window becomes valid again, continue expanding right.
        // Keep track of the maximum window size and return it at the end.

        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int maxLen = 0;

        for(int right = 0; right < s.length(); right++) {

            while(set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right)); // we added it again because it is required and previous is gone

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
