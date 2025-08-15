/*921. Minimum Add to Make Parentheses Valid
Solved
Medium
Topics
premium lock icon
Companies
A parentheses string is valid if and only if:

It is the empty string,
It can be written as AB (A concatenated with B), where A and B are valid strings, or
It can be written as (A), where A is a valid string.
You are given a parentheses string s. In one move, you can insert a parenthesis at any position of the string.

For example, if s = "()))", you can insert an opening parenthesis to be "(()))" or a closing parenthesis to be "())))".
Return the minimum number of moves required to make s valid.

 

Example 1:

Input: s = "())"
Output: 1
Example 2:

Input: s = "((("
Output: 3
 

Constraints:

1 <= s.length <= 1000
s[i] is either '(' or ')'.*/

//Using stack
import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int minAddToMakeValid(String s) {
        Deque<Character> stk=new ArrayDeque<>();    // Stack to keep track of unmatched parentheses
        int left=0;     // Count of unmatched left parentheses

        for(char ch:s.toCharArray()){          // Iterate through each character in the string
            if(ch=='('){              // If the character is '(', push it onto the stack
                stk.push(ch);
            }else if(!stk.isEmpty()){      // If the character is ')' and the stack is not empty, pop from the stack
                stk.pop();
            }else{
                left++;  // If the stack is empty, increment the count of unmatched left parentheses
            }
        }
        return left+stk.size(); // Return the total count of unmatched parentheses (left + right)
    }
}


//OR Using right an left counters

class Solution1 {
    public int minAddToMakeValid(String s) {
        int left=0;  // Count of unmatched left parentheses
        int right=0;    // Count of unmatched right parentheses

        for(char ch:s.toCharArray()){       // Iterate through each character in the string
            if(ch=='('){          // If the character is '(', increment the left counter
                right++;            
            }else if(right>0){  // If the character is ')' and there are unmatched left parentheses, decrement the right counter
                right--;
            }else{
                left++;     // If there are no unmatched left parentheses, increment the left counter
            }
        }
        return left+right;
    }
}