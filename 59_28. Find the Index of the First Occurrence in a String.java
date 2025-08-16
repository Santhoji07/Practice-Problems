/*28. Find the Index of the First Occurrence in a String
Solved
Easy
Topics
premium lock icon
Companies
Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

 

Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
Example 2:

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.
 

Constraints:

1 <= haystack.length, needle.length <= 104
haystack and needle consist of only lowercase English characters. */

class Solution {
    public int strStr(String haystack, String needle) {
        for(int i=0;i<haystack.length();i++){   // Iterate through each character in the haystack
            if(haystack.charAt(i)==needle.charAt(0)){ // Check if the current character matches the first character of the needle
                int j=0;      // Initialize j to 0 to start comparing the needle
                int k=i;      // Initialize k to i to start comparing from the current position in the haystack

                while(j<needle.length()&& k<haystack.length() &&needle.charAt(j)==haystack.charAt(k)){  // Compare characters of needle and haystack
                    j++;
                    k++;
                    if(j== needle.length()){ // If we have matched all characters of the needle
                        return i; // Return the starting index of the first occurrence
                    }

                }
            }
        }
        return -1;
    }
}

//or haystack.indexOf(needle) 