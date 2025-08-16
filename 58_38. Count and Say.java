/*38. Count and Say
Solved
Medium
Topics
premium lock icon
Companies
Hint
The count-and-say sequence is a sequence of digit strings defined by the recursive formula:

countAndSay(1) = "1"
countAndSay(n) is the run-length encoding of countAndSay(n - 1).
Run-length encoding (RLE) is a string compression method that works by replacing consecutive identical characters (repeated 2 or more times) with the concatenation of the character and the number marking the count of the characters (length of the run). For example, to compress the string "3322251" we replace "33" with "23", replace "222" with "32", replace "5" with "15" and replace "1" with "11". Thus the compressed string becomes "23321511".

Given a positive integer n, return the nth element of the count-and-say sequence.

 

Example 1:

Input: n = 4

Output: "1211"

Explanation:

countAndSay(1) = "1"
countAndSay(2) = RLE of "1" = "11"
countAndSay(3) = RLE of "11" = "21"
countAndSay(4) = RLE of "21" = "1211"
Example 2:

Input: n = 1

Output: "1"

Explanation:

This is the base case.

 

Constraints:

1 <= n <= 30
  */

class Solution {
    public String countAndSay(int n) {
        String curr="1";  // Start with the base case of the sequence
        for(int k=1;k<n;k++){   // Iterate from 1 to n-1 to build the sequence
            String next ="";  // Initialize the next string to build the next term
            int i=0;  // Index to traverse the current string
            while(i<curr.length()){  // Traverse the current string
                int currentcharcount=1;  // Count of the current character
                while(i<curr.length()-1 &&(curr.charAt(i)==curr.charAt(i+1))){  // Count consecutive characters
                    currentcharcount+=1;  // Increment the count for each consecutive character
                    i=i+1;  // Move to the next character
                }
                next+=Integer.toString(currentcharcount)+curr.charAt(i); // Append the count and the character to the next string
                i=i+1; // Move to the next character after counting
            }
            curr=next;  // Update the current string to the next string for the next iteration
        }
        return curr;  // Return the nth term of the count-and-say sequence
    }
}