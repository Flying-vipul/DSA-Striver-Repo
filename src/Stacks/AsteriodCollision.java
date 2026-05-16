package Stacks;

import java.util.ArrayList;
import java.util.List;

public class AsteriodCollision {

    public static int[] method(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int current : arr) {

            if (current > 0) {
                list.add(current);
            }
            // 2. It is a negative asteroid. Collision time!
            else {
                // While there is a positive asteroid to the left that is SMALLER, destroy the positive one
                while (!list.isEmpty() && list.getLast() > 0 && list.getLast() < Math.abs(current)) {
                    list.removeLast();
                }

                // Now, check what happened after we cleared out the smaller ones:
                if (list.isEmpty() || list.getLast() < 0) {
                    // If the list is empty, or the asteroid to the left is also moving left,
                    // our negative asteroid survives!
                    list.add(current);
                } else if (list.getLast() == Math.abs(current)) {
                    // Mutual destruction! Both are the exact same size.
                    // Destroy the positive one, and do NOT add the negative one.
                    list.removeLast();
                }
                // (Implicit else): If list.getLast() > Math.abs(current), the positive
                // asteroid is bigger. Our negative asteroid is destroyed, so we do nothing.
            }
        }

        // 3. Convert ArrayList<Integer> to primitive int[] using Streams!
        return list.stream().mapToInt(i -> i).toArray();
    }
}
