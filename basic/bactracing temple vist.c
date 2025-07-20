// Online C compiler to run C program online
/*Suppose if person a vistis a 4 times and at the end of 4th day his amt becomes 0, that each time he visits the temple the money get doubled so find the amt a had in statring day*/
#include <stdio.h>

int main() {
    
    // Write C code here
    int n=4;
    float amt =0;
    for(int i=0; i<n;i++){
        amt=(amt+100)/2;
        
    }
    
    printf("%f", amt);
    return 0;
}
//output: 93.75