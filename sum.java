class sum {
    public static int  funt(int n){
        if(n==0){
            return 0;
        }
        return n+funt(n-1);
        
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(funt(n));

         
    }
    
}
