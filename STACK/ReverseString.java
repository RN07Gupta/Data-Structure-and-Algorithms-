import java.util.*;
class ReverseString{

    public static void reverse(Stack<Character> s , String st){

        for(int i=0 ; i<st.length() ; i++){
            s.push(st.charAt(i)); 
        }

        StringBuilder str = new StringBuilder("");
        for(int i=0 ; i<st.length() ; i++){
            char ch = s.pop();
            str.append(ch);
        }
        System.out.println(str.toString());
    }
    public static void main(String[] args) {
        Stack<Character> s = new Stack<>();

        reverse(s , "aryan");
    }
}