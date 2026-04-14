package BitManipulation;

public class Leetcode231 {

    public static boolean method(int n) {

        return  n>0 && (n & (n-1)) == 0;
    }
}
