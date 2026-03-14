package Recursion;

public class Leetcode258 {

    public static int method(int num){

        //base case
        if (num < 10) return num;

        int sumOfDigits = helper(num);
        return method(sumOfDigits);

    }

    public static int helper(int n){

        if (n==0) return 0 ;

        return (n%10) + helper(n/10);
    }
}
