package StringsProlems;

public class Leetcode151 {

    public static String method(String s){

        StringBuilder result = new StringBuilder();

        int i = s.length()-1;

        while (i >= 0){

            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }

            if (i < 0) {
                break;
            }

            int wordEnd =i;
            while(i >= 0 && s.charAt(i) != ' '){
                i--;
            }
            if(!result.isEmpty()){
                result.append(" ");
            }
            result.append(s.substring(i+1,wordEnd+1));
        }


        return result.toString();

    }

    public static void main(String[] args) {
        String s = "the sky is blue";

        String res = method(s);

        System.out.println(res);

    }
}
