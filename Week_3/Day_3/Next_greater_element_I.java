package Week_3.Day_3;
import java.util.*;

//496 Next Greater Element I
//Approach: Stack and HashMap
//Time Complexity: O(m+n) where m is the length of nums1 and n is the length of nums2
//Space Complexity: O(n)

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stk = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<nums2.length; i++){
            if(stk.isEmpty() || nums2[i]<stk.peek()){
                stk.push(nums2[i]);
            }
            else{
                while(!stk.isEmpty() && nums2[i]>stk.peek()){//if it gets empty while removing so using ! isEmpty()... 
                    map.put(stk.pop(),nums2[i]);
                }
                stk.push(nums2[i]);
            }
        }
        while(!stk.isEmpty()){
            map.put(stk.pop(),-1);
        }

        int[] ans = new int[nums1.length];

        for(int i=0; i<nums1.length; i++){
            ans[i] = map.get(nums1[i]);
        }

        return ans;
    }
}