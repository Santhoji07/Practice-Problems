#include <stdio.h>

int main() {
    int num, count = 0;
    int third = 0, fourth = 0;

    while (scanf("%d\n", &num) == 1) {
        count++;
        if (count == 3)
            third = num;
        else if (count == 4)
            fourth = num;
    }

    if (count >= 4)
        printf("%d", third + fourth);
    else
        printf("Not enough numbers");

    return 0;
}