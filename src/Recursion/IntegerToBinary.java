package Recursion;

public class IntegerToBinary {

    public static String binary(int n){
        if (n ==0) return "";

        String currentBit = String.valueOf(n%2);

        return binary(n/2)+currentBit;

    }
}
