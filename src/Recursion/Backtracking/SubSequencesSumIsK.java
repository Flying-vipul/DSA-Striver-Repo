package Recursion.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSequencesSumIsK {


    public static boolean backtrack(int[] nums,int i, List<Integer> list, int sum, int k){
        if (i== nums.length){
            if (sum == k){
                System.out.println(list);
                return true;
            }else{
                return false;
            }
        }
        list.add(nums[i]);
        sum+=nums[i];
        if(backtrack(nums, i + 1, list, sum, k)){
            return true;
        }
        list.removeLast();
        sum-=nums[i];
        if(backtrack(nums,i+1,list,sum,k)){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,1};
        int n= nums.length;
        int k=2;
        List<Integer> list = new ArrayList<>();
        backtrack(nums,0,list,0,k);
    }
}
