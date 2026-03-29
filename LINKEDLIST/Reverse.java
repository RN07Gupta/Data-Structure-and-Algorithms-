class Reverse{

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
    public static int size;

    // Methods
    // add()
    // remove()
    // print()

    public void add_First(int data){
        // 1-create new node
        Node newNode = new Node(data);
        size++;

        // if node is null 
        if(head == null){
            head = tail = newNode;
            return;
        }

        // 2-newNode next = head
        newNode.next = head;

        // 3-head = newNode
        head = newNode;
    }

    // public void add_last(int data){
    //     Node newNode = new Node(data);
    //     size++;
    //     if(head == null){
    //         head = tail = newNode ;
    //         return;
    //     }
    //     tail.next = newNode;
    //     tail = newNode;
    // }

    public void print(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void reverse(){
        Node prev = null;
        Node curr = tail = head  ; 
        Node next ; 


        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr ;
            curr = next ;
        }
        head = prev ;
    }

    public static void main(String[] args) {
        Reverse ll = new Reverse();
        // ll.head = new Node(1);
        // ll.head.next = new Node(2);
        // Methods 
        ll.add_First(4);
        ll.add_First(3);
        ll.add_First(2);
        ll.add_First(1);
        // ll.add_last(4);
        // ll.add_last(5);

        // ll.add(2,3);
        ll.print();
        ll.reverse();
        ll.print();
        System.out.println(ll.size);
        
    }
}