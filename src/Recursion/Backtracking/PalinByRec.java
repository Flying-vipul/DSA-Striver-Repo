package Recursion.Backtracking;

public class PalinByRec {

    public static boolean method(int start,int end,String s){
        if (s.charAt(start) != s.charAt(end)){
           return false;
        }
        if (start>=end) return true;

        return method(start+1,end-1,s);
    }


    public static void main(String[] args) {
        String s = "rohit";
        boolean res = method(0,s.length()-1,s);
        System.out.println(res);
    }
}
