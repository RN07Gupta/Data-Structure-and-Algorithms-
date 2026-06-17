import java.util.*;
class Min_abs{
    public static void main(String[] args){
        int[] A ={4,1,8,7};
        int[] B = {2,3,6,5};

        Arrays.sort(A);
        Arrays.sort(B); 

        int min_abs = Integer.MAX_VALUE;
        for(int i=0 ; i<A.length ; i++){
            if(Math.abs(A[i] - B[i]) < min_abs){
                min_abs = Math.abs(A[i] - B[i]);
            }
        }

        System.out.println(min_abs);
    }
}