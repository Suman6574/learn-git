public class sumofarray {
    public static int arraysum(int arr[],int idx){
        int sum=0;
        int n=arr.length;
        if(idx==n){
            return 0;
        }
        int smallans=arraysum(arr, idx+1) +sum;
        int ans=arr[idx]+smallans;
        return ans;

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,9};
        int ss=arraysum(arr, 0);
        System.out.println(ss);
    
    }
    
}
