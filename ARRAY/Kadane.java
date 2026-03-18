class Kadane{

    public static void MaxSub(int num[]){

        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i = 0 ; i<num.length ; i++){
            cs = cs + num[i];
            if( cs < 0){
                cs = 0;
            }
            if( ms < cs){
            ms = cs;
            }
        }
        System.out.println("Max Subarray Sum using Kadane's Algorithm: " + ms);
    }

    public static void main(String args[]){
        int num[] = {-1 , 0 , 9, 2, -3 , 2 };
        MaxSub(num);
    }
}

