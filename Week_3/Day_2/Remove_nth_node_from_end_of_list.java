package Week_3.Day_2;

//19. Remove Nth Node From End of List
//Approach: two pointers (slow and fast)
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode slow =head;
        ListNode fast=head;

        for(int i=0; i<n; i++){
            fast=fast.next;
        }

        if(fast==null) return slow.next;//edge case: when we remove the first

        while(fast!=null){
            if(fast.next==null){
                slow.next=slow.next.next;
            }
            slow=slow.next;
            fast=fast.next;
        }
        return head;
    }
}
//basic idea is, we are putting the fast pointer exactly n nodes ahead so that when it is at the last node(fast.next=null), slow is one before the node we need to change, so we change slow.next by slow.next.next. 
// at the edge case, what we are going is if the n is pointing at head so fast becomes null, i.e. not at the last node but beyond that...