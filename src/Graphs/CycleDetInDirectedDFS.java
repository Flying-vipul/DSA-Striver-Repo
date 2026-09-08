package Graphs;

import java.util.List;

public class CycleDetInDirectedDFS {

    public boolean checkCycle(int V, int node,List<List<Integer>> adjList, boolean[] isVisited, boolean[] isPathVisited){

        isVisited[node] = true;
        isPathVisited[node] = true;

        for (int ele:adjList.get(node)){
            if(!isVisited[ele]){
                if(checkCycle(V,ele,adjList,isVisited,isPathVisited)) return true;
            } else if (isPathVisited[ele]) {
                return true;
            }
        }

        isPathVisited[node] = false;

        return false;

    }

    public boolean isCycle(int V, List<List<Integer>> adjList){

        boolean[] isVisited = new boolean[V];
        boolean[] isPathVisited = new boolean[V];

        for (int i=0;i<V;i++){
            if(!isVisited[i]){
                if(checkCycle(V,i,adjList,isVisited,isPathVisited))  return true;
            }
        }
        return false;
    }

}
