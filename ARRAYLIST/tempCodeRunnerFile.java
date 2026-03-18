import java.util.*;
class Practice{

    public static boolean monotonic(ArrayList<Integer> list ){
        for(int i=0 ; i<=list.size()-1 ; i++){
            if(list.get(i) <= list.get(i+1)){
                return true;
            }
        }

        // for(int i=list.size()-1 ; i>=0 ; i--){
        //     if(list.get(i) < list.get(i-1)){
        //         return true;
        //     }
        // }

        return false;