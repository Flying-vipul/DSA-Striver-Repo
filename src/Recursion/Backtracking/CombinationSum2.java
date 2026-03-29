package Recursion.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        findCombinations(0,candidates,target,ans,new ArrayList<>());
        // hashSet can be converted into list of list type
        return ans;

    }

    public static void findCombinations(int ind, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds){

            if (target == 0){
                ans.add(new ArrayList<>());
            return;
            }


            for (int i=ind; i<= arr.length-1;i++) {
                if (i > ind && arr[i] == arr[i-1]) continue;
                if (arr[i] > target) break;

                ds.add(arr[i]);
                findCombinations(ind + 1, arr, target - arr[ind], ans, ds);
                ds.removeLast();
            }

    }
}
