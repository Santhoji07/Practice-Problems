/*Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

 

Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
 

Constraints:

1 <= nums.length <= 105
-231 <= nums[i] <= 231 - 1
0 <= k <= 105 */

public class rotated_array {

    // Function to reverse part of the array
    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            // Swap nums[start] and nums[end]
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }

    // Function to rotate array to the right by k steps
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Step 1: Normalize k

        // Step 2: Reverse entire array
        reverse(nums, 0, n - 1);

        // Step 3: Reverse first k elements
        reverse(nums, 0, k - 1);

        // Step 4: Reverse remaining n-k elements
        reverse(nums, k, n - 1);
    }

    // Test the logic
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        rotate(nums1, 3);
        for (int num : nums1) System.out.print(num + " "); // Output: 5 6 7 1 2 3 4

        System.out.println();

        int[] nums2 = {-1, -100, 3, 99};
        rotate(nums2, 2);
        for (int num : nums2) System.out.print(num + " "); // Output: 3 99 -1 -100
    }
}


/*c code:

void reverse(int nums[], int start, int end){
    while(start<end){
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;

        start++;
        end--;
    }
}

void rotate(int nums[], int n, int k){
    k=k%n;

    reverse(nums,0,n-1);

    reverse(nums,0,k-1);

    reverse(nums, k,n-1);

}

int soluution(){
    int nums1[]={1, 2, 3, 4, 5, 6, 7};
    int size1=sizeof(nums1)/sizeof(nums1[0]);
    rotate(nums1,size1,3);

    for(int i=0;i<size1;i++){
        printf("%d",nums1[i]);
    }

    printf("\n");

    int nums2[] = {-1, -100, 3, 99};
    int size2 = sizeof(nums2) / sizeof(nums2[0]);
    rotate(nums2, size2, 2);

    for (int i = 0; i < size2; i++) {
        printf("%d ", nums2[i]); // Output: 3 99 -1 -100
    }

    return 0;
}*/