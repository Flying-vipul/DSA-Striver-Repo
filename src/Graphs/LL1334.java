package Graphs;

import java.util.Arrays;

public class LL1334 {


    public int method(int n , int[][] grid , int thresholdDistance){

        int[][] dist = new int[n][n];

        int INF  = (int) 1e9;
        for(int i=0;i<n;i++){
            Arrays.fill(dist[i],INF);
            dist[i][i] = 0;
        }

        for(int[] edge:grid){
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];

            dist[u][v] = w;
            dist[v][u] = w;
        }

        for(int k=0;k<n;k++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(dist[i][k] != INF && dist[k][j]!=INF){
                        dist[i][j] = Math.min(dist[i][j],dist[i][k]+dist[k][j]);
                    }
                }
            }
        }

        int minReachable = Integer.MAX_VALUE;
        int bestCity = -1;

        for(int i=0;i<n;i++){
            int countCity = 0;
            for(int j=0;j<n;j++){
                if(i!=j && dist[i][j] <= thresholdDistance){
                    countCity++;
                }
            }
            if(countCity<=minReachable){
                bestCity = i;
                minReachable= countCity;
            }
        }

        return bestCity;
    }
}
