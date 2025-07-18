// Online C compiler to run C program online
#include <stdio.h>

int main() {
    // Write C code here
    float t=4.3;
    int count=0;
    
    while(t>=1){
        count++;
        t--;
    }
        printf("hours: %d ",count);
        printf("mins: %.2f",t*60);

    return 0;
}