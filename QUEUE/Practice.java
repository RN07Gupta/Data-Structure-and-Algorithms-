import java.util.*;
class Practice{
    public static void main(String[ ] args){
        // Question 1 Generate Binary Numbers
        Queue<Integer> q = new LinkedList<>();

        // q.add("1");
        
        // int N = 2;
        // for(int i=1 ; i<=N ; i++){
        //     String curr = q.remove();
        //     System.out.println(curr);

        //     q.add(curr + "0");
        //     q.add(curr + "1");
        // }

        // Question 2 Connect n ropes with minimum cos

        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        // int arr[] = {4,3,2,6};

        // for(int i=0 ; i<arr.length ; i++){
        //     pq.add(arr[i]);
        // }

        // int TC = 0;
        // while (pq.size() > 1) {
        //     int min1 = pq.poll();
        //     int min2 = pq.poll();

        //     int total = min1 + min2;
        //     TC += total;

        //     pq.add(total);
        // }
        // System.out.println("Total cost = " + TC);

        // Question 4 reversing the first k elements of queue

        // int arr[] = {10,20,30,40,50,60,70,80,90,100};
        // int N=5;
        // for(int i=0 ; i<arr.length ; i++){
        //     q.add(arr[i]);
        // }

        // Stack<Integer> s = new Stack<>();

        // for(int i=0 ; i<N ; i++){
        //     s.push(q.poll());
        // }

        // Queue<Integer> q1 = new LinkedList<>();
        // while(!s.isEmpty()){
        //     q1.add(s.pop());
        // }
        // while(!q.isEmpty()){
        //     q1.add(q.poll());
        // }


        // while(!q1.isEmpty()){
        //     System.out.println(q1.poll());
        // }

        // Question 5 maximun sliding window
        int nums[] = {1,3,-1,-3,5,3,6,7};
        int k=3;
        Deque<Integer> dq = new LinkedList<>();
        int[] ans = new int[nums.length - k + 1];
        int idx = 0;

        for(int i = 0; i < nums.length; i++) {

            while(!dq.isEmpty() && dq.peekFirst() <= i - k)
                dq.pollFirst();

            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i])
                dq.pollLast();

            dq.offerLast(i);

            if(i >= k - 1)
                ans[idx++] = nums[dq.peekFirst()];
        }

        for(int i=0 ; i<ans.length ; i++){
            System.out.println(ans[i]);
        }
    }
}