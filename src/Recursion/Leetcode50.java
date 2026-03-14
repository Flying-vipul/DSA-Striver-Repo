package Recursion;

public class Leetcode50 {

    public static double method(double x, int n){

        long N = n;

        if (N < 0){
            x = 1/x;
            N = - N;
        }

        return pow(x,N);
    }

    public static double pow(double x, long n){

        if (n == 0) return 1;

        double half = pow(x,n/2);

        if (n % 2 == 0) {
            return half * half;
        }else {
            return half * half * x;
        }
    }

    public static void main(String[] args) {
        double ans = method(2.1,3);

        System.out.println(ans);
    }
}
