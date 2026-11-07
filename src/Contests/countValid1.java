package Contests;

public class countValid1 {



    private long method(String s){

        int lastA =-1;
        long totalValid = 0;

        for(int i=0;i<s.length();i++){

            if( i>=2&&s.charAt(i-2) == 'a' && s.charAt(i-1) == 'b'  && s.charAt(i) == 'c'){
              lastA = i-2;
            }
            totalValid+=(i-lastA);
        }

        return totalValid;
    }


}
