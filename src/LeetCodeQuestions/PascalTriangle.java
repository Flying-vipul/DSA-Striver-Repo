package LeetCodeQuestions;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public static List<List<Integer>> generate(int numRows){

        List<List<Integer>> triangle  = new ArrayList<>();

        if (numRows ==0){
            return triangle;
        }

        for (int i=0; i<numRows;i++){
            List<Integer> row = new ArrayList<>();

            for (int j=0; j <= i;j++){
                if (j == 0 || j==i){
                    row.add(1);
                }else {
                    List<Integer> preRow = triangle.get(i-1);
                    int sum = preRow.get(j-1)+ preRow.get(j);
                    row.add(sum);
                }
            }
            triangle.add(row);
        }
        return triangle;
    }

    public static void main(String[] args) {

        List<List<Integer>> result = generate(5);

        System.out.println(result);
    }
}
