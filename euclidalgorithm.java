public class euclidalgorithm {

    //euclid algorithm says gcd(x,y)=(y,x%y) and(x,0)=x
    public static int gcd(int x,int y){
        if(y==0){
            return x;
        }
        return gcd(y,x%y);
    }
    public static void main(String[] args) {
        int x=15;
        int y=24;
        System.out.println(gcd(x, y));
    }
    
}
