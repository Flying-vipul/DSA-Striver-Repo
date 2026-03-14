package StringsProlems;

public class Leetcode8 {

    public static int method(String s){

        int n = s.length();
        int sign =1;
        int result =0;
        int index =0;

        //phase 1
        while (index < n && s.charAt(index) == ' ' ){
            index ++;
        }

        if (index == n){
            return 0;
        }

        // phase 2
        if (s.charAt(index) == '+' || s.charAt(index) == '-'){
            sign = (s.charAt(index) == '-') ? -1:1;
            index++;
        }

        // phase 3 and 4
        int limit = Integer.MAX_VALUE/10;

        while(index <n){

            if (s.charAt(index) < '0' || s.charAt(index) > '9'){
                break;
            }

            int digit = s.charAt(index) - '0';

            if (limit < result || (limit == result && digit > 7)){
                return (sign == -1) ? Integer.MIN_VALUE:Integer.MAX_VALUE;
            }

            result =  (result* 10 ) + digit;
            index ++;
        }

        return result*sign;

    }
}
