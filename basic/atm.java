import java.util.Scanner;

public class atm {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int pin=1234;
        System.out.println("Welcome to the ATM!");
        System.out.println("Please enter your PIN:");
        int Userpin=sc.nextInt();
        if(Userpin == 1234) {
            System.out.println("PIN accepted. You can now access your account.");
        } else {
            System.out.println("Incorrect PIN. Please try again.");
        }
        double balance = 1000; // Initial balance
        if( balance >0){
            System.out.println("Your balance is: " + balance);
        } else {
            System.out.println("Your balance is zero or negative.");
        }
        

        // Additional ATM functionality can be added here
    }
}


// Online C compiler to run C program online

#include <stdio.h>

int isValid(int arr[4]){

    int check[]={0,0,0,0};

    for(int i=0;i<4;i++){

        check[arr[i]-1]=1;

    }

    for(int i=0;i<4;i++){

        if(check[i]!=1)

            return 0;

    }

    return 1;

}

int main(){

    int puzzle[][4]={

        {2,1,3,4},

        {4,3,1,2},

        {1,2,4,3},

        {3,4,2,1}

    };

    int index=0;

    int checkArr[4];

    //rows

    for(int i=0;i<4;i++){

        index=0;

        for(int j=0;j<4;j++){

            checkArr[index++]=puzzle[i][j];

        }

        if(!isValid(checkArr)){

            printf("INVALID"); return 0;

        }

    }

     

    //columns

    for(int i=0;i<4;i++){

        index=0;

        for(int j=0;j<4;j++){

            checkArr[index++]=puzzle[j][i];

        }

        if(!isValid(checkArr)){

            printf("INVALID"); return 0;

        }

    }

    

    //R01C01

    if(!isValid((int[4]){puzzle[0][0],puzzle[0][1],puzzle[1][0],puzzle[1][1]})){

        printf("INVALID"); return 0;

    }

    //R01C23

    if(!isValid((int[4]){puzzle[0][2],puzzle[0][3],puzzle[1][2],puzzle[1][3]})){

        printf("INVALID"); return 0;

    }

    //R23C01

    index=0;

    for(int i=2;i<4;i++){

        for(int j=0;j<2;j++){

           checkArr[index++]=puzzle[i][j]; 

        }

    }

    if(!isValid(checkArr)){

        printf("INVALID"); return 0;

    }

    //R23C23

    index=0;

    for(int i=2;i<4;i++){

        for(int j=2;j<4;j++){

           checkArr[index++]=puzzle[i][j]; 

        }

    }

    if(!isValid(checkArr)){

        printf("INVALID"); return 0;

    }

    printf("VALID");

    return 0;

}


