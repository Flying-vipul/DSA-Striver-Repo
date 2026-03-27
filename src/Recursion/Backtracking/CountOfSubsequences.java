package Recursion.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class CountOfSubsequences {

    public static int backtrack(int[] nums, int i, List<Integer> list, int sum, int k){
        if (i== nums.length){
            if (sum == k){
//                System.out.println(list);
                return 1;
            }else{
                return 0;
            }
        }
        list.add(nums[i]);
        sum+=nums[i];
        int  l= backtrack(nums, i + 1, list, sum, k);
        list.removeLast();
        sum-=nums[i];
        int r = backtrack(nums,i+1,list,sum,k);

        return l+r;
    }

    public static void main(String[] args) {
        int[] nums ={1,2,1};
        List<Integer> list = new ArrayList<>();
        int res = backtrack(nums,0,list,0,2);

        System.out.println(res);
    }
}
