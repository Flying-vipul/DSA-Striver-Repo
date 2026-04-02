package Recursion.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class SubSet {

    public static List<List<Integer>> subsets(int[] nums) {

        int N= nums.length;
        List<List<Integer>> res = new ArrayList<>();
        fun(0,N,nums,new ArrayList<>(),res);
        return res;

    }

    public static void fun(int idx, int N, int[] nums,List<Integer> ds,List<List<Integer>> res){

        if (idx == N){
            res.add(new ArrayList<>(ds));
            return;
        }
        ds.add(nums[idx]);
        fun(idx+1,N,nums,ds,res);
        ds.removeLast();
        fun(idx+1,N,nums,ds,res);
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> res = subsets(nums);
        System.out.println(res);
    }
}
