class Palindrome{
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

    public void add_First(int data){

        Node newNode = new Node(data);
        // size++;
     
        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void print(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public Node findMid(Node head){
        Node slow = head;
        Node fast = head ;

        while(fast != null && fast.next != null){
            slow = slow.next; // +!
            fast = fast.next; //+2
        }
        return slow ; //slow is mid node
    }

    public boolean palindrome(){
        // base case
        if(head == null || head.next == null){
            return true;
        }

        // find mid
        Node mid = findMid(head);

        // reverse 2nd half
        
        Node prev = null;
        Node curr = mid  ; 
        Node next ; 


        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr ;
            curr = next ;
        } 
        Node right = prev;  // right half head
        Node left = head;

        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
            
        }
        return true;
    }
    
    public static void main(String[] args) {
        Palindrome ll = new Palindrome();
        ll.add_First(1);
        ll.add_First(2);
        ll.add_First(2);
        ll.add_First(1);
        // ll.del_n_f_end(2);
        System.out.println(ll.palindrome());
        ll.print();
}
}