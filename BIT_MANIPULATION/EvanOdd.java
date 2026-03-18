import java.util.*;
class EvanOdd{
    public static void main(String[] args){
        int bitMask = 1;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if((n & bitMask) == 0){
            System.out.println("Even");
        }
        else { 
              System.out.println("Odd");
        }
    }
}