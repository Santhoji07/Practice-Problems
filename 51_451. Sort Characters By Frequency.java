/*451. Sort Characters By Frequency
Solved
Medium
Topics
premium lock icon
Companies
Given a string s, sort it in decreasing order based on the frequency of the characters. The frequency of a character is the number of times it appears in the string.

Return the sorted string. If there are multiple answers, return any of them.

 

Example 1:

Input: s = "tree"
Output: "eert"
Explanation: 'e' appears twice while 'r' and 't' both appear once.
So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
Example 2:

Input: s = "cccaaa"
Output: "aaaccc"
Explanation: Both 'c' and 'a' appear three times, so both "cccaaa" and "aaaccc" are valid answers.
Note that "cacaca" is incorrect, as the same characters must be together.
Example 3:

Input: s = "Aabb"
Output: "bbAa"
Explanation: "bbaA" is also a valid answer, but "Aabb" is incorrect.
Note that 'A' and 'a' are treated as two different characters.
 

Constraints:

1 <= s.length <= 5 * 105
s consists of uppercase and lowercase English letters and digits.*/

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map=new HashMap<>(); // Map to store character frequencies
        for(int i=0;i<s.length();i++){        // Iterate through the string
            char c=s.charAt(i);   // Get the character at index i
            if(!map.containsKey(c))  // If the character is not already in the map
                map.put(c,0);  // Initialize its count to 0
            map.put(c,map.get(c)+1);  // Increment the count of the character if already presnt 
        }
        PriorityQueue<Character> q= new PriorityQueue<>((a,b)->(map.get(b)-map.get(a))); // Create a max-heap based on character frequency

        for(char key: map.keySet()){  
            q.add(key);  // Add characters to the priority queue
        }

        String res="";          // Initialize the result string

        while(q.size()>0){ 
            char c=q.poll();  // Get the character with the highest frequency

            for(int i=0;i<map.get(c);i++)   //check if the chatracter is present in the map twice or more
            res+=c;  // Append the character to the result string based on its frequency
        }
        return res;  // Return the sorted string
    }
}