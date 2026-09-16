package Graphs;

import java.util.ArrayList;
import java.util.List;

public class Leetcode802 {


    public List<Integer> eventualSafeNodes(int[][] graph) {

        int n = graph.length;

        List<Integer> ans = new ArrayList<>();

        int[] newStates = new int[n];

        for (int i=0;i<n;i++){
            if (dfs(i, newStates, graph)){
                ans.add(i);
            }
        }

        return ans;
    }
    public boolean dfs(int node , int[] states , int[][] graph){

        if(states[node] != 0){
            return states[node] == 2;
        }

        states[node] = 1;

        for (int ele:graph[node]){
            if (!dfs(ele,states,graph))return false;
        }

        states[node] = 2;

        return  true;

    }
}
