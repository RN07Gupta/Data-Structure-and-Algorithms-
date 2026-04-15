import java.util.*;
class DuplicatesParen{
    public static boolean isDuplicates(String str){
        Stack<Character> s = new Stack<>();

        for(int i=0 ; i< str.length (); i++){
            char ch = str.charAt(i);

            if(ch == ')'){
                int count = 0;
                while(!s.isEmpty() && s.peek() != '('){
                    count++;
                    s.pop();
                }
                if(count<1){
                    return true; // duplicate 
                }
                else{
                    s.pop(); //opening pair
                }
                
            }
            else{
                s.push(ch); // opening
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        String str = "(((a+b) + (c+d)))";
        System.out.println(isDuplicates(str));
    }
}