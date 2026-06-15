package Week_3.Day_1;
//206. Reverse Linked List
//Approach: Iterative
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
    public ListNode reverseList(ListNode head) {
        ListNode p = null;
        ListNode c= head;
        ListNode n;
        while(c!=null){//can't write c.next!=null, what if c itself is null
            n=c.next;
            c.next=p;
            p=c;
            c=n;
        }
    return p;// noti returning p, c holds null
    }
}