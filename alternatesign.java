public class alternatesign {
    public static int sumseries(int n){
        if(n==0){
            return 0;
        }
        if(n%2==0){
            return sumseries(n-1)-n;
        }else{
            return sumseries(n-1)+n;
        }
    }
    public static void main(String[] args) {
        int n=10;
        // int sum=0;
        // for(int i=1;i<=n;i++){
        //    if(i%2==0){
        //     sum=sum-i;
        //    }else{
        //     sum=sum+i;
        //    }
        // }
        // System.out.println(sum);
        System.out.println(sumseries(n));
    }
    
}
