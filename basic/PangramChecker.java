/* 
You are given a string that may contain uppercase letters, lowercase letters, spaces, digits, or special characters. Your task is to determine whether the string is a pangram.

A pangram is a sentence that contains every letter of the English alphabet at least once.
Both uppercase and lowercase letters should be treated as the same (i.e., case-insensitive).
Special characters and digits can be ignored.


---

Input:

A single line containing a string.

Output:

Print "Yes" if the string is a pangram, otherwise print "No".


---

Examples:

Example 1
Input:
The quick brown fox jumps over the lazy dog!
Output:
Yes

Example 2
Input:
Pack my box with five dozen liquor jugs.
Output:
Yes

Example 3
Input:
Hello, World!
Output:
No

Example 4
Input:
ABCDEFGHIJKLmnopqrstuvwxyz
Output:
Yes*/

import java.util.*;

public class PangramChecker {
    public static String isPangram(String input) {
        Set<Character> letters = new HashSet<>();

        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                letters.add(Character.toLowerCase(ch)); // Convert to lowercase and add
            }
        }

        if (letters.size() == 26) {
            return "Yes";
        } else {
            return "No";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine(); // Read full line including spaces

        System.out.println(isPangram(input));
    }
}


