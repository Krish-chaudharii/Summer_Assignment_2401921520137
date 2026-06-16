package Week_3.Day_2;

//21. Merge Two Sorted Lists
//Approach: dummy node and tail pointer
//Time Complexity: O(n+m)
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newnode = new ListNode(0);//val = 0, this is to keep track of new LL beginning...
        ListNode node1=list1;
        ListNode node2=list2;
        ListNode tail=newnode;// to manage merge...

        while(node1!=null && node2!=null){
            if(node1.val<=node2.val){
                tail.next=node1;
                tail=tail.next;
                node1=node1.next;
            }
            else{
                tail.next=node2;
                tail=tail.next;
                node2=node2.next;
            }
        }
        
        if(node1 != null)
            tail.next = node1;
        else
            tail.next = node2;

        return newnode.next;
    }
}
