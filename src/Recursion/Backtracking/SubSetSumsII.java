package Recursion.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSetSumsII {


    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ansList = new ArrayList<>();
        findSubsets(0,nums,new ArrayList<>(),ansList);
        return ansList;
    }
    public static void  findSubsets(int idx, int[] nums,List<Integer> ds, List<List<Integer>> ansList){
        ansList.add(new ArrayList<>(ds));
        for (int i=idx;i< nums.length;i++){
            if (i!=idx && nums[i] == nums[i-1]) continue;
            ds.add(nums[i]);
            findSubsets(i+1,nums,ds,ansList);
            ds.removeLast();
        }
    }
}
