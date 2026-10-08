package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class KhansAlgo {

    class Solution {
        public boolean canFinish(int numCourses, int[][] prerequisites) {


            int rows = prerequisites.length;
            if(rows == 0) return true;
            int cols = prerequisites[0].length;
            List<List<Integer>> list = new ArrayList<>();

            for(int i=0;i<numCourses;i++){
                list.add(new ArrayList<>());
            }
            int[] inDegree = new int[numCourses];
            List<Integer> ans = new ArrayList<>();

            for (int[] prerequisite : prerequisites) {
                list.get(prerequisite[1]).add(prerequisite[0]);
                inDegree[prerequisite[0]]++;
            }

            Queue<Integer> q = new LinkedList<>();

            for(int i=0;i<numCourses;i++){
                if(inDegree[i] == 0){
                    q.offer(i);
                }
            }
            while(!q.isEmpty()){

                int getCurr = q.poll();
                ans.add(getCurr);

                for(int ele:list.get(getCurr)){
                    inDegree[ele]--;
                    if(inDegree[ele] == 0){
                        q.offer(ele);
                    }
                }
            }

            if(ans.size() != numCourses ) return false;

            return true;

        }
    }
}
