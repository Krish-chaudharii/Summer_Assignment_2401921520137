package Week_2.Day_1;

// 383. Ransom Note
// Approach: Frequency array for both ransomNote and magazine. Then compare frequencies of chars in ransomNote with magazine. If any char frequency in ransomNote is greater than that in magazine, return false. Else, return true.
// Time Complexity: O(n) where n is the length of the longer string (ransomNote or magazine)
// Space Complexity: O(1) since only 26 lowercase chars

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // using frequency because ransom can be created only if it has same chars (freqency of chars matter) in magazine. magazine can have more letters as well.
        int[] rf= new int[26]; // only lowercase, mentioned...
        int[] mf= new int[26];

        for(int i=0; i<ransomNote.length(); i++){
            char c=ransomNote.charAt(i);
            rf[c-'a']++; //c-97... 97-97=0, 98-97=1.. like this
        }

        for(int i=0; i<magazine.length(); i++){
            char c=magazine.charAt(i);
            mf[c-'a']++; //c-97... 97-97=0, 98-97=1.. like this
        }

        for(int i=0; i<ransomNote.length(); i++){
            char c=ransomNote.charAt(i);
            if(rf[c-'a']>mf[c-'a']) return false;// noti > and not equal thing...
        }

        return true;
    }
}

//can also use one freq. array... Fisrt count magazine(++) chars then consume(--) while chars for ransomNote. and later if any element is found -ve, return false. 0 or +ve is fine. but why?