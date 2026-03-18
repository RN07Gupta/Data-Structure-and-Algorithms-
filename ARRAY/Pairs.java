class Pairs{

    public static void printPairs(int num[]){
        int totalPairs = 0;
        for(int i=0 ; i<num.length ; i++){
            for(int j=i+1 ; j<num.length ; j++){
                System.out.print( "(" + num[i]+ "," +num[j]+ ")" );
                ++totalPairs;
            }
            System.out.println(" ");
        }
        System.out.println("Total Pairs: " + totalPairs);
    }
    public static void main(String args[]){
        int num[] = {1,2,3,4,5};
        
        printPairs(num);
    }
}