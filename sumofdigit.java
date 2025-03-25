import java.util.*;
public class sumofdigit {
    public static int sod(int n){
        if(n>=0 && n<=9){
            return n;
        }
        // int smallans=sod(n/10);
        // int ans=smallans+(n%10);
        // return ans;
        return sod(n/10)+(n%10);
    }
    public static void main(String[] args) {
        int n=1234;
        System.out.println(sod(n));
        
    }
    
}
