public class arrayprint {
    public static void array(int arr[],int idx){
        int n=arr.length;
        if(idx==n){
            return;
        }
        System.out.println(arr[idx]);
        array(arr, idx+1);

    }
    public static void main(String[] args) {
        int arr []={1,2,3,4,5};
        array(arr, 0);

    }
    
}
