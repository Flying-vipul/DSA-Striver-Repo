package LeetCodeQuestions;

public class GasStation {

    public int canCompleteCircuit(int[] gas, int[] cost) {

        int sumG =0;
        for(int gasS:gas) {
            sumG+=gasS;
        }

        int sumC =0;
        for(int costS:cost) {
            sumC+=costS;
        }

        if(sumC > sumG || gas.length != cost.length) {
            return -1;
        }

        int currFuel =0;
        int start_index =0;

        for (int i=0; i< gas.length; i++) {
            currFuel += gas[i]-cost[i];

            if (currFuel < 0) {
                start_index = i+1;
                currFuel =0;
            }
        }

        return start_index;


    }

}
