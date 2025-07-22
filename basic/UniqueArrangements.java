/*Count Arrangements of Characters in a String

You are given a string consisting of only lowercase English letters. Your task is to find and print the total number of distinct arrangements (permutations) of the characters of the string.

If the string contains repeated characters, treat identical letters as indistinguishable while counting.


---

Input:

A single string consisting of lowercase letters only.

Output:

Print a single integer – the total number of distinct arrangements of the characters.


---

Examples:

Example 1
Input:
abc
Output:
6
(3! = 6 unique arrangements)

Example 2
Input:
aab
Output:
3
(3! / 2! = 6 / 2 = 3 unique arrangements)

Example 3
Input:
aaaa
Output:
1
(All characters are the same)

Example 4
Input:
onion
Output:
30
(5! / (2! × 2!) = 120 / 4 = 30)

Example 5
Input:
abbba
Output:
10
(5! / (2! × 3!) = 120 / 12 = 10)


| Input   | Output |
| ------- | ------ |
| `abc`   | 6      |
| `aab`   | 3      |
| `aaaa`  | 1      |
| `onion` | 30     |
| `abbba` | 10     |
*/

import java.util.*;

public class UniqueArrangements {

    // Function to calculate factorial
    public static long factorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++)
            fact *= i;
        return fact;
    }

    // Main function to count unique permutations
    public static long countArrangements(String str) {
        int[] freq = new int[26]; // frequency array for characters

        for (char ch : str.toCharArray()) {
            freq[ch - 'a']++;
        }

        long numerator = factorial(str.length());
        long denominator = 1;

        for (int f : freq) {
            if (f > 1) {
                denominator *= factorial(f);
            }
        }

        return numerator / denominator;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); // Read input string

        System.out.println(countArrangements(str));
    }
}
