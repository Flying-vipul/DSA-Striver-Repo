package Heaps;

import java.util.*;

public class CPUScheduler {

     class newDs{
         int unlockTime;
         int remainingCount;

         public newDs(int unlockTime, int remainingCount) {
             this.unlockTime = unlockTime;
             this.remainingCount = remainingCount;
         }
     }

     public int method(int[] tasks, int n){

         int[] tasksFreq = new int[26];
         for (int ele:tasks){
             tasksFreq[ele-'A']++;
         }

         PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
         for (int ele:tasksFreq){
             if (ele>0){
                 maxHeap.add(ele);
             }
         }
         Queue<newDs> queue = new LinkedList<>();

         int time =0;
         while(!queue.isEmpty()|| !maxHeap.isEmpty()){

             time++;
             if (!maxHeap.isEmpty()){
                 int get = maxHeap.poll();
                 get--;
                 if (get>0){
                     queue.add(new newDs(time+n,get));
                 }

             }

             if (!queue.isEmpty()){
                 if (queue.peek().unlockTime==time){
                     int get = queue.peek().remainingCount;
                     maxHeap.add(get);
                     queue.poll();
                 }
             }
         }

         return time;
     }

}
