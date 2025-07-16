#include <stdio.h>

int main() {
    char email[100];
    int i, flag = 0;

    printf("Enter email: ");
    scanf("%s", email);

    for(i = 0; email[i] != '\0'; i++);

    if(i >= 10 &&
       email[i-10] == '@' &&
       email[i-9] == 'g' &&
       email[i-8] == 'm' &&
       email[i-7] == 'a' &&
       email[i-6] == 'i' &&
       email[i-5] == 'l' &&
       email[i-4] == '.' &&
       email[i-3] == 'c' &&
       email[i-2] == 'o' &&
       email[i-1] == 'm') {
        flag = 1;
    }

    if(flag)
        printf("Valid Gmail\n");
    else
        printf("Invalid Gmail\n");

    return 0;
}