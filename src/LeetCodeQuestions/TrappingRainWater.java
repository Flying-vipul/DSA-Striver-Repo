package LeetCodeQuestions;

public class TrappingRainWater {

    public int method(int[] heights) {
        int n= heights.length;
        int[] lMax = new int[n];
        int[] rMax = new int[n];

        lMax[0] = heights[0];
        rMax[n-1] = heights[n-1];

        // to fill lMax
        for (int i =1; i<n;i++) {
            lMax[i]=Math.max(lMax[i-1],heights[i]);
        }
        // to fill rMax
        for (int j = n-2; j>=0;j--) {
            rMax[j]=Math.max(rMax[j+1],heights[j]);
        }
        int ans =0;
        for (int k =0; k<n;k++) {
            ans += (Math.min(lMax[k],rMax[k])-heights[k]);
        }

        return ans;
    }
}
