package BitManipulation;

import java.util.ArrayList;
import java.util.List;

public class powerSet {

    public static List<List<Integer>> method(int[] nums){
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>(List.of());
        int subset = 1<<n;
        for (int num = 0;num <= subset-1;num++){
            List<Integer> list = new ArrayList<>(List.of());
            for (int i =0;i <=n-1; i++){
                if ((num & (1<<i))>0){
                    list.add(nums[i]);
                }
            }
            ans.add(list);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> res = method(nums);
        System.out.println(res);

    }
}
