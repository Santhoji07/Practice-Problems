/*198. House Robber
Solved
Medium
Topics
premium lock icon
Companies
You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.

 

Example 1:

Input: nums = [1,2,3,1]
Output: 4
Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
Total amount you can rob = 1 + 3 = 4.
Example 2:

Input: nums = [2,7,9,3,1]
Output: 12
Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
Total amount you can rob = 2 + 9 + 1 = 12.
 

Constraints:

1 <= nums.length <= 100
0 <= nums[i] <= 400 */

class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(nums==null || n==0){
            return 0;
        }
        int arr[]=new int[n+1];
        arr[0]=0;
        arr[1]=nums[0];

        for(int i=2;i<=n;i++){
            arr[i]=Math.max(arr[i-1],arr[i-2]+nums[i-1]);
        }
        return arr[n];
    }
}
/*Create a DP array (arr): where arr[i] represents the maximum money you can rob from houses 0 to i-1.

arr[0] = 0 (base case: no houses, no money)
arr[1] = nums[0] (base case: only first house available)
Fill the DP array (loop from index 2 to n):

For each house, you have two choices:
Skip it: Take the max money from previous house → arr[i-1]
Rob it: Take current house money + max money from two houses back → arr[i-2] + nums[i-1]
Take the maximum of these two choices
Return arr[n], which contains the maximum money robbing all houses. */