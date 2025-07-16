/*
*      *
**    **
***  ***
********
*/

#include <stdio.h>

int main() {
    int n = 4;
    for (int i = 1; i <= n; i++) {
        // Left stars
        for (int j = 1; j <= i; j++) {
            printf("*");
        }

        // Spaces
        for (int j = 1; j <= 2 * (n - i); j++) {
            printf(" ");
        }

        // Right stars
        for (int j = 1; j <= i; j++) {
            printf("*");
        }

        // Move to the next line
        printf("\n");
    }

    return 0;
}
