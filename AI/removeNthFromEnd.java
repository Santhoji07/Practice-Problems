/*19. Remove Nth Node From End of List
Medium
Topics
premium lock icon
Companies
Hint
Given the head of a linked list, remove the nth node from the end of the list and return its head.

 

Example 1:


Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]
Example 2:

Input: head = [1], n = 1
Output: []
Example 3:

Input: head = [1,2], n = 1
Output: [1] */

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
        ListNode fast=head; 
        ListNode slow=head;

        for(int i=0;i<n;i++){ // Move fast pointer n steps ahead
            fast=fast.next;
        }

        if(fast==null){    // If fast is null, it means we need to remove the head
            return head.next;  
        }
        while(fast.next!=null){  // Move both pointers until fast reaches the end
            fast=fast.next;  //
            slow=slow.next;
        }

        slow.next=slow.next.next;  // Remove the nth node from the end by skipping it

        return head;  // Return the modified head of the list
        
    }
}