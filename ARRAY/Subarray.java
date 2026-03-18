class Subarray{

    public static void printSubarrays(int num[]){
        int total = 0;
        for( int i=0 ; i<num.length ; i++){
            for(int j=i ; j<num.length ; j++){
                for(int k=i ; k<j ; k++){
                    System.out.print(num[k] + " ");
                }
                total++;
                System.out.println();
            }
            System.out.println(" ");
        }
        System.out.println("Total Subarrays: " + total);
    }
    
    public static void main(String args[]){
        int num[] = {1 , 2 , 3, 4, 5};
        printSubarrays(num);
    }
}
