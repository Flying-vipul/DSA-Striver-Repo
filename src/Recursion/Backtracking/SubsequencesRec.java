package Recursion.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class SubsequencesRec {


    public static void method(int i,int[] nums, List<Integer> list,int n){
        if (i == n){
            System.out.println(list);
            if (list.isEmpty()) {
                System.out.println("{}");
            }
            return;
        }
        list.add(nums[i]);
        method(i+1,nums,list,n);
        list.removeLast();
        method(i+1,nums,list,n);

    }

    public static void main(String[] args) {
         int[] nums = {3,1,2};
         int n = nums.length;
        List<Integer> list = new ArrayList<>();
        method(0,nums,list, n);
    }
}
