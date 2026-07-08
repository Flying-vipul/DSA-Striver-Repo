package BinarySearches;

public class leetcode34 {

    public static int lowerBound(int[] nums, int x) {
        int n= nums.length;
        int low = 0;
        int high = n-1;
        int min=n;
        while(low<=high){
            int mid = low+(high-low)/2;

            if(nums[mid]>=x){
                min = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return min;
    }

    public int upperBound(int[] nums, int x) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int min =n;
        while(low<=high){
            int mid = low+(high-low)/2;
            if (nums[mid]>x){
                min=mid;
                high=mid-1;
            }else {
                low = mid+1;
            }
        }
        return min;
    }

    public int[] searchRange(int[] nums, int target) {
        int firstPos = lowerBound(nums, target);

        if (firstPos == nums.length || nums[firstPos] != target) {
            return new int[]{-1, -1}; // Target frequency is 0
        }

        int lastPos = upperBound(nums, target) - 1;
        return new int[]{firstPos, lastPos};
    }
}
