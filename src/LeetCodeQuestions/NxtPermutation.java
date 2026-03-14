package LeetCodeQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NxtPermutation {


    void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    void reverse(int[] nums, int i) {
        int j = nums.length-1;
        while (i < j) {
            swap(nums,j,i);
            i++;
            j--;
        }
    }

    public void method(int[] nums) {

        int n = nums.length;
        int i= nums.length-2;

        while(i > 0 && nums[i] >= nums[i-1]){
            i--;
        }
        if (i >=0 ){
            int j = nums.length-1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums,i+1,j);
        }
        reverse(nums, i+1);
    }
}
