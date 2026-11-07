package Contests;

public class countValid2 {


    private long method(String str){

        int lastA = -1;
        int lastAB = -1;
        int lastInterval  = -1;

        int totalValid = 0;

        for(int i=0;i<str.length();i++){

            if(str.charAt(i) == 'a'){
                lastA = i;
            }else if(str.charAt(i) == 'b'){
                if(lastA != -1){
                    lastAB = Math.max(lastAB,lastA);
                }
            }else{
                if(lastAB!=-1){
                    lastInterval = Math.max(lastAB,lastInterval);
                }
            }

            totalValid+=(i-lastInterval);
        }

        return totalValid;
    }
}
