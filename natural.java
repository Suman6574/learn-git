import java.util.*;
public class natural{
    public static void naturalnumber(int n){
        //base work
        if(n==1){
            System.out.println(n);
            return;
        }
        //recursive work
        naturalnumber(n-1);
        //self work
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        naturalnumber(n);

        
    }
}