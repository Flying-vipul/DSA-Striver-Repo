package Recursion;

public class RobotsCells {

    public static int method(int n){

        //base case
        if(n == 0) return 0;

        //even
        if (n%2 == 0){
            return 1+method(n/2);
        } else {
            return  1+method(n-1);
        }

    }

    public static void main(String[] args) {
        int res = method(11);
        System.out.println(res);
    }
}
