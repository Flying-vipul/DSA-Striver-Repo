package BitManipulation;

public class Leetcode643 {

    public static double findMaxAverage(int[] nums, int k) {



        double windowSum = 0;
        for (int i=0; i<k;i++){
            windowSum+=nums[i];
        }

        double maxSum = windowSum;
        for (int i=k;i<nums.length;i++){
            windowSum = windowSum + nums[i] - nums[i-k];

            maxSum  = Math.max(maxSum,windowSum);
        }

        return maxSum/k;
    }

    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        double res = findMaxAverage(nums,4);
        System.out.println(res);
    }
}
