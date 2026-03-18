class PrefixSubarray{

    public static void printPrefixSubarray(int num[]){
        int maxSum = Integer.MIN_VALUE;

        // Calculate Prefix Subarrays and their sums
        int prefixSums[] = new int[num.length];
        prefixSums[0] = num[0];

        for(int i=1 ; i<num.length ; i++){
            prefixSums[i] = prefixSums[i-1] + num[i];
        }

        for( int i=0 ; i<num.length ; i++){

            for(int j=i ; j<num.length ; j++){
                int Currentsum = i == 0 ? prefixSums[j] : prefixSums[j] - prefixSums[i-1];
                if(maxSum < Currentsum){ // Update maxSum if current sum is greater
                    maxSum = Currentsum;
                    }
            }
        }
        System.out.println("Max Prefix Subarray Sum: " + maxSum);
    }

    public static void main(String args[]){
        int num[] = {1 , -2 , 6, -1, 3};
        printPrefixSubarray(num);
    }
}




