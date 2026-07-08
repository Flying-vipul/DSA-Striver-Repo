package GreedyAlgo;

import java.util.Arrays;
import java.util.Collections;

public class AssignCookie {

    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0;
        int j=0;
        while(i<g.length && j<s.length){
            if (g[i]<=s[j]){
                i++;
            }
            j++;
        }
        return i;
    }
}
