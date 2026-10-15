package Graphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class DijkstraAlgo2 {


    public List<Integer> method(int n, int m , int[][] grid){

        int rows = grid.length;
        int col = grid[0].length;

        List<Integer> list =new ArrayList<>();

        List<List<int[]>> adjList = new ArrayList<>();
        for(int i=0;i<=n;i++){
            adjList.add(new ArrayList<>());
        }
        for(int[] ele:grid){
            int u = ele[0];
            int v = ele[1];
            int Weight = ele[2];
            adjList.get(u).add(new int[]{v,Weight});
            adjList.get(v).add(new int[]{u,Weight});
        }

        int[] dist = new int[n+1];
        int[] parent = new int[n+1];

        for(int i=0;i<=n;i++){
            dist[i] = Integer.MAX_VALUE;
            parent[i] =i;
        }
        dist[1] =0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0] - b[0]);
        pq.offer(new int[]{0,1});
        while(!pq.isEmpty()){

            int[] curr = pq.poll();
            int currNode = curr[1];
            int currWeight = curr[0];

            if(currWeight > dist[currNode]) continue;

            for(int[] ele:adjList.get(currNode)){

                int newNode = ele[0];
                int newW = ele[1]+currWeight;

                if(newW < dist[newNode]){
                    dist[newNode] = newW;
                    parent[newNode] = currNode;
                    pq.offer(new int[]{newW,newNode});
                }
            }
        }

        if(dist[n] == Integer.MAX_VALUE){
            list.add(-1);
            return list;
        }

        int node = n;
        while (parent[node] != node){
            list.add(node);
            node = parent[node];
        }

        list.add(1);
        Collections.reverse(list);

        list.add(0,dist[n]);

        return list;

    }
}
