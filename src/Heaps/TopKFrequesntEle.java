package Heaps;

import java.util.*;

public class TopKFrequesntEle {


    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int ele : nums) {
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }

        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[1] - a[1]);

        for (int ele:map.keySet()){
            maxHeap.add(new int[]{ele, map.get(ele)});
        }

        int i=0;
        while(i<k){
            ans[i]= Objects.requireNonNull(maxHeap.poll())[0];
            i++;
        }

        return ans;

    }

    }

