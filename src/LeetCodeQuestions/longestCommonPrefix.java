package LeetCodeQuestions;

public class longestCommonPrefix {

    public String prefixMethod(String[] strs){

        String prefix = strs[0];

        for(int i=1;i<= strs.length-1;i++) {

            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0,prefix.length()-1);

                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

}
