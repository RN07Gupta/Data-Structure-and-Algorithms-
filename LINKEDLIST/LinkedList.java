class LinkedList{

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

    public void add_last(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode ;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int index , int data){

        if(index == 0){
            add_First(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0 ;

        while(i < index-1){
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;

    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        // ll.head = new Node(1);
        // ll.head.next = new Node(2);
        // Methods 
        ll.add_First(2);
        ll.add_First(1);
        ll.add_last(4);
        ll.add_last(5);

        ll.add(2,3);
        ll.print();
        System.out.println(ll.size);
        
    }
}