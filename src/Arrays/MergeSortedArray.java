package Arrays;

public class MergeSortedArray {

    public static void method(int[] arr1,int m,int[] arr2,int n){
        int p1 = m-1;
        int p2 = n-1;
        int p = p1+p2;

        int[] ans = new int[m+n];

        while(p2>=0){

            if (p1>=0 && arr1[p1]>arr2[p2]){
                ans[p] = arr1[p1];
                p1--;
            }else{
                ans[p] = arr2[p2];
                p2--;
            }
            p--;
        }

    }
}
