
class Pattern {

    public static void main(String args[]) {

    //     1
    //    121
    //   12321
    //  1234321

        // int n = 4;
        // // int p = 1;
        // for (int i = 1; i <= n; i++) {

        //     for (int j = 1; j <= n - i; j++) {
        //         System.out.print(" ");
        //     }
    
        //     for (int k = 1; k <= i; k++) {
        //         System.out.print(k);
        //     }
            
        //     for(int l=i-1 ; l>=1 ; l--){
        //         System.out.print(l);
        //     }
            
        //     System.out.println(""); 
        // }
        // System.out.println("");

        //    1
        //   2 3
        //  4 5 6
        // 7 8 9 10   
        int n = 4;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            int count = i;
            for (int k = 1; k <= i; k++) {
                System.out.print(count + " ");
                count = count + 1;
            }
            System.out.println(" ");
        }
    }
}
