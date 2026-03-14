package StringsProlems;

import java.util.HashMap;

public class Leetcode205 {

    public static boolean method(String str, String str2) {
        // Quick edge case check
        if (str.length() != str2.length()) return false;

        HashMap<Character, Character> mapS = new HashMap<>();
        HashMap<Character, Character> mapT = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char charS = str.charAt(i);
            char charT = str2.charAt(i);

            // If charS is a BRAND NEW character...
            if (!mapS.containsKey(charS)) {
                // ...then charT MUST also be a brand new character!
                // If mapT already has it, someone else claimed it. Return false.
                if (mapT.containsKey(charT)) {
                    return false;
                }

                // If both are new, we are safe to add them.
                mapS.put(charS, charT);
                mapT.put(charT, charS);

            }
            // If we HAVE seen charS before...
            else {
                // ...it better point to the exact same charT as before!
                if (mapS.get(charS) != charT) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean res = method("f11", "g23");
        System.out.println(res); // Now this will safely print 'false' without crashing!
    }
}