/*Problem Description :
The Binary number system only uses two digits, 0 and 1 and number system can be called binary string. You are required to implement the following function:

int OperationsBinaryString(char* str);

The function accepts a string str as its argument. The string str consists of binary digits eparated with an alphabet as follows:

– A denotes AND operation
– B denotes OR operation
– C denotes XOR Operation
You are required to calculate the result of the string str, scanning the string to right taking one opearation at a time, and return the same.

Note:

No order of priorities of operations is required
Length of str is odd
If str is NULL or None (in case of Python), return -1
Input:
str: 1C0C1C1A0B1

Output:
1

Explanation:
The alphabets in str when expanded becomes “1 XOR 0 XOR 1 XOR 1 AND 0 OR 1”, result of the expression becomes 1, hence 1 is returned.

Sample Input:
0C1A1B1C1C1B0A0

Output:
0*/

#include <stdio.h>
#include <string.h>

int OperationsBinaryString(char* str) {
    if (str == NULL) return -1;  // Handle NULL input

    int len = strlen(str);
    int result = str[0] - '0';  // Convert first char to integer (either 0 or 1)

    // Traverse the string, taking operator and next binary digit one at a time
    for (int i = 1; i < len; i += 2) {
        char op = str[i];        // Operation: A, B, or C
        int num = str[i + 1] - '0';  // Next binary digit

        if (op == 'A') {
            result = result & num;
        } else if (op == 'B') {
            result = result | num;
        } else if (op == 'C') {
            result = result ^ num;
        }
    }

    return result;
}

int main() {
    char input1[] = "1C0C1C1A0B1";  // Example 1
    char input2[] = "0C1A1B1C1C1B0A0";  // Example 2

    printf("Output for \"%s\": %d\n", input1, OperationsBinaryString(input1)); // Expected: 1
    printf("Output for \"%s\": %d\n", input2, OperationsBinaryString(input2)); // Expected: 0

    return 0;
}




