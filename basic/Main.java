/*Valid Anagram

You are given two strings consisting of lowercase English letters. Your task is to determine whether the two strings are anagrams of each other.

Two strings are said to be anagrams if they contain the same characters with the same frequencies, but possibly in a different order.


---

Input:

Two space-separated strings.


---

Output:

Print "Yes" if the strings are anagrams of each other, otherwise print "No".


---

Examples:

Example 1
Input: listen silent
Output: Yes

Example 2
Input: triangle integral
Output: Yes

Example 3
Input: apple paple
Output: Yes

Example 4
Input: hello world
Output: No

Example 5
Input: aab abb
Output: No */


import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static String areAnagrams(String str1, String str2) {
        // If lengths are different, they can't be anagrams
        if (str1.length() != str2.length()) {
            return "No";
        }

        // Convert strings to char arrays
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // Sort both character arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare sorted arrays
        if (Arrays.equals(arr1, arr2)) {
            return "Yes";
        } else {
            return "No";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input two space-separated strings
        String str1 = sc.next();
        String str2 = sc.next();

        System.out.println(areAnagrams(str1, str2));
    }
}

