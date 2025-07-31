import java.util.Arrays;

public class largestandsmallestelement {
    public static int LargestSmallest(int[] nums) {
        int sum;

        if (nums.length<2) {
            return -1;
        }

        Arrays.sort(nums); 

        int low = nums[0];      
        int high = nums[nums.length - 1]; 

        sum = low + high;

        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {5, 1, 8, 3, 2};
        int result = LargestSmallest(nums);
        System.out.println("Sum of largest and smallest: " + result);
    }
}
