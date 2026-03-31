package Recursion.Backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubSetSumsI {

    public static void fun(int ind, int sum, int N , ArrayList<Integer> arr, ArrayList<Integer> sumSubset){
        if (ind == N){
            sumSubset.add(sum);
            return;
        }
        fun(ind+1,sum+ arr.get(ind),N,arr,sumSubset);

        fun(ind+1,sum,N,arr,sumSubset);

    }

    public static ArrayList<Integer> method(ArrayList<Integer> arr, int N){

        ArrayList<Integer> sumSubset = new ArrayList<>();
        fun(0,0,N,arr,sumSubset);
        Collections.sort(sumSubset);
        return sumSubset;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(1);
        arr.add(2);
        int N=arr.size();
        ArrayList<Integer> ans = method(arr,N);
        System.out.println(ans);
    }

}
