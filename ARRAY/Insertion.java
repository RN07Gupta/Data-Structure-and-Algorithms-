import java.util.*;
class Insertion{
    public static void insertion(int arr[]){
        for(int i= 0 ; i<arr.length ; i++){
            int cur = arr[i];
            int prev = i - 1;
            while(prev >= 0 && arr[prev] > cur){
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev + 1] = cur;
        }
        System.out.println("Sorted Array: ");
        for(int i=0 ; i< arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        

    }

    public static void main(String args[]){
        int arr[] = {5,4,1,3,2};
        
        // insertion(arr);
        // Arrays.sort(arr);
        Arrays.sort(arr , 0 , 3);
        for(int i=0 ; i< arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        


    }
}