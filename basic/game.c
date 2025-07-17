// Online C compiler to run C program online
#include <stdio.h>
#include<stdlib.h>
#include<time.h>

int card_gen(int card_no);
int main()
{
    srand(time(0));
    char choice;
    printf("Lets play BLACKBOX\n");
    printf("---------------------------------------------------\n");
    int u_sum=0;
    u_sum+=card_gen(1);
    u_sum+=card_gen(2);
    printf("Do you want to add another card?(y/n)\n");
    scanf("%c",&choice);
    if(choice=='y') 
    {
        u_sum+=card_gen(3);
    }
    
    printf("Sum of your cards are %d\n",u_sum);
    printf("--------------------------------------------------\n");
    printf("My cards are : \n");
    int c_sum=0;
    c_sum+=card_gen(1);
    c_sum+=card_gen(2);
    printf("Sum of my cards is:%d",c_sum);
    if(u_sum==c_sum){
        printf("Its a Tie");
    } else if (u_sum>21){
        printf("Computer won the game");
    } else (u_sum<21 && u_sum>c_sum) {
        printf("User won the game");
    }
}
int card_gen(int card_no)
{
    char cards[13][10]={"2","3","4","5","6","7","8","9","10","A","K","Q","J"}
    int n=rand()%13;
    printf("card %d:%s\n",card_no,cards[n]);
    int val[]={2,3,4,5,6,7,8,9,10,10,10,10,10};
    return val[n];
}