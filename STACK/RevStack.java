import java.util.*;
class RevStack{

    public static void pushAtbottom(Stack<Integer> s , int data){
        // base
        if(s.isEmpty()){
            s.push(data);
            return ;
        }

        // kam
        int top = s.pop();
        pushAtbottom(s, data);
        s.push(top);

    }

    public static void reverse(Stack<Integer> s ){

        if(s.isEmpty()){
            return;
        }

        int c = s.pop();
        reverse(s);
        pushAtbottom(s, c);

    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        reverse(s);
    }
}