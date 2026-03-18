class PrintTon{

    // public static void printN(int n , int i){
    //     if( i<0 ){
    //         return;
    //     }
    //     System.out.println(n-i+" ");
    //     i--;
    //     printN(n , i); 
        
    // }

     public static void printN(int n){
        if( n == 0 ){
            return;
        }
        printN(n-1); 
        System.out.println(n+" ");
        
    }
    public static void main(String[] args) {
        int n = 5;
        printN(n);
        // printN(5 , n-1);
    }
}