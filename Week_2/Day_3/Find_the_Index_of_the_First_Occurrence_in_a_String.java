package Week_2.Day_3;
// 28. Find the Index of the First Occurrence in a String
// Approach: Brute Force
// Time Complexity: O(m*n) where m is the length of 'haystack' and n is the length of 'needle' in the worst case when all characters match but the last one.
// Space Complexity: O(1) since we are using only a constant amount of extra space

class Solution {
    public int strStr(String haystack, String needle) {
        int index=-1;
        for(int i=0; i<haystack.length()-needle.length()+1; i++){//haystack = "sadbutsad", needle = "sad" so check till h-n...
            if(haystack.charAt(i)==needle.charAt(0)){
                for(int j=1; j<needle.length(); j++){
                    if(haystack.charAt(i+j)!=needle.charAt(j)){
                        break;
                    }
                    if(j==needle.length()-1){
                        index=i;
                        return index;
                    }
                }
                if(needle.length()==1) return i; // for edgecase: needle="a"
            }
        }
        return index;
    }
}

// cleaner approach
// boolean match = true;
// for(int j=0; j<needle.length(); j++){
//     if(haystack.charAt(i+j) != needle.charAt(j)){
//         match = false;
//         break;
//     }
// }
// if(match) return i;
