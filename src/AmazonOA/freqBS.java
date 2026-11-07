package AmazonOA;

public class freqBS {


    public String method(String str, int k){

        int[] freq = new int[26];

       for (char ele:str.toCharArray()){
           freq[ele-'a']++;
       }

       int distinct = 0;
       for(int ele:freq){
           if (ele>0){
               distinct++;
           }
       }

       if(k<distinct) return "-1";
       int low = 1;
       int high = str.length();

       while (low<high){

           int mid = low + (high-low)/2;

           int required = 0;
           for(int ele:freq){
               if (ele>0){
                   required+=ele+mid-1/mid;
               }
           }

           if (required<=k){
               high = mid;
           }else {
               low = mid+1;
           }
       }

       int rept = low;

       StringBuilder ans = new StringBuilder();
       for(int i=0;i<26;i++){

           if(freq[i]>0){

               int req = (freq[i]+rept-1)/rept;

               for(int j=0;j<req;j++){
                   ans.append((char)('a'+i));
               }
           }
       }

       int rem = k- ans.length();
       for(int i=0;i<rem;i++){
           ans.insert(0,'a');
       }

       return ans.toString();

    }
}
