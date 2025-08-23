class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n= nums.length;
        int pre=1;
        int post=1;
        int res[]=new int[n];

        for(int i=0;i<n;i++){  // Initialize the result array with 1s
            res[i]=1;
        }

        for(int i=0;i<n;i++){ // Calculate the prefix product
            res[i]*=pre;  // Multiply the current element by the prefix product
            pre*= nums[i];  // Update the prefix product with the current element
        }

        for(int i=n-1;i>=0;i--){  // Calculate the postfix product
            res[i]*=post;  // Multiply the current element by the postfix product
            post*= nums[i];  // Update the postfix product with the current element
        }
        return res;
    }
}