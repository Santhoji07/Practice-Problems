/*Upper Bound

Easy

Given a sorted array of nums and an integer x, write a program to find the upper bound of x.



The upper bound algorithm finds the first and smallest index in a sorted array where the value at that index is greater than a given key i.e. x.



If no such index is found, return the size of the array.


Examples:
Input : n= 4, nums = [1,2,2,3], x = 2

Output:3

Explanation:

Index 3 is the smallest index such that arr[3] > x.

Input : n = 5, nums = [3,5,8,15,19], x = 9

Output: 3

Explanation:

Index 3 is the smallest index such that arr[3] > x.*/
class Solution {
    public int upperBound(int[] nums, int x) {
        int low = 0;
        int high = nums.length;
        int ans = nums.length;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] > x) {
                ans = mid;
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
