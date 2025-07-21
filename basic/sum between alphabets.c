#include <stdio.h>
#include <ctype.h>
int main() {
    char str[] = "a12b212c1";
    int sum = 0;
    int i = 0;

    while (str[i] != '\0') {
        if (isalpha(str[i])) {
            i++;
            int num = 0;
            while (isdigit(str[i])) {
                num = num * 10 + (str[i] - '0');
                i++;
            }
            sum += num;
        } else {
            i++;
        }
    }
    printf("%d\n", sum);
    return 0;
}
