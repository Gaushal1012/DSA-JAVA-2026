import java.util.*;

public class RemoveDuplicatesArray{
    // public static int RemoveDuplicates(int[] nums, int result, int i){
    //     if(i == nums.length - 1){
    //         return result + 1;
    //     }

    //     // if(Math.abs(nums[j] - nums[i]) > 0){
    //     if(nums[i+1] - nums[i] > 0){
    //         result = result + 1;
    //         return RemoveDuplicates(nums, result, i+1);
    //     }else{
    //        return RemoveDuplicates(nums, result, i+1); 
    //     }
    // }

    public static int RemoveDuplicates(int[] nums, int i, int k){
        // Base case
        if(i == nums.length){
            return k;
        }

        // First element OR new unique element
        if(i == 0 || nums[i] != nums[k-1]){
            nums[k] = nums[i]; // place unique element
            k++;
        }

        return RemoveDuplicates(nums, i + 1, k);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt(); 
        }

        int result = RemoveDuplicates(nums, 0, 0);
        System.out.println("Result: " + result);
    }
}