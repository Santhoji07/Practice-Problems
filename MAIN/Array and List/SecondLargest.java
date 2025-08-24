/*Given an array of integers nums, return the second-largest element in the array. If the second-largest element does not exist, return -1.


Examples:
Input: nums = [8, 8, 7, 6, 5]

Output: 7

Explanation: The largest value in nums is 8, the second largest is 7

Input: nums = [10, 10, 10, 10, 10]

Output: -1

Explanation: The only value in nums is 10, so there is no second largest value, thus -1 is returned*/


public class SecondLargest {
    
    // Method to find the second-largest element in the array
    public static int econdLargest(int[] nums) {
        // Initialize 'first' and 'second' with the smallest possible integer value
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        // Loop through each element in the array
        for (int num : nums) {
            // If the current number is greater than the largest found so far
            if (num > first) {
                // Update second to be the old first
                second = first;
                // Update first to the new largest number
                first = num;
            } 
            // If the current number is between first and second (not equal to first)
            else if (num > second && num < first) {
                // Update second to this number
                second = num;
            }
        }

        // After the loop, if second was never updated, return -1
        return (second == Integer.MIN_VALUE) ? -1 : second;
    }

    // Main method to test the above logic with sample inputs
    public static void main(String[] args) {
        // Test case 1: normal case with distinct numbers
        System.out.println(secondLargest(new int[]{8, 8, 7, 6, 5}));   // Output: 7

        // Test case 2: all elements are the same
        System.out.println(secondLargest(new int[]{10, 10, 10, 10})); // Output: -1

        // Test case 3: only two elements
        System.out.println(secondLargest(new int[]{1, 2}));           // Output: 1

        // Test case 4: only one element, so no second largest
        System.out.println(secondLargest(new int[]{3}));              // Output: -1
    }
}
