package LeetCodeQuestions;

import java.util.Arrays;

public class SortColors {

    public static int[] color(int[] nums){
        int n = nums.length;

        int low =0;
        int mid =0;
        int high =n-1;
        while (mid <= high){
            if (nums[mid] == 0){
                swap(nums,low,mid);
                low++;
                mid++;
            } else if (nums[mid] ==1) {
                mid++;
            }else {
                swap(nums,mid,high);
                high--;
            }
        }
        return nums;
    }
    public static void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }

    static void main() {
        int[] nums ={2,0,2,1,1,2};

        int[] result = color(nums);
        System.out.println(Arrays.toString(result));
    }
}
