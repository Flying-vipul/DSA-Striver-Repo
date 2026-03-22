package SearchingProblems;

public class EasyWindow {

    public static int method(int[] logs, int k){
        if (k<1) return -1;

        int i=0;
        int j=0;
        int sum =0;

        while(j< logs.length){
            if (sum <= sum+logs[j]){
                sum += logs[j];
                j++;
            }
            if (j-1 == k){
                sum -= logs[i];
                i++;
            }
        }

        return sum;
    }
}
