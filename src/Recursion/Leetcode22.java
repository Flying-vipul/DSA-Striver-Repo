package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Leetcode22 {

    public  List<String> generateParenthesis(int n){

        List<String> result = new ArrayList<>();
        backTrack(result,new StringBuilder(),0,0,n);
        return result;


    }
    private void backTrack(List<String> result,StringBuilder current, int open, int close, int n){

        //base case :
        if (current.length() == n*2){
            result.add(current.toString());
            return;
        }

        //option 1: add an opening bracket
        if (open<n){
            current.append("(");
            backTrack(result,current,open+1,close,n);
            current.deleteCharAt(current.length()-1);
        }
        if (close < n){
            current.append(")");
            backTrack(result,current,open,close+1,n);
            current.deleteCharAt(current.length()-1);
        }
    }
}
