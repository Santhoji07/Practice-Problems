/*Find square root of a number

Medium

Given a positive integer n. Find and return its square root. If n is not a perfect square, then return the floor value of sqrt(n).


Examples:
Input: n = 36

Output: 6

Explanation: 6 is the square root of 36.

Input: n = 28

Output: 5

Explanation: The square root of 28 is approximately 5.292. So, the floor value will be 5.*/


class Solution {
    public int sqrtFloor(int n) {
        if (n == 0 || n == 1) 
        return n;

        int left = 1;
        int right = n;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if ((long)mid * mid == n) {
                return mid;
            } else if ((long)mid * mid < n) {
                ans = mid; // potential floor value
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }
}