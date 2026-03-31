package CountingSort;

import java.util.Arrays;

public class ArrayPartition {

    public static int arrayPairSum(int[] nums) {

        Arrays.sort(nums);
        int i= 0;
        int j= 1;

        int sum =0;
        while(i<j && j <= nums.length-1){
            sum+=Math.min(nums[i],nums[j]);
            i+=2;
            j+=2;
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {6,2,6,5,1,2};
        int res = arrayPairSum(nums);
        System.out.println(res);
    }
}
