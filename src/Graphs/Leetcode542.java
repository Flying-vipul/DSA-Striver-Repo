package Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class Leetcode542 {


        public int[][] updateMatrix(int[][] mat) {

            int rows = mat.length;
            int cols = mat[0].length;

            int[][] dist = new int[rows][cols];
            boolean[][] isVisited = new boolean[rows][cols];
            Queue<int[]> queue = new LinkedList<>();

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (mat[i][j] == 0) {
                        queue.offer(new int[]{i, j, 0});
                        isVisited[i][j] = true;
                    }
                }
            }

            int[][] directions = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};


            while (!queue.isEmpty()) {
                int[] current = queue.poll();
                int r = current[0];
                int c = current[1];
                int steps = current[2];

                dist[r][c] = steps;

                for (int[] dir : directions) {
                    int newRow = r + dir[0];
                    int newCol = c + dir[1];

                    if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols
                            && !isVisited[newRow][newCol]) {

                        isVisited[newRow][newCol] = true;
                        queue.offer(new int[]{newRow, newCol, steps + 1});
                    }
                }
            }
            return dist;

        }




}
