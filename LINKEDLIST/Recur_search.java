class Recur_search{

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public static void add(int data){
        if(size == 0){
            Node newN = new Node(data);
            size=1;
            head = tail = newN;
        }
        else{
            Node newN = new Node(data);
            size++;
            newN.next = head;
            head = newN;

        }
    }

    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
        System.out.println("Size = " + size);
    }

    public static int helper(int key , Node head){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }

        int idx = helper(key ,head.next );
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }
    
    public static int search(int key){
        return helper(key , head );
    }
    public static void main(String[] args) {
        Recur_search ll = new Recur_search();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.print();
        System.out.println("Key found at index : " + ll.search(2));
    }
}