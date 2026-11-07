package Contests;

import java.util.Stack;

public class TypeAndColor {



    private boolean method(int[] types, int[] colors, int[] groupSize){

        Stack<int[]> stack = new Stack<>();

        for(int i=0;i< types.length;i++){

            int type = types[i];
            int color = colors[i];
            if(!stack.isEmpty() && stack.peek()[0] == type && stack.peek()[1] == color ){
                stack.peek()[2]++;
            }else{
                stack.push(new int[]{type,color,1});
            }

            if(stack.peek()[2] == groupSize[type]){
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
