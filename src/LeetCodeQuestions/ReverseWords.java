package LeetCodeQuestions;

import java.util.Arrays;
import java.util.Collections;

public class ReverseWords {
    public static String method(String s) {
        // 1. Trim whitespace to avoid leading/trailing space issues
        // 2. Split by one or more spaces ("\\s+")
        String[] words = s.trim().split("\\s+");
        System.out.println(Arrays.toString(words));
        StringBuilder ans = new StringBuilder();

        // 3. Iterate backwards from the last word to the first
        for (int i = words.length - 1; i >= 0; i--) {
            ans.append(words[i]);
            // Add a space after the word, but not after the very last one
            if (i > 0) {
                ans.append(" ");
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        System.out.println(method("The sky")); // Output: "sky The"
    }
}
