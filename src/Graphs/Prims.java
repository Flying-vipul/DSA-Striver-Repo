package Graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Prims {

    public int prims(int V, List<List<List<Integer>>> adjList){


        boolean[] isVisited = new boolean[V];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0]-b[0]);
        pq.offer(new int[]{0,0});

        int min = 0;
        isVisited[0] = true;
        while(!pq.isEmpty()){
            int[] curr = pq.poll();
            int currW = curr[0];
            int currDest = curr[1];

            if(isVisited[currDest]) continue;

            isVisited[currDest] =true;
            min+=currW;
            for(List<Integer> ele:adjList.get(currDest)){
                int getDest = ele.get(0);
                int getWeight = ele.get(1);
                if(!isVisited[getDest]){
                    pq.offer(new int[]{getWeight,getDest});
                }
            }
        }

        return min;
    }
}
