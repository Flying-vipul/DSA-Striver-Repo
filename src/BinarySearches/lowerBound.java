package BinarySearches;

public class lowerBound {

    public static int lowerBoundMethod(int[] nums, int x) {
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

    static void main(String[] args) {
        int[] arr = {1,2,2,3};
        int res = lowerBoundMethod(arr,2);
        System.out.println(res);
    }
}
