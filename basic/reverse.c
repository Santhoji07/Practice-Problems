//calling reverse function

#include <stdio.h>

int reverseNumber(int n) {
    int reversed = 0;
    
    while(n != 0) {
        int digit = n % 10;          // Get last digit
        reversed = reversed * 10 + digit;  
        n = n / 10;                  // Remove last digit
    }
    
    return reversed;
}

int main() {
    int num;
    
    printf("Enter a number: ");
    scanf("%d", &num);
    
    int rev = reverseNumber(num);
    printf("Reversed number: %d\n", rev);
    
    
    return 0;
}
