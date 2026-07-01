package Heaps;

import java.util.*;

public class CPUScheduler {

     static class  newDS{
        int remainingCount;
        int unlockTime;

        public newDS(int remainingCount,int unlockTime){
            this.remainingCount=remainingCount;
            this.unlockTime=unlockTime;
        }
    }

    public static int schedule(char[] tasks, int n){

        int[] tasksCount = new int[26];
        for (char ele:tasks){
            tasksCount[ele - 'A']++;
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int ele:tasksCount){
            if (ele>0){
                maxHeap.add(ele);
            }
        }

        Queue<newDS> queue = new LinkedList<>();
        int time =0;
        while(!maxHeap.isEmpty() || !queue.isEmpty()) {
            time++;

            if (!maxHeap.isEmpty()){
                int get = maxHeap.poll();
                get--;
                if (get>0){
                    queue.add(new newDS(get,time+n));
                }
            }

            if (!queue.isEmpty()){
                if (queue.peek().unlockTime == time){
                    int get = queue.peek().remainingCount;
                    maxHeap.add(get);
                    queue.poll();
                }
            }
        }
        return time;
    }
}
