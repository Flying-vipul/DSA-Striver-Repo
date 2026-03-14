package MixedOfDSA;

public class pivoit {

    public static int method(int n){

        int sol = (n*(n+1))/2;

        int res = (int) Math.sqrt(sol);

        if (res * res == sol){
            return res;
        }

        return -1;
    }
}
