import java.util.*;
class ValParen{

    public static boolean isVal(String st){
        Stack<Character> s = new Stack<>();

        for (char ch : st.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                s.push(ch);
            }
            else{
                if(s.isEmpty()){
                    return false;
                }
                char top = s.pop();
                if((top == '(' && ch == ')') || (top == '[' && ch == ']') || (top == '{' && ch == '}')){
                    continue;
                } else {
                    return false;
                }
            }
        }
        return s.isEmpty();
    }
    public static void main(String[] args) {
        String st = "(((((";
        System.out.println(isVal(st));
    }
}