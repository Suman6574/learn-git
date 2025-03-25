public class lcm {
    public static void main(String[] args) {
        int n1=10;
        int n2=15;
        int gcd=1;
        for(int i=1;i<=n1;i++){
            if(n1%i==0 && n2%i==0){
                gcd=i;
            }
        }
        System.out.println(gcd);
        int lcm=(n1*n2)/gcd;
        System.out.println(lcm);
    }
    
}
