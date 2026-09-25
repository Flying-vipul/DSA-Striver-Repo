package Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BellmanAlgo {

    public List<Integer> method(int src , int V, int[][] grid){

        int[] dist = new int[V];
        int INF = (int) 10e8;

        Arrays.fill(dist,INF);
        dist[src] =0;

        for (int i=0;i<V;i++){

            for (int[] ele:grid){
                int u=ele[0];
                int v =ele[1];
                int w = ele[2];

                if(dist[v] != INF && dist[u] + w < dist[v]){
                    dist[v] = dist[u]+w;
                }
            }
        }

        for(int[] ele:grid){
            int u = ele[0];
            int v = ele[1];
            int w = ele[2];

            if(dist[v] != INF && dist[u] + w < dist[v]){
                List<Integer> ans = new ArrayList<>();
                ans.add(-1);
                return ans;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int i=0;i<V;i++){
            ans.add(dist[i]);
        }
        return ans;
    }


}


