/*283. Move Zeroes

Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

 

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]
 

Constraints:

1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1

*/

class MoveZeros {
    public void moveZeroes(int[] nums) {
        
        //base/edge condition to check length 1st before starting apporch to solve
        int n=nums.length;
            if(n==0|| n==1)
            return;
            
            int slow=0;
            int fast=0;

            while(fast<n){
                if(nums[fast]!=0){
                int temp=nums[fast];
                nums[fast]=nums[slow];
                nums[slow]=temp;

                slow++;
                fast++;
            }else{
                fast++;
            }
        }    
    }
}