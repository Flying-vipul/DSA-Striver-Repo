package BinarySearches;

public class PainterPartition {

    public boolean helper(int[] arr, int n, int M, int maxTimeAllowed){

        int painters = 1;
        int time = 0;
        for(int i=0;i<n;i++){
            if(arr[i]+ time <= maxTimeAllowed){
                time+=arr[i];
            }else{
                painters++;
                time = arr[i];
            }
        }
        return painters<=M;
    }

    public int method(int[] arr, int M){

        int n = arr.length;

        int left =1;
        int right =0;
        int ans = -1;
        for(int ele:arr){
            left = Math.max(ele,left);
            right+=ele;
        }
        int mid = 0;

        while(left<=right){

            mid = left+(right-left)/2;

            if(helper(arr,n,M,mid)){
                ans = mid;
                right = mid-1;
            }else{
                left = mid+1;
            }

        }
        return ans;
    }

}
