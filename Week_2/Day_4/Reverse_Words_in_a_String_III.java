package Week_2.Day_4;

// 557. Reverse Words in a String III
// Approach: Two Pointers
// Time Complexity: O(n) where n is the length of the input string s, since we are traversing the string once to reverse each word.
// Space Complexity: O(n) since we are creating a new character array to store the reversed words, which takes up space proportional to the length of the input string.

class Solution {
    public String reverseWords(String s) {
        int i=0;//initial index of word
        int f=0;// final index
        char[] arr= s.toCharArray(); // strings are immutable

        for(int a=0; a<arr.length; a++){
            if(arr[a]==' ' || a==arr.length-1){
                int start=i;
                int end=0;
                if(a==arr.length-1) end=a; // for last word
                else end=a-1; // words except last

                while(start< end){
                    char t= arr[start];
                    arr[start]= arr[end];
                    arr[end]= t;
                    start++; end--;
                }
                i= a+1;
            }
        }
        return new String(arr);
    }
}
