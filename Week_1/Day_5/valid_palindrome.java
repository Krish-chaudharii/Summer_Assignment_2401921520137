package Week_1.Day_5;
// 125. Valid Palindrome
// Approach: String Filtering + Two Pointers
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public boolean isPalindrome(String s) {
        char[] arr= new char[s.length()];
        int count=0;
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c>='A' && c<='Z'){
                c=(char)(c+32);
                arr[count]=c;
                count++;
            }

            else if(c>='a' && c<='z'){
                arr[count]=c;
                count++;
            }

            else if(c>='0' && c<='9'){
                arr[count]=c;
                count++;
            }
        }

        int right=count-1;
        int left=0;
        while(left<right){
            if(arr[left]!=arr[right]) return false;
             
            right--;
            left++;
        }

        return true;
    }
}