package PrefixSuffixAlgo;

public class leetcode303 {

    class NumArray {


        int[] prefixSums;

        public NumArray(int[] nums) {
           prefixSums = new int[nums.length];
           prefixSums[0] = nums[0];
           for (int i=1;i<nums.length;i++){
               prefixSums[i] = prefixSums[i-1] + nums[i];
           }
        }

        public int sumRange(int left, int right) {
            if (left == 0) {
                return prefixSums[right];
            }

            // Normal case: Total up to 'right' MINUS total up to the element just before 'left'
            return prefixSums[right] - prefixSums[left - 1];
        }

    }
}
