class Merge {

    public static class Node{
        int data ;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail ;

    public static Node getMid(Node head){
        Node slow = head;
        Node fast  = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }


    public Node mergeSort(Node head){
        // base 
        if(head == null || head.next == null){
            return head;
        }


        // mid 
        Node mid = getMid(head);
        //left & right MS

        Node rightHead = mid.next;
        mid.next = null;

        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        // merge
        return merge(newLeft , newRight);

    }

    public static Node merge(Node head1, Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while(head2 != null){
            temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
        }
        return mergedLL.next;
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
        Merge ll = new Merge();
        head = new Node(1);
        head.next = new Node(0);
        head.next.next = new Node(9);
        head.next.next.next = new Node(5);

        ll.print();
        head = ll.mergeSort(head);
        ll.print();


    }
}