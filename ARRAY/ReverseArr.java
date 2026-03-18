class ReverseArr{


    public static int[] reverse(int num[] ){
        int first = 0;
        int last = num.length - 1;
        while(first < last){
            int temp = num[first];
            num[first] = num[last];
            num[last] = temp;

            first++;
            last--;
        }
        return num;
    }
    public static void main(String args[]){
        int num[] = {1,2,3,4,5};
        
        reverse(num); 
        for(int i=0 ; i<num.length ; i++){
            System.out.print(num[i]);
        }

    }
}

