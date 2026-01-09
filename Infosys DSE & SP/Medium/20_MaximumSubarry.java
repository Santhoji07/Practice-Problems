/*53. Maximum Subarray

Medium

Given an integer array nums, find the subarray with the largest sum, and return its sum.

 

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
Example 2:

Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
 

Constraints:

1 <= nums.length <= 105
-104 <= nums[i] <= 104*/

class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]+sum<0){
                sum=0;
                continue;
            }else{
                sum+=nums[i];
                max=Math.max(sum,max);
            }
        }
        return max;
    }
}

/* Python 

res = nums[0] - Initialize result with first element
total = 0 - Running sum of current subarray
Loop through each number:
If total becomes negative, reset it to 0 (start fresh subarray)
Add current number to total
Update res if current sum is larger


def maxSubArray(nums: list[int]) -> int:
    res = nums[0]
    total = 0
    
    for n in nums:
        if total < 0:
            total = 0
        
        total += n
        res = max(res, total)
    
    return res
    */