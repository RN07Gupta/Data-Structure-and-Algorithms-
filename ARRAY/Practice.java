
import java.util.*;

class Practice {

// 1 - Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct
    // public static boolean check(int num[]){
    //     for(int i=0 ; i<num.length ; i++){
    //         for(int j=i+1 ; j<num.length ; j++){
    //             if(num[i] == num[j]){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }
// 2 - There is an integer array nums sorted in ascending order (with distinct values).Prior to being passed to your function, nums is possibly rotated at an unknown pivot  index k (1  <=  k  <  nums.length)  such  that  the  resulting  array  is [nums[k], nums[k+1],   ...,   nums[n-1], nums[0],   nums[1],   ...,   nums[k-1]] (0-indexed).   For   example, [0,1,2,4,5,6,7] might        be        rotated        at        pivot        index 3   and become [4,5,6,7,0,1,2].Given the array nums after the possible rotation and an integer target, returnthe index oftarget if it is in nums, or -1   if it is not in nums.You must write an algorithm with O(log n) runtime complexity
    // public static void search(int nums[], int target){
    // }
// 5 - Given an integer array nums, return all the triplets [nums[i], nums[j],  nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.Notice that the solution set must not contain duplicate triplets
    // public static void triplet(int nums[]){
    //     for(int i=0 ; i<nums.length ; i++){
    //         for(int j=i+1 ; j<nums.length ; j++){
    //             for(int k=j+1 ; k<nums.length ; k++){
    //                 if((nums[i] + nums[j] + nums[k] == 0 )){
    //                     System.out.println("[" + nums[i] + ", " + nums[j] + ", " + nums[k] + "]");
    //                 }
    //             }
    //         }
    //     }
    // }
    public static int main(String args[]) {
        // int nums[] = {-1,0,1,2,-1,-4};
        // triplet(nums);

        // int num[] = {1,2,3,4};
        // boolean result = check(num);
        // System.out.println("Contains Duplicate: " + result);
        int[] arr = {3, 8, 15, 1, 6};

        Arrays.sort(arr);

        int minDiff = Integer.MAX_VALUE;

        // Step 1: Find minimum difference
        for (int i = 1; i < arr.length; i++) {
            minDiff = Math.min(minDiff, arr[i] - arr[i - 1]);
        }

        // Step 2: Print pairs with minimum difference
        System.out.println("Pairs with minimum absolute difference:");

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] == minDiff) {
                int a = arr[i - 1];
                int b = arr[i];
                System.out.println(a + " " + b);   // a < b and ascending
            }
        }
        return 0;

    }

}


