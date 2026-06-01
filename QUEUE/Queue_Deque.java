import java.util.*;
class Queue_Deque{
    static class Queue{
        Deque<Integer> dq = new LinkedList<>();

        // push
        public void add(int data){
            dq.addLast(data);
            
        }

        // pop
        public int remove(){
            return dq.removeFirst();
            
        }

        // peek
        public int peek(){
            return dq.getFirst();
        }
    }
    public static void main(String[] args) {
        Queue s = new Queue();
        s.add(1);
        s.add(2);
        s.add(3);
        System.out.println("peek =" + s.peek());
        System.out.println(s.remove());


    }
}