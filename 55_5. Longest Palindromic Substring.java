/*5. Longest Palindromic Substring
Solved
Medium
Topics
premium lock icon
Companies
Hint
Given a string s, return the longest palindromic substring in s.

 

Example 1:

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
Example 2:

Input: s = "cbbd"
Output: "bb"
 

Constraints:

1 <= s.length <= 1000
s consist of only digits and English letters.*/

class Solution {
    public String longestPalindrome(String s) {
        String ans="";  // Initialize with an empty string
        for(int i=0;i<s.length();i++){  // Check for odd-length palindromes  (single middle character)
            if(expand(s,i,i).length()>ans.length()){  // If the found palindrome is longer than current answer
                ans=expand(s,i,i);  // Update the answer
            }
        }
        for(int i=0;i<s.length()-1;i++){  // Check for even-length palindromes (two middle characters)
            if(expand(s,i,i+1).length()>ans.length()){  // If the found palindrome is longer than current answer
                ans=expand(s,i,i+1); // Update the answer
            }
        }
        return ans;
    }
    public String expand(String A,int L,int R){  // Expand around the center
        while(L>=0 && R<A.length() && A.charAt(L)==A.charAt(R)){  // Check if characters match
            L--;  // Move left pointer
            R++;  // Move right pointer
        }
        return A.substring(L+1,R);  // Return the palindromic substring
    }
}