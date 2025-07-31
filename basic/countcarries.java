import java.util.Scanner;

public class countcarries {
    static int countCarries(int a, int b) {
        int carry = 0, count = 0;

        while (a > 0 || b > 0) {
            int sum = (a % 10) + (b % 10) + carry;
            if (sum >= 10) {
                carry = 1;
                count++;
            } else {
                carry = 0;
            }
            a /= 10;
            b /= 10;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two positive integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = countCarries(a, b);
        System.out.println("Number of carries: " + result);
    }
}
