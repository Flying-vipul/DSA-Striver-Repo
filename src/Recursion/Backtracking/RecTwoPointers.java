package Recursion.Backtracking;

import java.util.Arrays;

public class RecTwoPointers {

    public static void method(int head, int tail,int[] nums){

        if (head>=tail){
            return;
        }
        method(head+1,tail-1,nums);
        swap(head,tail,nums);

    }

    public static void swap(int head, int tail, int[] nums){
        int temp=nums[head];
        nums[head] = nums[tail];
        nums[tail] =temp;
    }

    public static void main(String[] args) {
        int[] nums ={1,2,3,4,5};
        method(0, nums.length-1,nums);

        System.out.println(Arrays.toString(nums));
    }
}
