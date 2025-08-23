/*3. Longest Substring Without Repeating Characters
Medium
Topics
premium lock icon
Companies
Hint
Given a string s, find the length of the longest substring without duplicate characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 

Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces. */

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> seen=new HashSet<>();   //to store the characters in the current window
        int start=0;
        int end=0;
        int ans= Math.min(s.length(),1); 

        while(end<s.length()){ //expand the window by moving the end pointer
            char c=s.charAt(end);

            while(seen.contains(c)){ //if the character is already in the set, shrink the window by moving the start pointer
                seen.remove(s.charAt(start)); //remove the character at the start pointer from the set
                start+=1;

            }
            seen.add(c); //add the character at the end pointer to the set

            int windowSize=end-start+1; //calculate the size of the current window

            ans= Math.max(ans,windowSize); //update the answer if the current window size is greater than the previous answer
            end+=1;
        }
        return ans;
    }
}