/*

In the kingdom of Numaria, the ancient Mirror Oracle holds a secret: every number hides a palindrome deep within itself.

Legend says that a number, when shown its mirror image (its digits reversed), begins a journey. Each time, it adds its reflection to itself, transforming and evolving. This process continues until the number reaches a perfect symmetry—a palindrome, where the number reads the same forward and backward.

The wise wizard of Numaria, Algebrion, has tasked you with uncovering the mirror journey of a given number.

🧠 Your Task:
Given a number n, simulate its Mirror Transformation Journey by repeatedly:

Reversing its digits to obtain a reflected number r.

Adding r to n.

Repeating this process with the new sum until a palindrome is found.

Return the final palindrome number discovered.

📥 Input:
An integer n (where 1 ≤ n ≤ 10⁶)

📤 Output:
The palindrome number reached after one or more mirror transformations.

🧠 Constraints & Twist (for difficulty):
You must implement the digit reversal manually—do not use any string or array methods.

Optimize your code to avoid unnecessary iterations and handle the worst case within reasonable time.

🧪 Example:
Input:
78
Explanation:

78 + 87 = 165

165 + 561 = 726

726 + 627 = 1353

1353 + 3531 = 4884 ✅ Palindrome

Output:
4884

C code 
#include <stdio.h>

int main() {
    int n;
    printf("Enter a number: ");
    scanf("%d", &n);

    while (1) {
        int original = n;
        int reversed = 0, temp = n;

        // Reverse the number manually
        while (temp > 0) {
            reversed = reversed * 10 + temp % 10;
            temp = temp / 10;
        }

        // Check if it's a palindrome
        if (original == reversed) {
            printf("Palindrome after mirror transformation: %d\n", n);
            break;
        }

        // Otherwise, add reversed and repeat
        n = n + reversed;
    }

    return 0;
}

🔁 Iteration 1:
n = 78

original = 78

Reverse logic:

temp = 78

reversed = 0 * 10 + 78 % 10 = 0 + 8 = 8

temp = 78 / 10 = 7

reversed = 8 * 10 + 7 % 10 = 80 + 7 = 87

temp = 7 / 10 = 0

Final reversed = 87

original (78) != reversed (87) → not a palindrome

Add and update: n = 78 + 87 = 165
*/

public class palindrome {

    // Function to check if a number is a palindrome
    public static boolean isPalindrome(int num) {
        return num == reverseNumber(num);
    }

    // Function to reverse a number (manual, no strings)
    public static int reverseNumber(int num) {
        int rev = 0;
        while (num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        return rev;
    }

    // Function to simulate the mirror transformation journey
    public static int mirrorJourney(int n) {
        while (!isPalindrome(n)) {
            int reversed = reverseNumber(n);
            n = n + reversed;
        }
        return n;
    }

    // Main function to test
    public static void main(String[] args) {
        int n = 78; // You can change the input here
        int result = mirrorJourney(n);
        System.out.println("Output: " + result); // Output: 4884
    }
}



