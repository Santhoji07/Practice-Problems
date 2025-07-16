/*
*      *
**    **
***  ***
********

| Row | Stars left | Spaces | Stars right |
| --- | ---------- | ------ | ----------- |
| 1   | 1          | 9      | 1           |
| 2   | 2          | 6      | 2           |
| 3   | 3          | 3      | 3           |
| 4   | 4          | 0      | 4           |


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
