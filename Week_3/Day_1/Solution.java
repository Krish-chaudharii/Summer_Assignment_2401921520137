package Week_3.Day_1;

//141. Linked List Cycle
//Approach: Two Pointers
//Time Complexity: O(n) where n is the number of nodes in the linked list, since in the worst case, we may need to traverse the entire list to determine if there is a cycle.
//Space Complexity: O(1) since we are using only a constant amount of extra space for the two pointers, regardless of the size of the linked list.

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        //One we can use is hashset where we store each travesed node, if it exits that means cycle...
        // better approach is use two pointers, slow and fast. think of two runner on a circular track. they will definately meet again at some point is null doesn't exit. if exist so no cycle.

        ListNode slow = head;
        ListNode fast = head;

        while(fast!= null && fast.next!= null){//loop till LL doesn't get over. using 'fast' because it reaches end faster initially, if exist. 2 condition on 'fast' because it jumps 2 nodes...
            slow=slow.next;
            fast=fast.next.next;// note we first gave them diff node and compared later, cuz they were same initially

            if(slow==fast){
                return true;
            }
        }
    return false;
    }
}