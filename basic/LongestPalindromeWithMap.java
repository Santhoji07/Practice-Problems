/*At a national tech event, every participant receives a custom name badge. The event organizers want the names on the badge to look visually appealing by arranging the letters to form a palindrome.

They can rearrange the letters from the participant’s name (all in lowercase), and their goal is to form the longest possible palindrome using some or all of the letters.

You are given a string s representing the characters in the participant’s name. Your task is to return the length of the longest palindrome that can be built using those letters.


---

✏️ Example 1:

Input:
s = "abccccdd"

Output:
7

Explanation:
One of the longest palindromes that can be formed is "dccaccd". You can use two 'c's and two 'd's on either side, and one odd letter (like 'a' or 'b') in the middle.


---

✏️ Example 2:

Input:
s = "a"

Output:
1

Explanation:
Only one character is available, so the palindrome is "a" itself.


---

✅ Constraints:

1 <= s.length <= 2000

s consists of only lowercase English letters*/

import java.util.*;

public class LongestPalindromeWithMap {

    public static int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();

        // Count frequencies of each character
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int length = 0;
        boolean hasOdd = false;

        for (int count : map.values()) {
            length += (count / 2) * 2; // Add even part of the count
            if (count % 2 != 0) {
                hasOdd = true; // One odd char can be placed in center
            }
        }

        if (hasOdd) {
            length += 1;
        }

        return length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int result = longestPalindrome(s);
        System.out.println(result);
    }
}
