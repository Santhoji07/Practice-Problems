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
