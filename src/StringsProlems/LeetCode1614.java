package StringsProlems;

public class LeetCode1614 {

    public static int method(String s){

        int currDepth =0;
        int maxDepth =0;

        for (int i=0; i< s.length(); i++){

            if (s.charAt(i) == '('){
                currDepth++;
                maxDepth = Math.max(currDepth, maxDepth);

            }else{
                currDepth --;
            }

        }

        return maxDepth;
    }
}
