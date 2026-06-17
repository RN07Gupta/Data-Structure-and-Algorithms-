
import java.util.Arrays;
import java.util.Comparator;

class Fractional_Knap{
    public static void main(String[] args) {
        int val[] = {60, 100, 120};
        int wt[] = {10, 20, 30};
        int capacity = 50;

        double ratio[][] = new double[val.length][2];
        // 0th col -> index
        // 1th col ratio

        for(int i=0 ; i<val.length ; i++){
            ratio[i][0] = i;
            ratio[i][1] = val[i] / (double)wt[i];
        }

        // asecnding order
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        double maxProfit = 0;
        for(int i=ratio.length-1 ; i>=0 ; i--){
            int index = (int)ratio[i][0];
            if(capacity >= wt[index]){
                maxProfit += val[index];
                capacity -= wt[index];
            }
            else{
                maxProfit += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }

        System.out.println("maxProfit =" + maxProfit);

    }
}