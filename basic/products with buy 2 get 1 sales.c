//write a program to find total sales from 100 products where 15 were single sales and a offer for buy 2 get 1 free so find the total sales
#include <stdio.h>

int main() {
    
    int tp=100;
    int ss=16;
    int MRP=0;
    
    int x=tp-ss;
    int d=(x/3);
    int r=x-d;
    MRP=ss+r;
    
    
    printf("%d",MRP);
    return 0;
}