public class firstnmultiple {
    public static void multiply(int n,int k){
        if(k==1){
            System.out.println(n);
            return;
        }
        multiply(n, k-1);
        System.out.println(n*k);

    }
    public static void main(String[] args) {
        int n=5;
        int k=8;
        multiply(n, k);
       
    }
    
}
