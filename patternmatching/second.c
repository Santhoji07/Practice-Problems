/*
********
***  ***
**    **
*      *

| Row | Left stars | Spaces | Right stars |
| --- | ---------- | ------ | ----------- |
| 1   | 4          | 0      | 4           |
| 2   | 3          | 2      | 3           |
| 3   | 2          | 4      | 2           |
| 4   | 1          | 6      | 1           |

*/

#include <stdio.h>

int main() {
    int n = 4;
    for (int i = 1; i <= n; i++) {
        // Left stars
        for (int j = 1; j <= n-i+1; j++) {
            printf("*");
        }

        // Spaces
        for (int j = 1; j <= 2*(i-1); j++) {
            printf(" ");
        }

        // Right stars
        for (int j = 1; j <= n-i+1; j++) {
            printf("*");
        }

        // Move to the next line
        printf("\n");
    }

    return 0;
}
