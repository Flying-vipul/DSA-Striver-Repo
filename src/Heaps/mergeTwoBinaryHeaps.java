package Heaps;

import java.util.Arrays;
import java.util.List;

public class mergeTwoBinaryHeaps {

    public static   int[] method(int[] arr1, int[] arr2){
        int n = arr1.length;
        int m = arr2.length;
        int[] ans = new int[n+m];

        System.arraycopy(arr1, 0, ans, 0, n);
        if (m - n >= 0) System.arraycopy(arr2, n, ans, n, m - n);

        heapify(ans);

        return ans;
    }

    private static   void heapify(int[] arr){
        int n = arr.length;
        int i=0;
        while (n>i){
            int leftChildIdx = (2*i+1);
            int rightChildIdx = (2*i+2);

            int maxChildIdx = leftChildIdx;
            if (rightChildIdx < n && arr[leftChildIdx] < arr[rightChildIdx]){
                maxChildIdx = rightChildIdx;
            }
            if( arr[i]>=arr[maxChildIdx]){
                break;
            }
            swap(arr[maxChildIdx],arr[i]);
            i++;
        }
    }

    private static   void swap(int a, int b){
        int temp = a;
        a=b;
        b=temp;
    }

    static void main() {

        int[] n = {12,7,9};
        int[] m= {10,5,6,2};
        int[] ans = method(n,m);
        System.out.println(Arrays.toString(ans));


    }
}
