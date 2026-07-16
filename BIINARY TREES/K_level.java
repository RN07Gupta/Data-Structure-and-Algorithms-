class k_level{

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void kth_level(Node root , int k , int curr){
        if(root == null){
            return ;
        }

        if(k == curr){
            System.out.println(root.data);
            return;
        }

        kth_level(root.left , k , curr+1);
        kth_level(root.right , k , curr+1);
    }

    public static void main(String[] args){

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        kth_level(root , 3 , 1);
    }
}