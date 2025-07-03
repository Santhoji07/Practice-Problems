/*Union of two sorted arrays

Given two sorted arrays nums1 and nums2, return an array that contains the union of these two arrays. The elements in the union must be in ascending order.



The union of two arrays is an array where all values are distinct and are present in either the first array, the second array, or both.


Examples:
Input: nums1 = [1, 2, 3, 4, 5], nums2 = [1, 2, 7]

Output: [1, 2, 3, 4, 5, 7]

Explanation: The elements 1, 2 are common to both, 3, 4, 5 are from nums1 and 7 is from nums2

Input: nums1 = [3, 4, 6, 7, 9, 9], nums2 = [1, 5, 7, 8, 8]

Output: [1, 3, 4, 5, 6, 7, 8, 9]

Explanation: The element 7 is common to both, 3, 4, 6, 9 are from nums1 and 1, 5, 8 is from nums2import java.util.*;
*/

public class 11_UnionofTwoSortedArrays {

    public static List<Integer> union(int[] nums1, int[] nums2) {
        // Use a set to store unique elements
        Set<Integer> set = new HashSet<>();

        // Add all elements from nums1
        for (int num : nums1) {
            set.add(num);
        }

        // Add all elements from nums2
        for (int num : nums2) {
            set.add(num);
        }

        // Convert the set to a list
        List<Integer> result = new ArrayList<>(set);

        // Sort the list to get ascending order
        Collections.sort(result);

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {1, 2, 7};
        System.out.println("Union: " + union(nums1, nums2)); // [1, 2, 3, 4, 5, 7]

        int[] nums3 = {3, 4, 6, 7, 9, 9};
        int[] nums4 = {1, 5, 7, 8, 8};
        System.out.println("Union: " + union(nums3, nums4)); // [1, 3, 4, 5, 6, 7, 8, 9]
    }
}
