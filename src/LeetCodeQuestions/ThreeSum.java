package LeetCodeQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public List<List<Integer>> method(int[] numbers) {
        int n= numbers.length;
        List<List<Integer>> ans = new ArrayList<>();
        for (int i=0;i<n;i++){
            if (i > 0&& numbers[i] == numbers[i-1]) continue;

            int j = i+1 , k = n-1;

            while (j < k) {
                int sum = numbers[i] + numbers[j] + numbers[k];

                if(sum < 0) {
                    j ++;
                } else if (sum>0) {
                    k--;
                }else {
                    ans.add(Arrays.asList(numbers[i], numbers[j], numbers[k]));
                    j++; k--;

                    // to avoid the duplicates of triplets
                    while (j < k && numbers[j] == numbers[j - 1]) j++;
                    while (j < k && numbers[k] == numbers[k + 1]) k--;                }

            }
        }
        return ans;

    }
}
