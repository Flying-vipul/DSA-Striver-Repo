package Recursion.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class FiboInRec {

    public static int method(int n){
        if (n<=1) return n;

        return method(n-1) + method(n-2);
    }
    public static void method2(int n, List<Integer> plates){
        int currentSize = plates.size();
        if (currentSize >= n) return;

        if (currentSize == 0){
            plates.add(0);
        } else if (currentSize ==1) {
            plates.add(1);
        }else{
            int lastNum = plates.get(currentSize-1);
            int secondLast = plates.get(currentSize-2);
            plates.add(lastNum+secondLast);
        }

        method2(n,plates);
    }

    public static void main(String[] args) {
        int res = method(1);
        System.out.println(res);

        List<Integer> list = new ArrayList<>();
        method2(6,list);
        System.out.println(list);

    }
}
