/*1781. Sum of Beauty of All Substrings
Solved
Medium
Topics
premium lock icon
Companies
Hint
The beauty of a string is the difference in frequencies between the most frequent and least frequent characters.

For example, the beauty of "abaacc" is 3 - 1 = 2.
Given a string s, return the sum of beauty of all of its substrings.

 

Example 1:

Input: s = "aabcb"
Output: 5
Explanation: The substrings with non-zero beauty are ["aab","aabc","aabcb","abcb","bcb"], each with beauty equal to 1.
Example 2:

Input: s = "aabcbaa"
Output: 17
 

Constraints:

1 <= s.length <= 500
s consists of only lowercase English letters.
*/

class Solution {
        public int getMinCount(int[] freq){     // Get the minimum frequency of characters in the substring
        int minCount=Integer.MAX_VALUE;         // Initialize minCount to maximum value
        for(int i=0;i<26;i++){                  // Iterate through the frequency array
            if(freq[i]!=0){                     // Check if the frequency is non-zero
            minCount=Math.min(minCount,freq[i]);// Update minCount if current frequency is less
        }
        }
        return minCount;
    }
    public int getMaxCount(int[] freq){         // Get the maximum frequency of characters in the substring  
        int maxCount=0;                         // Initialize maxCount to 0
        for(int i=0;i<26;i++){                  // Iterate through the frequency array
            maxCount=Math.max(maxCount,freq[i]);// Update maxCount if current frequency is greater
        }
        return maxCount;
    }
    public int beautySum(String s) {
        int sum=0;  // Initialize sum to 0
        for(int i=0;i<s.length();i++){           // Iterate through each starting index of the substring
            int freq[]=new int[26];              // Frequency array for characters 'a' to 'z'
            for(int j=i;j<s.length();j++){       // Iterate through each ending index of the substring
                freq[s.charAt(j)-'a']++;         // Increment the frequency of the current character
                int beauty=getMaxCount(freq)-getMinCount(freq);     // Calculate beauty as max frequency - min frequency
                sum+=beauty;                    
            }
        }
        return sum;
    }
}