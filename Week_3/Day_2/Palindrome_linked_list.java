package Week_3.Day_2;

//234. Palindrome Linked List
//Approach: find the middle of the linked list, reverse the second half and compare both halves
//Time Complexity: O(n)
//Space Complexity: O(1)


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public boolean isPalindrome(ListNode head) {

        if(head == null || head.next == null) return true;
        // CORRECTION #4:
        // handle both empty list and single-node list

        ListNode fast = head;
        ListNode slow = head;
        // CORRECTION #1:
        // start both at head, not head.next

        while(fast != null && fast.next != null){

            slow = slow.next;

            fast = fast.next.next;
            // CORRECTION #2:
            // safer way to move fast by 2 nodes
        }

        if(fast != null){
            slow = slow.next;
        }
        // CORRECTION #3:
        // odd length => fast ends at last node
        // skip middle node before reversing

        ListNode prev = null;
        ListNode curr = slow;
        ListNode next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        while(prev != null){

            if(head.val != prev.val)
                return false;

            head = head.next;
            prev = prev.next;
        }

        return true;
    }
}
