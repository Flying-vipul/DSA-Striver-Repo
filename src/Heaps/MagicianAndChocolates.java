package Heaps;

import java.util.Collections;
import java.util.PriorityQueue;


public class MagicianAndChocolates {

    public static int method(int[] arr,int A){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int ele:arr){
            maxHeap.add(ele);
        }
        int eat =0;

        while (A>0){
            int chocolate = maxHeap.remove();
            eat+=chocolate;
            maxHeap.add(chocolate/2);
            A--;
        }
        return eat;
    }

    static void main() {
        int[] arr ={2,4,8,6,10};
        System.out.println(method(arr,5));
    }

}

