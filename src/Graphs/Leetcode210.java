package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Leetcode210 {

    public int[] findOrder(int numCourses, int[][] prerequisites) {

        List<List<Integer>> adjList = new ArrayList<>();

        for (int i=0;i<numCourses;i++){
            adjList.add(new ArrayList<>());
        }

        int[] inDegree  = new int[numCourses];

        for (int[] preq : prerequisites){
            int course = preq[0];
            int prequites = preq[1];
            adjList.get(prequites).add(course);
            inDegree[course]++;
        }

        int index =0;
        Queue<Integer> q = new LinkedList<>();

        for (int i=0;i<adjList.size();i++){
            if (inDegree[i] == 0){
                q.add(i);
            }
        }

        int[] result = new int[numCourses];

        while (!q.isEmpty()){
            int getCurr = q.poll();
            result[index++] = getCurr;

            for (int neighbour:adjList.get(getCurr)){

                inDegree[neighbour]--;

                if (inDegree[neighbour] == 0){
                    q.add(neighbour);
                }
            }

        }

        if (index == numCourses) return result;

        return new int[0];
     }
}
