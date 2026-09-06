package Graphs;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CycleDetInUndirectedBFS {

    class Pair {

        int node;
        int parent;

        public Pair(int node, int parent){
            this.node=node;
            this.parent=parent;
        }
    }

    public boolean isCycle(int V , List<List<Integer>> adjList){

        boolean[] isVisited = new boolean[V];

        for (int i=0; i<V;i++){
            if(!isVisited[i]){
               if( checkCycle(i,V,adjList,isVisited)) return true;
            }
        }
        return false;
    }

    private boolean checkCycle(int scr, int V, List<List<Integer>> adjList,boolean[] isVisited){

        Queue<Pair> queue = new LinkedList<>();

        queue.offer(new Pair(scr,-1));
        isVisited[scr] = true;

        while (!queue.isEmpty()){

            Pair getCurr = queue.poll();
            int currNode = getCurr.node;
            int currNodeParent = getCurr.parent;

            for (int adjacentNode:adjList.get(currNode)){

                if (!isVisited[adjacentNode]){
                    queue.offer(new Pair(adjacentNode,currNode));
                    isVisited[adjacentNode] = true;
                } else if (currNodeParent != adjacentNode) {
                    return true;
                }

            }

        }
        return false;

    }
}
