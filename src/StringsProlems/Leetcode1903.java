package StringsProlems;

public class Leetcode1903 {

    public static String method(String s){

        for (int i=s.length()-1; i>=0 ;i--){

            int c  = s.charAt(i);

            if (c == '1'|| c == '3'|| c == '5' || c == '7' || c=='9'){
                return  s.substring(0,i+1);
            }
        }

        return "";
    }
}
