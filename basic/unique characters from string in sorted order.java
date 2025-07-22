/*Question: Unique Characters in a String

You are given a string consisting of lowercase English letters. Your task is to form a new string that contains only the first occurrence of each character, while preserving their order from the original string.


---

Input:
A single string made up of lowercase English letters.

Output:
A string with unique characters in the order they first appeared.


---

Example 1
Input: badbaccda
Output: badc

Example 2
Input: mmnoppqmmn
Output: mnopq

Example 3
Input: cabcabc
Output: cab

Example 4
Input: zyxzxy
Output: zyx*/

import java.util.HashSet;

public class Main {

    public static String uniqueCharacters(String input) {
        HashSet<Character> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (!seen.contains(ch)) {
                seen.add(ch);            // Mark character as seen
                result.append(ch);       // Append only the first time
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        // Test Cases
        System.out.println("Output 1: " + uniqueCharacters("badbaccda"));   // Output: badc
        System.out.println("Output 2: " + uniqueCharacters("mmnoppqmmn"));  // Output: mnopq
        System.out.println("Output 3: " + uniqueCharacters("cabcabc"));     // Output: cab
        System.out.println("Output 4: " + uniqueCharacters("zyxzxy"));      // Output: zyx
    }
}
