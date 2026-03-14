package LeetCodeQuestions;

import java.util.HashMap;
import java.util.Objects;

public class validAnagram {

    // UNIVERSAL APPROACH
    public boolean isAnagram(String s1 , String s2) {

        HashMap<Character, Integer> mp1 = new HashMap<>();
        HashMap<Character,Integer> mp2 = new HashMap<>();

        if (s1.length() != s2.length()) {
            return false;
        }
        for (char c : s1.toCharArray()) {
            if (!(mp1.containsKey(c))) {
                mp1.put(c, 1);
            }else {
                Integer freq = mp1.get(c);
                mp1.put(c,freq+1);
            }
        }
        for (char c : s2.toCharArray()) {
            if (!(mp2.containsKey(c))) {
                mp2.put(c, 1);
            }else {
                Integer freq = mp2.get(c);
                mp2.put(c,freq+1);
            }
        }

        if (mp1.equals(mp2)){
            return true;
        }
        return false;
    }

    // OPTIMIZED APPROACH FOR ONLY 26 characters of alphabets

    public boolean isAnagram2(String s1, String s2) {

        if (s1.length() != s2.length())  return false;
        int[] arr = new int[26];

        for(int i=0; i< s1.length(); i++) {
            arr[s1.charAt(i) - 'a'] ++;
            arr[s2.charAt(i) - 'a']--;
        }

        for (int count : arr) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}

