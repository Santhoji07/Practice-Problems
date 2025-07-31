/*
 168. Excel Sheet Column Title
Solved
Easy
Topics
premium lock icon
Companies
Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.

For example:

A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 
...
 

Example 1:

Input: columnNumber = 1
Output: "A"
Example 2:

Input: columnNumber = 28
Output: "AB"
Example 3:

Input: columnNumber = 701
Output: "ZY"
*/
class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--; 
            int rem = columnNumber % 26;
            char ch = (char) ('A' + rem); 
            result.insert(0, ch); 
            columnNumber /= 26;
        }

        return result.toString();
    }
}