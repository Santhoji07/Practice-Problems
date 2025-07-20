// Online C compiler to run C program online
#include <stdio.h>
#include<string.h>

int main() {
    char str[]="aabbbccaabb";
    char curr=str[0];
    int count=1;
    for(int i=1;i<strlen(str);i++){
        if(str[i]==curr)
        count++;
        else{
            printf("%c: %d: \n",curr, count);
            curr=str[i];
            count =1;
        }
    }

    return 0;
}

/*
a: 2 
b: 3 
c: 2 
a: 2 */