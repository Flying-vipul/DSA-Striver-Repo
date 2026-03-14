package LeetCodeQuestions;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public List<String> fizz(int n) {
        List<String> buzz = new ArrayList<>();

        for (int i =1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                buzz.add("fizz");
            } else if (i % 5 ==0) {
                buzz.add("buzz");
            }else if (i % 3 == 0) {
                buzz.add("fizzbuzz");
            }else{
                buzz.add(String.valueOf(i));
            }
        }
        return buzz;
    }
}
