/*A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each word consists of lowercase and uppercase English letters.

A sentence can be shuffled by appending the 1-indexed word position to each word then rearranging the words in the sentence.

For example, the sentence "This is a sentence" can be shuffled as "sentence4 a3 is2 This1" or "is2 sentence4 This1 a3".
Given a shuffled sentence s containing no more than 9 words, reconstruct and return the original sentence.

 

Example 1:

Input: s = "is2 sentence4 This1 a3"
Output: "This is a sentence"
Explanation: Sort the words in s to their original positions "This1 is2 a3 sentence4", then remove the numbers.
Example 2:

Input: s = "Myself2 Me1 I4 and3"
Output: "Me Myself and I"
Explanation: Sort the words in s to their original positions "Me1 Myself2 and3 I4", then remove the numbers.
 

Constraints:

2 <= s.length <= 200
s consists of lowercase and uppercase English letters, spaces, and digits from 1 to 9.
The number of words in s is between 1 and 9.
The words in s are separated by a single space.
s contains no leading or trailing spaces.*/

/*#include <iostream>
#include <sstream>
#include <map>
using namespace std;

string sortSentence(string s) {
    stringstream ss(s);
    string word;
    map<int, string> m;

    while (ss >> word) {
        int pos = word.back() - '0';         // Get position from last character
        word.pop_back();                     // Remove digit from word
        m[pos] = word;                       // Store in map with position as key
    }

    string result;
    for (auto it : m) {
        result += it.second + " ";
    }

    result.pop_back();  // Remove last space
    return result;
}

int main() {
    cout << sortSentence("is2 sentence4 This1 a3") << endl;  // Output: This is a sentence
    cout << sortSentence("Myself2 Me1 I4 and3") << endl;      // Output: Me Myself and I
    return 0;
}
 */

import java.util.*;

public class ReconstructSentenceSimple {
    public static String sortSentence(String s) {
        String[] words = s.split(" ");
        Map<Integer, String> map = new HashMap<>();

        // Store words in map with their index
        for (String word : words) {
            int n = word.length();
            int pos = word.charAt(n - 1) - '0';
            String actualWord = word.substring(0, n - 1);
            map.put(pos, actualWord);
        }

        // Build result using TreeMap to sort keys automatically
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= 9; i++) {
            if (map.containsKey(i)) {
                result.append(map.get(i)).append(" ");
            }
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(sortSentence("is2 sentence4 This1 a3")); // Output: This is a sentence
        System.out.println(sortSentence("Myself2 Me1 I4 and3"));     // Output: Me Myself and I
    }
}

