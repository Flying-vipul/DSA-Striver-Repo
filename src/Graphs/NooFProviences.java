package Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class NooFProviences {

    public int findCircleNum(int[][] isConnected) {

        int rows = isConnected.length;
        int cols = isConnected[0].length;

        int count =0;
        boolean[] isVisited = new boolean[rows];

        for (int i=0;i<rows;i++){
            if (!isVisited[i]){
                count++;
                bfs(i,isConnected,isVisited,cols);
            }
        }
        return count;
    }


    private void bfs(int startCity, int[][] isConnected,boolean[] isVisited, int cols){

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(startCity);
        isVisited[startCity] = true;

        while (!queue.isEmpty()){

            int getCurrentCity = queue.poll();

            for (int j=0;j<cols;j++){
                if(isConnected[getCurrentCity][j] == 1 && !isVisited[j]){
                    isVisited[j] = true;
                    queue.offer(j);
                }
            }
        }
    }



}
