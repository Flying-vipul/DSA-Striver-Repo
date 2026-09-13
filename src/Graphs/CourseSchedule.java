package Graphs;

import java.util.ArrayList;
import java.util.List;

public class CourseSchedule {


    public boolean canFinish(int numCourses, int[][] prerequisites) {

        List<List<Integer>> adjList = new ArrayList<>();
        for (int i=0;i<numCourses;i++){
            adjList.add(new ArrayList<>());
        }

        for (int[] prerequisite : prerequisites) {
            int course = prerequisite[0];
            int prereq = prerequisite[1];
            adjList.get(prereq).add(course);
        }
        boolean[] isVisited = new boolean[numCourses];
        boolean[] isPathVisited = new boolean[numCourses];

        for (int i=0;i<numCourses;i++){
            if(!isVisited[i]){
                if (checkCycle(numCourses,i,adjList,isVisited,isPathVisited)) return false;
            }
        }
        return true;
    }

    public boolean checkCycle(int numCourses,int node,List<List<Integer>> adjList, boolean[] isVisited, boolean[] isPathVisited){

        isVisited[node] = true;
        isPathVisited[node] = true;

        for (int ele:adjList.get(node)){
            if(!isVisited[ele]){
                if(checkCycle(numCourses,ele,adjList,isVisited,isPathVisited)) return true;
            } else if (isPathVisited[ele]) {
                return true;
            }
        }

        isPathVisited[node] = false;
        return false;
    }


}
