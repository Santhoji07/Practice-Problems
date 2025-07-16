/*
1     4
 2   3
  3 3
   4
  3 3
 2   2
1     1

| Row | Spaces | Left Num | Inner Spaces | Right Num |
| --- | ------ | -------- | ------------ | --------- |
| 1   | 0      | 1        | 5            | 4         |
| 2   | 1      | 2        | 3            | 3         |
| 3   | 2      | 3        | 1            | 3         |
| 4   | 3      | 4        | 0            | (none)    |

| Row | Spaces | Left Num | Inner Spaces | Right Num |
| --- | ------ | -------- | ------------ | --------- |
| 5   | 2      | 3        | 1            | 3         |
| 6   | 1      | 2        | 3            | 2         |
| 7   | 0      | 1        | 5            | 1         |

✅ How to Print It
Total rows = 2 * n - 1

For rows 1 to n:

Print spaces

Print left number

Print inner spaces

Print right number (only if not the middle row)

For rows n+1 to 2n-1:

Mirror the logic using 2n - row

✅ C Program
Let’s code it for n = 4:



*/

#include <stdio.h>

int main() {
    int n = 4;

    // Top half
    for (int i = 1; i <= n; i++) {
        // Leading spaces
        for (int j = 1; j < i; j++) {
            printf(" ");
        }

        // Left number
        printf("%d", i);

        // Inner spaces
        int spaces = 2 * (n - i) - 1;

        if (spaces > 0) {
            for (int j = 1; j <= spaces; j++) {
                printf(" ");
            }
            // Right number
            printf("%d", n - i + 1);
        }

        printf("\n");
    }

    // Bottom half
    for (int i = n - 1; i >= 1; i--) {
        // Leading spaces
        for (int j = 1; j < i; j++) {
            printf(" ");
        }

        // Left number
        printf("%d", i);

        // Inner spaces
        int spaces = 2 * (n - i) - 1;

        if (spaces > 0) {
            for (int j = 1; j <= spaces; j++) {
                printf(" ");
            }
            // Right number
            printf("%d", i);
        }

        printf("\n");
    }

    return 0;
}
