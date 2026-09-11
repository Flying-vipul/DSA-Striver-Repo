package Graphs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BipartiteGraph {


    public boolean isBipt(int[][] graph){

        int rows = graph.length;
        int[] colors = new int[rows];
        Arrays.fill(colors,-1);
        for (int i=0;i<rows;i++){
            if(colors[i] == -1){
                if(!check(i,graph,colors)) return false;
            }
        }

        return true;
    }

    public boolean check(int currNode, int[][] graph, int[] colors){

        Queue<Integer> q =  new LinkedList<>();
        q.offer(currNode);
        colors[currNode] = 0;

        while (!q.isEmpty()){

            int poppedNode = q.poll();

            for (int neighbour:graph[poppedNode]){

                if(colors[neighbour] == -1){
                    colors[neighbour] = 1-colors[poppedNode];
                    q.offer(neighbour);
                } else if (colors[neighbour] == colors[poppedNode]) {
                    return false;
                }
            }
        }
        return true;
    }

}
