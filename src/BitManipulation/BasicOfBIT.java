package BitManipulation;

public class BasicOfBIT {

    public static int method2(String str1){
        int n= str1.length();         int j = n-1;
        int res=0;
        for (int i=0;i<n;i++){
            int bitValue = str1.charAt(i) - '0';
            res += (int)  (Math.pow(2,j))*bitValue;
            j--;
        }
        return res;
    }

    public static StringBuilder method(int n) {
        StringBuilder res = new StringBuilder();

        while(n!=1){
            if (n%2 == 1){
                res.append('1');
            }
            else{
                res.append('0');
            }
            n=n/2;
        }
        res.append('1');
        res.reverse();

        return  res;
    }

    public static void main(String[] args) {
        StringBuilder res = method(5);
        System.out.println(res);
        int res2 = method2("101");
        System.out.println(res2);

    }
}
