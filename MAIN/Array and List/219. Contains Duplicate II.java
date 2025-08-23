/*219. Contains Duplicate II
Solved
Easy
Topics
premium lock icon
Companies
Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

 

Example 1:

Input: nums = [1,2,3,1], k = 3
Output: true
Example 2:

Input: nums = [1,0,1,1], k = 1
Output: true
Example 3:

Input: nums = [1,2,3,1,2,3], k = 2
Output: false
 

Constraints:

1 <= nums.length <= 105
-109 <= nums[i] <= 109
0 <= k <= 105

Approach
Use a HashMap where the key is the number and the value is its most recent index.

Iterate through the array:

If the number already exists in the map, check the difference between the current index and the stored index.

If the difference ≤ k, return true.

Otherwise, update the index of the current number in the map.

If no such pair is found after the loop, return false.

Complexity
Time complexity: O(n) – Each element is processed once with constant-time map operations.

Space complexity:O(n) – At worst, all elements are stored in the map.

        //This is a BRUTE FORCE Approach//

        // for(int i=0;i<nums.length;i++)
        // {
        //     for(int j=i+1;j<nums.length;j++)
        //     {
        //         if(nums[i] == nums[j] && j-i <= k)
        //             return true;
        //     }
        // }
        // return false;*/

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int previousIndex=map.get(nums[i]);
                if(i-previousIndex<=k){
                    return true;
                }
            }
            map.put(nums[i],i);
        }
        return false;
    }
}

