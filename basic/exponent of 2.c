/*You are given a function,

Int MaxExponents (int a , int b);

You have to find and return the number between ‘a’ and ‘b’ ( range inclusive on both ends) which has the maximum exponent of 2.

The algorithm to find the number with maximum exponent of 2 between the given range is

Loop between ‘a’ and ‘b’. Let the looping variable be ‘i’.
Find the exponent (power) of 2 for each ‘i’ and store the number with maximum exponent of 2 so faqrd in a variable , let say ‘max’. Set ‘max’ to ‘i’ only if ‘i’ has more exponent of 2 than ‘max’.
Return ‘max’.
Assumption: a <b

Note: If two or more numbers in the range have the same exponents of  2 , return the small number.

Example

Input:
7
12
Output:
8
Explanation:

Exponents of 2 in:

7-0

8-3

9-0

10-1

11-0

12-2

Hence maximum exponent if two is of 8.*/

#include <stdio.h>

// Function to count how many times 2 divides 'n'
int countExponentOf2(int n) {
    int count = 0;
    // Keep dividing n by 2 as long as it's even
    while (n % 2 == 0) {
        count++;
        n = n / 2;
    }
    return count;
}

int MaxExponents(int a, int b) {
    int maxExponent = 0; // stores highest exponent of 2 found so far
    int result = a;      // stores the number with highest exponent

    printf("Checking numbers from %d to %d...\n", a, b);

    for (int i = a; i <= b; i++) {
        int exp = countExponentOf2(i); // calculate exponent of 2 for current number

        // Print the number and its exponent
        printf("Number: %d → Exponent of 2: %d\n", i, exp);

        // If current exponent is greater than max found so far
        if (exp > maxExponent) {
            maxExponent = exp;
            result = i;
        }
        // If equal exponent, choose the smaller number (already in loop order)
        else if (exp == maxExponent && i < result) {
            result = i;
        }
    }

    return result;
}

int main() {
    // Example values from the problem
    int a = 7;
    int b = 12;

    // Call the function and get result
    int answer = MaxExponents(a, b);

    // Output the final result
    printf("\n Number with maximum exponent of 2 between %d and %d is: %d\n", a, b, answer);
    return 0;
}
