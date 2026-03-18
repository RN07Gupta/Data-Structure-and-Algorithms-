// import java.util.*;

class LargestNum {

    // public static int largestNum(int num[] , int largest){
    // for(int i= 0 ; i<num.length ; i++){
    // if(num[i] > largest){
    // largest = num[i];
    // }
    // }
    // return largest;
    // }

    public static int largest(int num[]){
        int lar = Integer.MIN_VALUE;
        int sm = Integer.MAX_VALUE;


        for(int i=0 ; i<num.length ; i++){
           if(num[i]>lar){
            lar = num[i];
           }

           if(num[i]<sm){
            sm = num[i];
           }
           
        }
        System.out.println("Smallest numeber :" + sm);
        return lar;

    }

    public static void main(String[] args) {
        int num[] = { 23, 45, 67, 89, 12, 90, 34 };

        // int largest = 0;
        // int lar = largestNum(num, largest);
        // System.out.println("Largest number: " + lar);
        int lar = largest(num);
        System.out.println("Largest numeber :" + lar);

    }
}


