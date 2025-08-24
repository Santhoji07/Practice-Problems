/*242. Valid Anagram
Solved
Easy
Topics
premium lock icon
Companies
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

 

Example 1:

Input: s = "anagram", t = "nagaram"

Output: true

Example 2:

Input: s = "rat", t = "car"

Output: false

 

Constraints:

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters. */

class Solution {
    public boolean isAnagram(String s, String t) {
        int[] count= new int[26]; // Assuming only lowercase English letters

        for(char c: s.toCharArray()){ // Count characters in s
            count[c-'a']++; // Convert char to index (0 for 'a', 1 for 'b', ..., 25 for 'z')
        }
        for(char c:t.toCharArray()){  // Decrease count for characters in t
            count[c-'a']--;  
        }

        for(int i=0;i<26;i++){  // Check if all counts are zero
            if(count[i] !=0){
                return false;
            }
        }
        return true;
    }
}