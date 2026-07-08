package BinarySearches;

public class floorCeil {

    public int[] getFloorAndCeil(int[] nums, int x) {
        int n = nums.length;
        int low = 0;
        int high =n-1;
        int[] ans = new int[2];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid] == x) return new int[]{x,x};
            if(nums[mid]<=x){
                max=Math.max(nums[mid],max);
                low=mid+1;
            }else if(nums[mid]>=x){
                min=Math.min(nums[mid],min);
                high = mid-1;
            }
        }
        ans[0] = max;
        ans[1] = min;
        return ans;
    }
}
