/* 
2. Add Two Numbers
Solved
Medium
Topics
premium lock icon
Companies
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 

Example 1:


Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
Example 2:

Input: l1 = [0], l2 = [0]
Output: [0]
Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
 

Constraints:

The number of nodes in each linked list is in the range [1, 100].
0 <= Node.val <= 9
It is guaranteed that the list represents a number that does not have leading zeros.
*/

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t= new ListNode(0); //dummy node
        ListNode res=t;     //pointer to the result node
        int carry=0;    //to store carry

        while(l1!=null || l2!=null || carry!=0){  //loop until both lists are exhausted and no carry is left
            int s=carry; //sum of corresponding digits and carry

            if(l1!=null){      //if l1 is not exhausted
                s=s+l1.val;    //add its value to sum
                l1=l1.next;
            }
            if(l2!=null){
                s=s+l2.val;
                l2=l2.next;
            }
            res.next =new ListNode(s%10);  //  create a new node with the digit value (s%10) and link it to the result list
            carry=s/10;  //update carry for next iteration
            res=res.next;  //move to the next node in the result list
        }
        return t.next; //return the next node of dummy node as the head of the resultant list
    }
}