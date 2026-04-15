
import java.util.*;

class Practice {

    // public static boolean monotonic(ArrayList<Integer> list){
    //     boolean inc = true;
    //     boolean dec = true;
    //     for(int i=0 ; i<list.size()-1 ; i++){
    //         if(list.get(i) > list.get(i+1)){
    //             inc = false;
    //         }
    //         if(list.get(i) < list.get(i+1)){
    //             dec = false;
    //         }
    //     }
    //     return inc || dec;
    // }
    public static void main(String[] args) {
        // Ques-1 monotonic
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(100);
        list.add(200);
        list.add(1);
        list.add(100);

        // System.out.println(monotonic(list));
        // Question 2 - Lonely element
        // List<Integer> newL = new ArrayList<>();
        // for (int i = 0; i< list.size() ; i++){
        //     if(!newL.contains(list.get(i))){
        //         if(!list.contains(list.get(i) + 1) && !list.contains(list.get(i) - 1)){
        //             newL.add(list.get(i));
        //         }
        //     }
        // }
        // 
        // System.out.println(newL);
        // Question 4

    //     int n = 4; 
    //     ArrayList<Integer> ans = newArrayList < > ();
    //     ans.add(1);
    //     for (int i = 2; i <= n; i++) {
    //         ArrayList<Integer> temp = newArrayList < > ();
    //         for (Integere : ans) {
    //             if (2 * e <= n) {
    //                 temp.add(e * 2);
            
    //             }}
    //         for (Integere : ans) {
    //             if (2 * e - 1 <= n) {
    //                 temp.add(e * 2 - 1);
            
    //             }}
    //         ans = temp;
    //     }

    // }
    }
}
