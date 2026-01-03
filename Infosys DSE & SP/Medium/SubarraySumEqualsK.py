
'''Subarray Sum Equals K [Medium]
Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
A subarray is a contiguous non-empty sequence of elements within an array.
Input: nums = [1,1,1], k = 2 Output: 2
Input: nums = [1,2,3], k = 3 Output: 2
Constraints:
1 <= nums.length <= 2 * 10^4 -1000 <= nums[i] <= 1000 -10^7 <= k <= 10^7
+'''

# Brute Force Approach - O(n²) Time, O(1) Space

def subarraySum(nums, k):

    count = 0
    
    # Outer loop: start of subarray
    for i in range(len(nums)):
        current_sum = 0
        # Inner loop: end of subarray
        for j in range(i, len(nums)):
            current_sum += nums[j]
            if current_sum == k:
                count += 1
    
    return count

# Main code
if __name__ == "__main__":
    # Input 
    n = int(input("Enter the size of array: "))
    nums = list(map(int, input("Enter the array elements (space-separated): ").split()))
    k = int(input("Enter the target sum k: "))
    
    # Solution
    result = subarraySum(nums, k)
    
    # Output
    print(f"Number of subarrays with sum equal to {k}: {result}")



# Optimized Approach - O(n) Time, O(n) Space
def subarraySumOptimized(nums, k):
    count = 0
    current_sum = 0
    hash_map = {0: 1}  # To handle the case when subarray starts from index 0

    for num in nums: 
        current_sum += num   
        prefix_needed = current_sum - k  # Check if there is a prefix sum that we can subtract to get k 
        if (prefix_needed) in hash_map:  # If such a prefix sum exists, add its frequency to count
            count += hash_map[prefix_needed]  # Add the number of times this prefix sum has occurred
        hash_map[current_sum] = hash_map.get(current_sum, 0) + 1 # Update the frequency of the current prefix sum

    return count

#java
'''
class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        int sum=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);

            }
            map.put(sum, map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}'''