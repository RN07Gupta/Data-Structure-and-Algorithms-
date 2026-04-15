
import java.util.*;
class NextGreaterEl{
    public static void main(String[] args) {
        int arr[]= {6 , 8,0, 1, 3};
        Stack<Integer> s = new Stack<>();
        int nextG[] = new int[arr.length];

        for(int i=arr.length-1 ; i>=0 ; i--){
            // 1. while
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }

            // 2. if else
            if(s.isEmpty()){
                nextG[i] = -1;
            }
            else{
                nextG[i] = arr[s.peek()]; 
            }

            // 3. peek()
            s.push(i);
        }

        for(int i=0 ; i<arr.length ; i++){
            System.out.print(nextG[i] + " ");
        }
        System.out.println();
    }
}