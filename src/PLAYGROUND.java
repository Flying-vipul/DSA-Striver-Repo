public class PLAYGROUND {

    public static void main(String[] args) {
        // left shift
        int x = 13;
        int k = 1;
        // x << k = x * (Math.pow(2,k))

        int ans = (int) (x * (Math.pow(2,k)));

        System.out.println(ans);
        int a = 3;
        int b = 2;
        method(a,b);
        System.out.println(a);
        System.out.println(b);



    }

    public static void method(int a, int b){
        a = a^b;
        b = a^b;
        a = a^b;;

    }
}
