#include<stdio.h>

int search(int n, int num, int arr[]){
    int i;
    for(i=0;i<n;i++){
        if(arr[i]==num)
        return i;
    }
    return -1;
}

int main(){
    int arr[]={1,2,3,4,5};
    int n = sizeof(arr)/sizeof(arr[0]);
    int num =4;
    int result=search( n,num,arr);

    printf("%d",result);

    return 0;
}