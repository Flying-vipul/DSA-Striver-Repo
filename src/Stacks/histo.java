package Stacks;

import java.util.Arrays;

public class histo {

    public static int maximalRectangle(char[][] matrix) {

        int x = matrix.length;
        int y = matrix[0].length;
        int max = 0;

        int[][] preSum = new int[x][y];
        for (int i = 0; i < y; i++) {
            int sum = 0;
            for (int j = 0; j < x; j++) {
                // FIX 1: Convert char '1' or '0' to actual int 1 or 0
                sum += (matrix[j][i] - '0');
                // FIX 2: Check against character '0' instead of integer 0
                if (matrix[j][i] == '0') sum = 0;
                preSum[j][i] = sum;
            }
        }

        for (int i = 0; i < x; i++) {
            max = Math.max(max, method(preSum[i]));
        }

        return max;

    }

    public static int method(int[] arr) {
        int n = arr.length;
        int max = 0;

        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] <= arr[j]) {
                    count++;
                } else {
                    break;
                }

            }
            // FIX 3: Fixed the loop update expression from j++ to j--
            for (int j = i - 1; j >= 0; j--) {
                if (arr[i] <= arr[j]) {
                    count++;
                } else {
                    break; // Stop immediately!
                }
            }

            max = Math.max(max, count * arr[i]);
        }

        return max;
    }

    public static void main(String[] args) {
        char[][] input = {
                {'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'}
        };
        int res = maximalRectangle(input);
        System.out.println(res);
    }
}