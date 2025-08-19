/*686. Repeated String Match
Solved
Medium
Topics
premium lock icon
Companies
Given two strings a and b, return the minimum number of times you should repeat string a so that string b is a substring of it. If it is impossible for b​​​​​​ to be a substring of a after repeating it, return -1.

Notice: string "abc" repeated 0 times is "", repeated 1 time is "abc" and repeated 2 times is "abcabc".

 

Example 1:

Input: a = "abcd", b = "cdabcdab"
Output: 3
Explanation: We return 3 because by repeating a three times "abcdabcdabcd", b is a substring of it.
Example 2:

Input: a = "a", b = "aa"
Output: 2*/

class Solution {
    public int repeatedStringMatch(String a, String b) {
        int count=1;    // Initialize count to 1 for the first repetition of string a
        StringBuilder res=new StringBuilder(a);     // Use StringBuilder for efficient string concatenation
        while(res.length()<b.length()){ // Repeat string a until the length of res is at least the length of b
            res.append(a);       // Append string a to res
            count++;   // Increment the count of repetitions
        }
        if(res.toString().contains(b)){     // Check if b is a substring of res
            return count;                  
        }

        if(res.append(a).toString().contains(b)){   // Check if b is a substring after one more repetition of a
            return count+1;
        }
        return -1;
    }
}