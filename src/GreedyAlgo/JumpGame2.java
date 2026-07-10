package GreedyAlgo;

public class JumpGame2 {

    public int jump(int[] nums) {
        int n = nums.length;
        return helperMethod(0,0,nums);
    }

    public int helperMethod(int index, int jumps,int[] nums){
        int n = nums.length;
        if (index>=n-1) return jumps;

        int mini = Integer.MAX_VALUE;
        for (int i=1;i<=nums[index];i++){
            mini=Math.min(mini,helperMethod(index+i,jumps+1, nums));
        }

        return mini;
    }
}
