package StringsProlems;

import java.util.Objects;

public class Leetcode796 {

    public static boolean method(String str , String goal){

        int n = str.length();

        if (str.length() != goal.length()) return false;

        if (str.equals(goal)) return true;

        String result = "";
        for (int i=0; i<n;i++ ){
          result =  str.substring(i+1,n) + str.substring(0,i+1);

          if (Objects.equals(result, goal)){
              return true;
          }
        }
        return false;
    }
}
