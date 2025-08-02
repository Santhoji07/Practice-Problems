/*485. Max Consecutive Ones

premium lock icon
Companies
Hint
Given a binary array nums, return the maximum number of consecutive 1's in the array.

 

Example 1:

Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
Example 2:

Input: nums = [1,0,1,1,0,1]
Output: 2
 

Constraints:

1 <= nums.length <= 105
nums[i] is either 0 or 1.
*/

class Consicutiveones {
    public int findMaxConsecutiveOnes(int[] arr) {
        int ans=0; // Variable to store the maximum count of consecutive 1's
        int length=0;  // Variable to count the current length of consecutive 1's

        for(int i=0;i<arr.length;i++){  // Iterate through the array
            if(arr[i]==1){  // If the current element is 1, increment the length
                length++;  // Increment the count of consecutive 1's
            }else{
                ans=Math.max(ans,length);  // Update the maximum count if the current length is greater
                length=0;  // Reset the length to 0 when a 0 is encountered
            } 
        }
        ans=Math.max(ans,length); // After the loop, check again to ensure the last segment of 1's is considered
            return ans; 
    }
}