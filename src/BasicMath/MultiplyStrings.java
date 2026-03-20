package BasicMath;

import java.util.Objects;

public class MultiplyStrings {


    static class Solution {
        public String multiply(String num1, String num2) {
            // Base case: if either number is zero, the product is zero.
            if (num1.equals("0") || num2.equals("0")) {
                return "0";
            }

            int m = num1.length();
            int n = num2.length();
            int[] pos = new int[m + n];

            // Multiply from right to left
            for (int i = m - 1; i >= 0; i--) {
                for (int j = n - 1; j >= 0; j--) {
                    int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');

                    // Add the current multiplication to the existing value in the target position
                    int p1 = i + j;
                    int p2 = i + j + 1;
                    int sum = mul + pos[p2];

                    // Update the current position and the carry position
                    pos[p1] += sum / 10;
                    pos[p2] = sum % 10;
                }
            }

            // Build the final string, skipping any leading zeros in the array
            StringBuilder sb = new StringBuilder();
            for (int p : pos) {
                if (!(sb.isEmpty() && p == 0)) {
                    sb.append(p);
                }
            }

            return sb.toString();
        }
    }

    public static String method(String num1, String num2){

        if (Objects.equals(num1, "0") || Objects.equals(num2, "0")) return "0";

        int int1 = method1(num1);
        int int2 = method1(num2);
        int int3 = int1*int2;

        return method2(int3);
    }

    public static int method1(String num1){
        int finalNum = 0;
        for (int i=0;i<num1.length();i++){
            int curr = num1.charAt(i) -'0';
            finalNum=finalNum*10+curr;
        }

        return finalNum;
    }
    public static String method2(int num1){
        StringBuilder str = new StringBuilder();
        while(num1 > 0){
            int digit = num1%10;
            str.append((char) ('0'+digit));
            num1 /= 10;
        }

        return str.reverse().toString();
    }

    public static void main(String[] args) {
        String num1 = "12";
        String num2 = "23";

        String res = method(num1,num2);
        System.out.println(res);

    }
}
