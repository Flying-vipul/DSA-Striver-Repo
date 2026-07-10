package GreedyAlgo;

public class JumpGame1 {


    public boolean canJump(int[] nums) {


        int n = nums.length;
        int maxReach =0;
        for (int i=0;i<n;i++){

            if (maxReach<i) return false;
            maxReach = Math.max(maxReach,(nums[i]+i));

            if (maxReach>=n-1) return true;
        }

        return false;
    }
}
