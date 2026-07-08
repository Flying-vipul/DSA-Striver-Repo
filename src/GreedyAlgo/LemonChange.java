package GreedyAlgo;

public class LemonChange {

    public boolean lemonadeChange(int[] bills) {
        int n = bills.length;
        int countFive =0;
        int countTen =0;

        for(int i=0;i<n;i++){
            if(bills[i]== 10){
                if(countFive>0){
                    countFive--;
                    countTen++;
                }else{
                    return false;
                }
            }else if(bills[i] == 20){
                if(countFive >0 && countTen>0){
                    countFive--;
                    countTen--;
                }else if(countFive>= 3){
                    countFive-=3;
                }else{
                    return false;
                }
            }else{
                countFive++;
            }
        }

        return true;

    }
}
