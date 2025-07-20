/*(🧱 The Puzzle Stone

In a quiet village named Factorville, there lies an ancient stone puzzle with a number carved into it. The elders say:

> “Break this number into its smallest prime pieces, and the treasure will be yours.”



You are the chosen solver. Your task is to uncover all the prime factors of the number and list them in ascending order. If a prime repeats in the factorization, it must appear multiple times in your answer.


---

🧾 Examples from past solvers:

When the number on the stone was 75, the correct answer was:
3, 5, 5

When someone saw the number 19, since it was already a prime number, the answer was simply:
19

For the puzzle with the number 84, the stone opened when the solver answered:
2, 2, 3, 7
*/

// Online C compiler to run C program online
#include <stdio.h>

int main() {
    int n=120;
    int i=2;
    while(n>1){
        while(n%i==0) //120%2
        {
            printf("%d\t",i);
        n=n/i;
    }
    i++;
    }
}

//2	2	2	3	5


