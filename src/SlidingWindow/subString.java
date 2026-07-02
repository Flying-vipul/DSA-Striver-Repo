package SlidingWindow;

public class subString {

    public static int numberOfSubstrings(String s) {

        int n= s.length();
        int a = -1;
        int b =-1;
        int c =-1;

        int count =0;

        for (int i=0;i<n;i++){
            if (s.charAt(i) == 'a'){
                a=i;
            } else if (s.charAt(i) == 'b') {
                b=i;
            }else{
                c=i;
            }
            if (a!=-1 && b!=-1 && c!=-1){
                int min = Math.min(a,b);
                int Fmin = Math.min(min,c);
                count+=(Fmin+1);

            }
        }
        return count;
    }

    static void main() {
        String s = "bbacba";
        int res = numberOfSubstrings(s);
        System.out.println(res);
    }
}
