/*213. House Robber II
Solved
Medium
Topics
premium lock icon
Companies
Hint
You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed. All houses at this place are arranged in a circle. That means the first house is the neighbor of the last one. Meanwhile, adjacent houses have a security system connected, and it will automatically contact the police if two adjacent houses were broken into on the same night.

Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.

 

Example 1:

Input: nums = [2,3,2]
Output: 3
Explanation: You cannot rob house 1 (money = 2) and then rob house 3 (money = 2), because they are adjacent houses.
Example 2:

Input: nums = [1,2,3,1]
Output: 4
Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
Total amount you can rob = 1 + 3 = 4.
Example 3:

Input: nums = [1,2,3]
Output: 3 */


class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        int skipFirst[]=new int[n-1];
        int skipLast[]=new int[n-1];

        for(int i=0;i<n-1;i++){
            skipFirst[i]=nums[i+1];
            skipLast[i]=nums[i];
        }
        int res1=robHelp(skipFirst);
        int res2=robHelp(skipLast);
        int result=Math.max(res1,res2);
        return result;
    }
    public int robHelp(int a[]){
        int n=a.length;
        if(a==null || n==0){
            return 0;
        }
        int arr[]=new int[n+1];
        arr[0]=0;
        arr[1]=a[0];

        for(int i=2;i<=n;i++){
            arr[i]=Math.max(arr[i-1],arr[i-2]+a[i-1]);
        }
        return arr[n];
    }
}