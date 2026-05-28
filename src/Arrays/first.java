package Arrays;

public class first {


    public static int method(int[] arr) {
        int n = arr.length;
        int largest = arr[0];


        for (int i=1;i<n;i++) {
            if (arr[0]<arr[i]){
                largest = arr[i];
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        int[] arr = {3,5,7,1,9};
        System.out.println(method(arr));
    }
}
