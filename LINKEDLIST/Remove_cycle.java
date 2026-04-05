class Remove_cycle{

    public static class Node{
        int data ;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    
    public static boolean isCycle(){
        Node slow = head;
        Node fast = head ;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

     public static void removeCycle(){
        // detect cycle 
        Node slow = head;
        Node fast = head ;
        boolean cycle = true;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                cycle = true;
                break;
            }
            if(cycle == false){
                return ;
            }
        } 

        // finding meeting point
        slow = head;
        Node prev = fast;
        while(slow != fast){
            prev = fast ;
            slow = slow.next;
            fast = fast.next;
        }

        // remove
        prev.next = null;

        }
    

  

    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;
        System.out.println(isCycle());
        removeCycle(); 
        System.out.println(isCycle()); 
    }
}

