package SlidingWindow;

public class maxConsecutiveOnes {

    public int longestOnes(int[] nums, int k) {

        int n = nums.length;
        int maxLen = 0;
        int currLen =0;
        int zeroes =0;

        int l=0;
        int r=0;
        while(r<n) {
            if (zeroes < k) {
                if (nums[r] == 1) {
                    r++;
                    currLen = r - l + 1;
                    maxLen = Math.max(currLen, maxLen);
                } else {
                    r++;
                    currLen = r - l + 1;
                    maxLen = Math.max(currLen, maxLen);
                    zeroes++;
                }
            }
            if (zeroes > k) {
                while(l<r) {
                    if (nums[l] != 1) {
                        zeroes--;
                        currLen--;
                        maxLen--;
                    }
                    l++;
                }
            }
        }
        return maxLen;
    }
}
