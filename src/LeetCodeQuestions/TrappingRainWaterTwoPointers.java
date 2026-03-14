package LeetCodeQuestions;

public class TrappingRainWaterTwoPointers {

    public int trap(int[] heights) {
        int n= heights.length;
        int ans =0, l=0,lMax =0,rMax =0;
        int r =n-1;

        while (l <r) {
            lMax = Math.max(lMax, heights[l]);
            rMax = Math.max(rMax, heights[r]);
            l++;
            r--;
        }
        if (lMax < rMax) {
            ans = lMax - heights[l];
        }else {
            ans = rMax - heights[r];
        }
        return ans;
    }
}
