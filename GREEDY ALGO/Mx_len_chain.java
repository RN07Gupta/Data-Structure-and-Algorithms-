import java.util.*;
class Max_len_chain{
    public static void main(String[] args) {
        int[][] pairs = {{1,2},{7,8},{4,5}};

        Arrays.sort(pairs , Comparator.comparingDouble(o -> o[1]));

        int chain = 1;

        int a = pairs[0][1];
        for(int i=1 ; i<pairs.length ; i++){
            int b = pairs[i][0];
            if(a < b){
                chain++ ; 
                a = pairs[i][1];
            }
        }
        System.out.println(chain);
    }
}