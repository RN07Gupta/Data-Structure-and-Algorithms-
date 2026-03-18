class MaxSubSum{

    public static void printMaxSubSum(int num[]){
        int maxSum = Integer.MIN_VALUE;
        // int Currentsum = 0;
        int total = 0;
        for( int i=0 ; i<num.length ; i++){

            for(int j=i ; j<num.length ; j++){
                int Currentsum = 0;
                for(int k=i ; k<=j ; k++){

                    System.out.print(num[k] + " "); // Print current subarray elements
                    Currentsum = Currentsum + num[k]; // Calculate current subarray sum
                    
                }
                System.out.println("Current Subarray Sum: " + Currentsum);
                if(maxSum < Currentsum){ // Update maxSum if current sum is greater
                    maxSum = Currentsum;
                    }
                
                
                total++;
                System.out.println();
            }
            System.out.println(" ");
            System.out.println("Max Subarray Sum till now: " + maxSum);
        }
        System.out.println("Total Subarrays: " + total);

    }
    
    public static void main(String args[]){
        int num[] = {1 , -2 , 6, -1, 3};
        printMaxSubSum(num);
    }
}

