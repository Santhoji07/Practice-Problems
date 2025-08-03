/*21. Merge Two Sorted Lists
Easy
Topics
premium lock icon
Companies
You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

 

Example 1:


Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
Example 2:

Input: list1 = [], list2 = []
Output: []
Example 3:

Input: list1 = [], list2 = [0]
Output: [0]
 

Constraints:

The number of nodes in both lists is in the range [0, 50].
-100 <= Node.val <= 100
Both list1 and list2 are sorted in non-decreasing order. */

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode curr = null;
        ListNode res = null;

        while (list1 != null && list2 != null) {  // Compare the values of the two lists
            if (list1.val <= list2.val) {  // If list1's value is less than or equal to list2's value
                if (curr == null) {  // If curr is null, it means this is the first node being added
                    curr = list1;  // Set curr to list1
                    res = curr;  // Initialize res to the first node
                } else {
                    curr.next = list1;  // Link the current node to list1
                    curr = curr.next;  // Move curr to the next node
                }
                list1 = list1.next;  // Move to the next node in list1
            } else {
                if (curr == null) {  
                    curr = list2;
                    res = curr;
                } else {
                    curr.next = list2;
                    curr = curr.next;
                }
                list2 = list2.next;
            }
        }

        // ✅ Handle the case when one list is null from the beginning
        if (curr == null) {  // If both lists were empty
            return list1 != null ? list1 : list2;  // Return the non-null list
        }

        while (list1 != null) {  // If list1 still has nodes left
            curr.next = list1; // Link the current node to list1
            curr = curr.next; // Move curr to the next node
            list1 = list1.next;  // Move to the next node in list1
        }

        while (list2 != null) {
            curr.next = list2;
            curr = curr.next;
            list2 = list2.next;
        }

        return res;
    }
}
