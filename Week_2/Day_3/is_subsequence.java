package Week_2.Day_3;
// 392. Is Subsequence
// Approach: Two Pointers
// Time Complexity: O(n) where n is the length of 't' since we are traversing 't' at most once. The pointer for 's' will move at most the length of 's', but since 's' is a subsequence of 't', it will not exceed the length of 't'.
// Space Complexity: O(1) since we are using only a constant amount of extra space

class Solution {
    public boolean isSubsequence(String s, String t) {
        //subsequece has same order but no focus on continuty. while substring must be of same oredr and also continuous. just like most of the ques it can be solved using O(n^2). but using two pointers it can be done in O(n). one for traversing 's' and another for 't'.
        int i=0;
        int j=0;

        if(s.length()==0) return true;

        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }
            
            //if(s.charAt(i)!=t.charAt(j)){ --> Wrong
            else{
                j++;
            }

            if(i==s.length()) return true;
        }
        return false;
    }
}

//or

//while(i < s.length() && j < t.length()){
//   if(s.charAt(i)==t.charAt(j)){
//       i++;
//  }
//  j++;
//}

//return i == s.length();
