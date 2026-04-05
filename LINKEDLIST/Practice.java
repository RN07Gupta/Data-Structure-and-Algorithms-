
class Practice {

    static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

   // Solution 1
    // public static Node head1;
    // public static Node head2;

    // public Node getInter(Node head1, Node head2) {
    //     while (head2 != null) {
    //         Node temp = head1;
    //         while (temp != null) {
    //             if (temp == head2) {
    //                 return head2;
    //             }
    //             temp = temp.next;
    //         }
    //         head2 = head2.next;
    //     }
    //     return null;
    // }

    // Solution 2
    // public static Node head;
    // public static Node deleteNAfterM(Node head , int M , int N){
    //     if(head == null || M == 0){
    //         return null;
    //     }
    //     Node curr = head;

    //     while(curr != null){
    //         for(int i=1 ; i<M && curr != null ; i++){
    //             curr = curr.next;
    //         }

    //         if(curr == null){
    //             break;
    //         }

    //         Node temp = curr.next;

    //         for(int i=0 ; i<N && temp != null ; i++){
    //             temp = temp.next;
    //         }
    //         curr.next = temp;
    //         curr = temp ;
    //     }
    //     return head;
    // }

    // Solution 3
//     public static Node head;
//     public static Node swapNodes(Node head, int x, int y) {

//     if (x == y) {
//         return head;
//     }

//     Node temp = head;
//     int size = 0;

//     Node X = null, Y = null;
//     Node prevX = null, prevY = null;

//     while (temp != null) {

//         if (size == x - 2) {
//             prevX = temp;
//         }
//         if (size == y - 2) {
//             prevY = temp;
//         }

//         if (size == x - 1) {
//             X = temp;
//         }
//         if (size == y - 1) {
//             Y = temp;
//         }

//         temp = temp.next;
//         size++;
//     }

//     // If either position does not exist
//     if (X == null || Y == null) {
//         return head;
//     }

//     // Connect previous nodes
//     if (prevX != null) {
//         prevX.next = Y;
//     } else {
//         head = Y;
//     }

//     if (prevY != null) {
//         prevY.next = X;
//     } else {
//         head = X;
//     }

//     // Swap next pointers
//     Node next = X.next;
//     X.next = Y.next;
//     Y.next = next;

//     return head;
// }


    public void print(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Practice list = new Practice();

        // Question 1 ---> In a system there are two singly linked list. By some programming error, the end node of one  of the linked lists got linked to the second list, forming an inverted Y-shaped list. Write a  program to get the point where two linked lists merge.

        // Solution 1

        // Node head1, head2;
        // list.head1 = new Node(10);
        // list.head2 = new Node(3);
        // Node newNode = new Node(6);
        // list.head2.next = newNode;
        // newNode = new Node(9);
        // list.head2.next.next = newNode;
        // newNode = new Node(15);
        // list.head1.next = newNode;
        // list.head2.next.next.next = newNode;
        // newNode = new Node(30);
        // list.head1.next.next = newNode;
        // list.head1.next.next.next = null;

        // Node intersectionPoint = list.getInter(head1, head2);

        // if (intersectionPoint == null) {
        //     System.out.print(" No Intersection Point \n");
        // } else {
        //     System.out.print("Intersection Point: "
        //             + intersectionPoint.data);
        // }


        // Question 2
        // Delete N Nodes After M Nodes of a Linked List
        // We have a linked list and two integers M and N. Traverse the linked list such that you retain M
        // nodes then delete next N nodes, continue the same till end of the linked list. Difficulty Level:
        // Rookie.

        // Solution 2

        // Node head = new Node(1);
        // head.next = new Node(2);
        // head.next.next = new Node(3);
        // head.next.next.next = new Node(4);
        // head.next.next.next.next = new Node(5);
        // head.next.next.next.next.next = new Node(6);
        // head.next.next.next.next.next.next = new Node(7);
        // head.next.next.next.next.next.next.next = new Node(8);

        // Node d = deleteNAfterM(head, 2, 2);
        // list.print();

        //  Question 3 :
        // Swapping Nodes in a Linked List
        // We have a linked list and two keys in it, swap nodes for two given keys. Nodes should be
        // swapped by changing links. Swapping data of nodes may be expensive in many situations when
        // data contains many fields. It may be assumed that all keys in the linked list are distinct.

        // Solution 3
        // Node head = new Node(1);
        // head.next = new Node(2);
        // head.next.next = new Node(3);
        // head.next.next.next = new Node(4);
        // list.swapNodes(head , 2,4);
        // list.print();

    }
}
