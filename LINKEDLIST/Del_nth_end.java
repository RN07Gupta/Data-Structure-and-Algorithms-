class Del_nth_end{

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

    public void del_n_f_end(int n){
        int sz = 0;
        Node temp = head ;

        // Ca size
        while(temp != null){
            temp = temp.next;
            sz++;
        }
        if(n==sz){
            head = head.next;
            return ;
        }
        int i =1;
        int iToFind = sz-n;
        Node prev = head;
        while(i < iToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
    }
    
    public static void main(String[] args) {
        Del_nth_end ll = new Del_nth_end();
        ll.add_First(4);
        ll.add_First(3);
        ll.add_First(2);
        ll.add_First(1);
        ll.del_n_f_end(2);
        ll.print();
    }
}

