import java.util.*;
class JCF{
    public static void main(String[] args) {
        // Queue<Integer> q= new LinkedList<>();
        Queue<Integer> q= new ArrayDeque<>();

        // Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}