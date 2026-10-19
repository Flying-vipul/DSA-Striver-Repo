package SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ll438 {

    public static List<Integer> findAnagrams(String s, String p) {

        if (p.length()>s.length() || s.isEmpty()){
            return new ArrayList<>();
        }
        int[] pCount = new int[26];
        int[] windowCount = new int[26];

        for (int i=0;i< p.length();i++){
            pCount[p.charAt(i)-'a']++;
        }

        int l=0;
        int r=0;
        List<Integer> ans = new ArrayList<>();
        int windowSize = p.length();

        while(r<s.length()){

            windowCount[s.charAt(r)-'a']++;
            if (windowSize<(r-l+1)){
                windowCount[s.charAt(l)-'a']--;
                l++;
            }

            if (Arrays.equals(pCount, windowCount)) {
                ans.add(l);
            }
            r++;

        }
        return ans;
    }

    static void main() {
       String s = "cbaebabacd";
       String p = "abc";
       List<Integer> res = findAnagrams(s,p);
        System.out.println(res);
    }
}
