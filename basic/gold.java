//write a  function to accept Array of gold prices and return maximum profit that can be made with one buy transcation and one sell transaction
import java.util.Scanner;
import java.util.*;
public class gold {

    public static int Gold(int[] nums){
        int min=0;
        int max=0;
        int profit;
        int n=nums.length;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(nums[i]<nums[j]){
                    min=nums[i];
                }else{
                    max=nums[i];
                }
            }

        }
        profit=max-min;

        return profit;
    } 
    public static void main(String[] args){
        int nums[]={15,4,3,1,7,11,6};
        Gold(nums);

    }
    
}
