/*
 * 151. Reverse Words in a String
Solved
Medium
Topics
premium lock icon
Companies
Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

 

Example 1:

Input: s = "the sky is blue"
Output: "blue is sky the"
Example 2:

Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.
Example 3:

Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
 

Constraints:

1 <= s.length <= 104
s contains English letters (upper-case and lower-case), digits, and spaces ' '.
There is at least one word in s.
 */

 class Solution {
    public String reverseWords(String s) {
        
        s=s.trim();
        int validChars=0;
        for(int i=0;i<s.length();i++){
            validChars++;
            if(s.charAt(i)==' '){
                while(i<s.length()-1 && s.charAt(i+1)==' '){
                    i++;
                }
            }
        }

        char[] chars= new char[validChars]; //hello world [h,e,l,l,o, ,w,o,r,l,d]
        int j=0;
        for(int i=0;i<s.length();i++){
            chars[j++]=s.charAt(i);
            if(s.charAt(i)==' '){
                while(i<s.length()-1 && s.charAt(i+1)==' '){
                    i++;
                }
            }
        }

        int start =0;
        int end= chars.length-1;

        reverseCharArray(chars,start,end);


        start=0;
        for(int i=0; i<chars.length;i++){
            if(chars[i]==' '){
                end=i-1;
                reverseCharArray(chars,start,end);
                start=i+1;
            }
        }
        reverseCharArray(chars,start,chars.length-1);
        return String.valueOf(chars);
    }

        public void reverseCharArray(char[] chars,int start,int end){
            while(start<end){
                char temp=chars[start];
                chars[start]=chars[end];
                chars[end]=temp;

                start++;
                end--;
        }
    }
}
