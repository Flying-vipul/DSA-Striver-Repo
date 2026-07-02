package Heaps;

import java.util.PriorityQueue;

public class leetcode767 {

    public String reorganizeString(String s) {

        // 1. Build the Frequency Inventory
        int[] charCounts = new int[26];
        for (char c : s.toCharArray()) {
            charCounts[c - 'a']++;
        }

        // 2. Build the Max-Heap
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[1] - a[1]);

        for (int i = 0; i < 26; i++) {
            if (charCounts[i] > 0) {
                maxHeap.add(new int[] { i + 'a', charCounts[i] });
            }
        }

        // 3. The Result Builder and the "Timeout Chair"
        StringBuilder result = new StringBuilder();
        int[] prev = null;

        // 4. THE CORE LOGIC
        while (!maxHeap.isEmpty()) {

            // Step 1: Is someone in the timeout chair from the last turn?
            // If they still have copies left, put them back into the Heap!
            if (prev != null && prev[1] > 0) {
                maxHeap.add(prev);
            }

            // Step 2: Grab the most frequent available letter
            int[] current = maxHeap.poll();

            // Step 3: Add it to our final string (cast the ascii number back to char)
            result.append((char) current[0]);

            // Step 4: Decrement its count because we just used one
            current[1]--;

            // Step 5: Send this letter to the timeout chair for the next turn
            prev = current;
        }

        // 5. The Final Check
        // If we ran out of valid letters to place but the string isn't finished,
        // it means it was mathematically impossible (e.g. "aaab")
        if (result.length() != s.length()) {
            return "";
        }

        return result.toString();
    }
}
