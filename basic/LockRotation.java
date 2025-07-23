/*Given a lock made up of N different circular rings. Each ring has 0-9 digit printed on it. There is only one particular code which can open the lock. You can rotate each ring any number of times in either direction. Given the random sequence R and the desired sequence D, find the minimum number of rotations required to open the lock. 

 

Example 1:

Input: R = 222, D = 333
Output: 3
Explaination: Optimal number of rotations for 
getting 3 from 2 is 1. There are three 2 to 3 
transformations. So answer is 1+1+1 = 3.
 

Example 2:

Input: R = 2345, D = 5432
Output: 8
Explaination: The optimal shifts for pairs are: 
(2, 5) = 3, (3, 4) = 1, (4,3) = 1, (5,2) = 3. 
So total shifts = 3+1+1+3 = 8.*/

public class LockRotation {

    public static int minRotations(String R, String D) {
        int totalRotations = 0;

        for (int i = 0; i < R.length(); i++) {
            int from = R.charAt(i) - '0';
            int to = D.charAt(i) - '0';

            int diff = Math.abs(from - to);
            int rotation = Math.min(diff, 10 - diff);
            totalRotations += rotation;
        }

        return totalRotations;
    }

    public static void main(String[] args) {
        String R1 = "222", D1 = "333";
        System.out.println(minRotations(R1, D1));  // Output: 3

        String R2 = "2345", D2 = "5432";
        System.out.println(minRotations(R2, D2));  // Output: 8
    }
}
