package Week_3.Day_1;
//876. Middle of the Linked List
//Approach: Two Pointers
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
    public ListNode middleNode(ListNode head) {
        ListNode c = head;
        ListNode mid=c;
        while(c.next!=null && c.next.next!=null){
            c=c.next.next;
            mid=mid.next;
        }
        if(c.next==null) return mid;//odd case. Noti that if you write c.next.next here (for even) it will cause error because if c.next is null can't find next of null. 
        else return mid.next;//even case
    }
}

// slow = head;
// fast = head;
// while(fast != null && fast.next != null){ more clean and noti the conditions
//     slow = slow.next;
//     fast = fast.next.next;
// }
// return slow;
