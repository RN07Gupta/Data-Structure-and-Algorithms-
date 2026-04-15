import java.util.*;
class MaxAreaHist{
    public static int maxArea(int[] arr){
        int maxArea = 0;
        int[] nsr = new int[arr.length];
        int[] nsl = new int[arr.length];

        // Next Smaller Right 
        Stack<Integer> s = new Stack<>();
        for(int i=arr.length-1 ; i>=0 ; i--){
            // 1. while
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }

            // 2. if else
            if(s.isEmpty()){
                nsr[i] = arr.length;
            }
            else{
                nsr[i] = s.peek(); 
            }

            // 3. peek()
            s.push(i);
        }



        // Next Smaller Left
        s = new Stack<>();
        for(int i=0 ; i<arr.length ; i++){
            // 1. while
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }

            // 2. if else
            if(s.isEmpty()){
                nsl[i] = -1;
            }
            else{
                nsl[i] = s.peek(); 
            }

            // 3. peek()
            s.push(i);
        }


        // Current Area : width = j - i -1  = nsr[i] - nsr[i] -1
        for(int i=0 ; i<arr.length ; i++){
            int heigth = arr[i];
            int width = nsr[i] - nsl[i] -1;
            int curArea = heigth * width;
            maxArea = Math.max(maxArea, curArea);
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int[] arr = {2,1,5,6,2,3};
        System.out.println(maxArea(arr));
    }
}