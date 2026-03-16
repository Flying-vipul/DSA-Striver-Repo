package Recursion.Backtracking;

public class BasicRecursionProblems {


    public static void method(String name, int n){
        if (n == 0) return;
        method(name,n-1);
        System.out.println(name);
    }

    public static void method2(int n){
        if (n==0) return;
        System.out.println(n);
        method2(n-1);
    }

    public static void method3(int i, int n){
        if (i<1) return;
        System.out.println(i);
        method3(i-1,n);
    }

    public static int method4(int n){
        if (n == 0){
            return 0;
        }
        int sum= n+method4(n-1);
        return sum;

    }

    public static int method5(int n){
        if (n==0) return 1;

        int fact = n*method5(n-1);
        return fact;

    }

    public static void main(String[] args) {
//        method("Vipul",5);
//        method2(5);
//        method3(50,3);
        int res = method4(3);
        System.out.println(res);

        int res2 = method5(4);
        System.out.println(res2);
    }
}
