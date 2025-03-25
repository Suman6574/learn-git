import java.util.*;
public class maxvalue {
    public static int maxnum(int arr[],int idx){
        int n=arr.length;
        if(idx==n-1){
            return arr[idx];
        }
        int smallans=maxnum(arr,idx+1);
         int ans=Math.max(arr[idx],smallans);
         return ans;
    }
    public static void main(String[] args) {
        int arr[]={10,13,7,8,4,9};
       int s= maxnum(arr, 0);
       System.out.println(s);
        
    }
    
}
