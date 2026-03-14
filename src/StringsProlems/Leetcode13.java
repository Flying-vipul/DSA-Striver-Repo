package StringsProlems;

import java.util.HashMap;
import java.util.Map;

public class Leetcode13 {


    public static int method(String s){

        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int result = 0;
        for (int i=0; i< s.length(); i++) {
            int curEle = map.get(s.charAt(i));


            if (i + 1 < s.length()) {
                int nxtCurrEle = map.get(s.charAt(i+1));
                if (curEle < nxtCurrEle) {
                    result -= curEle;
                } else {
                    result += curEle;
                }
            } else {
                result += curEle;
            }

        }

        return result;
    }
}
