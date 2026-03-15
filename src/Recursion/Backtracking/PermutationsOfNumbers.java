package Recursion.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class PermutationsOfNumbers {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums);
        return result;
    }

    public static void backtrack(List<List<Integer>> result, List<Integer> currentPath, int[] nums){

        if (currentPath.size() == nums.length) {
            result.add(new ArrayList<>(currentPath));
            return;
        }

        for (int num:nums){
            if (currentPath.contains(num)){
                continue;
            }

            currentPath.add(num);

            backtrack(result,currentPath,nums);

            currentPath.removeLast();
        }
    }



}
