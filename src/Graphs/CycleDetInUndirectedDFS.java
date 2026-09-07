package Graphs;

import java.util.ArrayList;
import java.util.List;

public class CycleDetInUndirectedDFS {


    public static boolean isCycle(int V,List<List<Integer>> adjList){

        boolean[] isVisited = new boolean[V];

        for (int i=0; i<V;i++){
            if(!isVisited[i]){
                if( checkCycle(i,-1,isVisited,adjList)) return true;
            }
        }
        return false;

    }

    public static boolean checkCycle(int node, int parent, boolean[] isVisited, List<List<Integer>> adjList) {
        isVisited[node] = true;

        for (int adjacentNode : adjList.get(node)) {
            if (!isVisited[adjacentNode]) {
                if (checkCycle(adjacentNode, node, isVisited, adjList)) {
                    return true;
                }
            }else if (adjacentNode != parent) {
                return true;
            }
        }
        return false;
    }

    static void main(String[] args) {
        int V = 3;

        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adjList.add(new ArrayList<>());
        }


        adjList.get(0).add(1);
        adjList.get(1).add(0);

        adjList.get(1).add(2);
        adjList.get(2).add(1);

        adjList.get(2).add(0);
        adjList.get(0).add(2);


        boolean hasCycle = isCycle(V, adjList);

        System.out.println("Executing DFS Cycle Detection...");
        System.out.println("Does the graph contain a cycle? -> " + hasCycle);
    }
}

