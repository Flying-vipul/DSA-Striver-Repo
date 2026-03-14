package StringsProlems;

import java.util.*;

public class Leetcode451 {

    public static String method(String s){


        Map<Character,Integer> charMap =new HashMap<>();
        for (char ele: s.toCharArray()){
            charMap.put(ele, charMap.getOrDefault(ele,0) +1);
        }

        List<Character> charList = new ArrayList<>(charMap.keySet());

        // now sort them
        charList.sort((a, b) -> charMap.get(b) - charMap.get(a));

        StringBuilder result = new StringBuilder();
        for (char ele:charList){
            int freq = charMap.get(ele);
            for (int i=1;i <=freq ;i++){
                result.append(ele);
            }
        }

        return result.toString();

    }

    public static void main(String[] args) {
        String s = "tree";

        String res = method(s);

        System.out.println(res);
    }
}
