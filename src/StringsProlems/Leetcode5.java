package StringsProlems;

public class Leetcode5 {

    public static String method(String s){

        if (s == null || s.isEmpty()) return null;

        int start =0;
        int end =0;

        for (int i=0;i<s.length();i++){

            int len1 = helper(s,i,i);
            int len2 =helper(s,i,i+1);

            int len = Math.max(len1,len2);

            if (len > end - start){
                start = i -(len-1) /2;
                end = i+ (len)/2;
            }

        }
        return s.substring(start,end+1);
    }

    public static int helper(String s, int left , int right){

        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right) ){
            left --;
            right ++;
        }

        return right -left -1;
    }
}
