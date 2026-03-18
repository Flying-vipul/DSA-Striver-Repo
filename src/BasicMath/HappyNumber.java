package BasicMath;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    public static boolean method(int n){
        Set<Integer> seenNumber = new HashSet<>();

        while(n!= 1 && !seenNumber.contains(n)){
            seenNumber.add(n);
             n= getSumOfSquares(n);
        }
        return  n == 1;
    }

    public static int getSumOfSquares(int n){
        int sum=0;
        while(n>0){
            int digit = n%10;
            sum += digit * digit;
            n/=10;
        }
        return sum;
    }
}
