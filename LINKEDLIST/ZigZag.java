class ZigZag{

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

    public static void zigzag(){
        // get mid
        Node slow = head;
        Node fast  = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        // reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr ;
            curr = next ;
        }
        Node left = head ;
        Node right  = prev;
        Node nextL , nextR;

        // alternate merger zig-zag
        while(left != null && right != null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left =nextL;
            right = nextR;
        }

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
        ZigZag ll = new ZigZag();
        head = new Node(1);
        head.next = new Node(0);
        head.next.next = new Node(9);
        head.next.next.next = new Node(5);
        ll.print();
        ZigZag.zigzag();
        ll.print();
    }
}