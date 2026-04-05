class DoubleLL{

    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node tail ;
    public static Node head ;
    public static int size;

    // addFirst
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;

    }

    // removeFirst
    public static int removeFirst(){
        if(head == null){
            System.out.println("Null LL");
            return Integer.MIN_VALUE;
        }

        if(size == 1){
            int val = head.data;
            head.prev = null;
            size--;
            return val;
        }

        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    // removeLast
    public static int removeLast(){
        if(head == null){
            System.out.println("Null LL");
            return Integer.MIN_VALUE;
        }

        if(size == 1){
            int val = head.data;
            head.next = null;
            size--;
            return val;
        }

        Node temp = tail;
        int val = temp.data;
        tail = tail.prev;
        tail.next = null;
        size--;
        return val;
    }


    // print
    public static void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    
    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        dll.addFirst(1);
        dll.addFirst(2);
        dll.addFirst(3);
        dll.addFirst(4);
        dll.removeFirst();
        dll.print();
        dll.removeLast();
        dll.print();
        dll.addLast(6);
        dll.print();
        System.out.println(dll.size);
    }
}

