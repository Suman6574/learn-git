import java.util.*;
public class decreasenatural {
    public static void decreasing(int n){
        //base work
        if(n==1){
            System.out.println(1);
            return;
        }
        //self work
        System.out.println(n);
        //recursive work
        decreasing(n-1);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        decreasing(n);
        
    }
    
}
