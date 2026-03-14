package Recursion;

public class Leetcode1922 {


       static int Mod = 1_000_000_007;
    public static int method(long n){

        long evenSpots = (n+1)/2;
        long oddSpots = n/2;

        long evenCombs = fastPow(5,evenSpots);
        long oddCombs =  fastPow(4,oddSpots);

        return (int) ((evenCombs * oddCombs) % Mod);
    }

    public static long fastPow(int k, long spots){

        if (spots == 0) return 1;

        long half = fastPow(k,spots/2);

        if (spots % 2 ==0){
            return (half * half) % Mod;
        }else{
            return (half * half *k) % Mod;
        }
    }
}
