package Graphs;

import java.util.List;
import java.util.PriorityQueue;

public class MST {

    public int mst(List<List<int[]>> adjList, int V){

        boolean[] isVisited = new boolean[V];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0]-b[0]);

        pq.offer(new int[]{0,0});

        int minPath = 0;
        while(!pq.isEmpty()){

            int[] curr = pq.poll();

            int currWeight = curr[0];
            int currNode = curr[1];

            if(isVisited[currNode]){
                continue;
            }

            isVisited[currNode] = true;
            minPath+=currWeight;
            for (int[] ele:adjList.get(currNode)){
                int weight = ele[0];
                int node = ele[1];

                if(!isVisited[node]){
                    pq.offer(new int[]{weight,node});
                }
            }
        }
        return minPath;

    }
}
