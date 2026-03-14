package StringsProlems;

import java.util.Objects;

public class Leetcode1201 {

    public static String method(String s){

        StringBuilder sb = new StringBuilder();
         int count =0;

         for(int i=0;i < s.length(); i++) {
             char currentChar = s.charAt(i);

             if (currentChar == '(') {
                 if (count > 0){
                     sb.append(currentChar);
                 }
                 count ++;

             }else{
                 count --;

                 if (count > 0){
                     sb.append(currentChar);
                 }
             }

         }

        return sb.toString();
    }
}
