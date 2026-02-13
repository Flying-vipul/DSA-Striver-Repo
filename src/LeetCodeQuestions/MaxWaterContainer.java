package LeetCodeQuestions;

public class MaxWaterContainer {

    public static int maxArea(int[] heights) {

        int l = 0;
        int r = heights.length - 1;

        int maxArea = 0;

        while (l < r) {
            int width = 0;
           int height = Math.min(heights[l], heights[r]);

            // for width
            width = r - l;

            //for Area ;
            int area = height * width;
            maxArea = Math.max(area, maxArea);

            if (heights[l] > heights[r]) {
                r--;
            } else if (heights[l] < heights[r]) {
                l++;
            } else {
                l++;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] heights = {2,5,3,1,3,2,4,1};
        int result = maxArea(heights);
        System.out.println(result);
    }
}
