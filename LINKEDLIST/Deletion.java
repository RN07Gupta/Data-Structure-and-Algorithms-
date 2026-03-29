class Deletion{

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

    public void add_First(int data){

        Node newNode = new Node(data);
        size++;
     
        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public int remove_F(){

        if(head == null){ // size = 0
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(head == tail ){ // size =1 
            int value = head.data;
            head = tail = null;
            size = 0;
            return value;
        }
        int value = head.data;
        head = head.next;
        size--;
        return value;
    }

    public int remove_L(){
        
        if(size == 0){
            System.out.println("Empty LL");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int value = head.data;
            head = tail = null;
            size = 0;
            return value;
        }

        Node prev = head;
        for(int i=0 ; i<size-2 ; i++){
            prev = prev.next;
        }
            int value = prev.next.data;
            prev.next = null;
            tail = prev;
            size--;
            return value;
        
    }

    public void print(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Deletion ll = new Deletion();
        ll.add_First(4);
        ll.add_First(3);
        ll.add_First(2);
        ll.add_First(1);
        ll.print();
        ll.remove_F();
        ll.remove_L();
        ll.print();
        System.out.println("Size: " + ll.size);
    }
}