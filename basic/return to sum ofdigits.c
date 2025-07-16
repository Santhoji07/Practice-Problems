/* call sum of digits of 123, the its sum 6 to be factorial that is 720 the reverse 27
*/


#include <stdio.h>

int rev(int n) {
    int r = 0;
    while(n) {
        r = r * 10 + n % 10;
        n /= 10;
    }
    return r;
}

int fact(int n) {
    int f = 1;
    for(int i = 2; i <= n; i++)
        f *= i;
    return rev(f);
}

int sum(int n) {
    int s = 0;
    while(n) {
        s += n % 10;
        n /= 10;
    }
    int result = fact(s);
    return result;
}

int main() {
    int res = sum(123);
    printf("%d", res);
    return 0;
}