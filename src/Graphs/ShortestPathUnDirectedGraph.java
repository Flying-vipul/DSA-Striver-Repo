package Graphs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ShortestPathUnDirectedGraph {

    class Pair{
        int node;
        int dist;

        public Pair(int node, int dist){
            this.node=node;
            this.dist=dist;
        }
    }

    public int[] Path(List<List<Integer>> adjList){

        int V = adjList.size();

        Queue<Pair> q = new LinkedList<>();

        int[] distance = new int[V];
        Arrays.fill(distance,Integer.MAX_VALUE);

        q.offer(new Pair(0,0));

        distance[0] = 0;

        while (!q.isEmpty()){

            Pair get = q.poll();
            int currNode = get.node;
            int currDist = get.dist;

            for (int ele:adjList.get(currNode)){
                if (distance[ele] > currDist+1){
                    distance[ele] = currDist+1;
                    q.offer(new Pair(ele,currDist+1));
                }
            }
        }

        return distance;

    }

}
