public class bubblesort {

    public static int BubbleSorting(int[] nums) {
        int count = 0;
        int n = nums.length;

        if (n != 0) {
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (nums[j] > nums[j + 1]) {
                        // Swap adjacent elements
                        int temp = nums[j];
                        nums[j] = nums[j + 1];
                        nums[j + 1] = temp;
                        count++;
                    }
                }
            }
        }

        return count;
    }

    public static void main(String args[]) {
        int nums[] = {23, 45, 24, 66};
        int swaps = BubbleSorting(nums);

        System.out.println("Number of swaps: " + swaps);
        System.out.print("Sorted array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
