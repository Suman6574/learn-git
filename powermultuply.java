import java.util.*;
public class powermultuply {
    public static int pow(int p,int q){
        if(q==0){
            return 1;
        }
        // 
        int smallpow= pow(p,q/2);
        if(q%2==0){
           return smallpow *smallpow;
        }else{
            return p*smallpow*smallpow;
        }
    }
    public static void main(String[] args) {
        int p=2;
        int q=4;
        System.out.println(pow(p, q));
        
    }
    
}
