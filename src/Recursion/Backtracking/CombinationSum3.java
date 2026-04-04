package Recursion.Backtracking;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), k, n, 1);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> currentCombo, int k, int remain, int start) {
        // Base case: if combo size is k and remaining sum is 0
        if (currentCombo.size() == k && remain == 0) {
            result.add(new ArrayList<>(currentCombo));
            return;
        }

        // If we exceed the size limit or the sum becomes negative, stop exploring
        if (currentCombo.size() == k || remain < 0) {
            return;
        }

        for (int i = start; i <= 9; i++) {
            // Optimization to stop loop early
            if (remain - i < 0) break;

            currentCombo.add(i); // Choose
            backtrack(result, currentCombo, k, remain - i, i + 1); // Explore
            currentCombo.remove(currentCombo.size() - 1); // Backtrack
        }
    }
}
