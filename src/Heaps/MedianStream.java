package Heaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class MedianStream {

    class MedianFinder {
        PriorityQueue<Integer> minHeap;
        PriorityQueue<Integer> maxHeap;

        public MedianFinder() {
            this.minHeap=new PriorityQueue<>();
            this.maxHeap=new PriorityQueue<>(Collections.reverseOrder());
        }

        public void addNum(int num) {
            maxHeap.add(num);
            minHeap.add(maxHeap.poll());
            if (minHeap.size()>maxHeap.size()){
                maxHeap.add(minHeap.poll());
            }
        }

        public double findMedian() {
           double median=0.0;
           int totalEle = maxHeap.size()+minHeap.size();
           if (totalEle%2 ==0){
               median = (maxHeap.peek()+ minHeap.peek())/2.0;
           }else{
               median = maxHeap.peek();
           }
           return median;
        }
    }
}
