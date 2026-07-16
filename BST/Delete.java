class Delete {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static Node delete(Node root , int val){
        if(root.data > val){
            root.left = delete(root.left , val);
        }
        else if(root.data < val){
            root.right = delete(root.right , val);
        }
        else{
            // case 1 - no child
            if(root.left == null && root.right == null){
                return null;
            }

            // case 2 - one child
            if(root.left == null){
                return root.right ;
            }else if(root.right == null){
                return root.left ;
            }

            // case 3 - both children
            Node IS = findInorderSucc(root.right);
            root.data = IS.data;
            root.right = delete(root.right , IS.data);
        }
        return root;
    }

    public static Node findInorderSucc(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    public static void inOrder(Node root){

            if(root == null){
                return;
            }
            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);
        }
    public static void main(String[] args) {

        // Creating the BST manually

        Node root = new Node(8);

        // Left subtree
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.left.left = new Node(1);
        root.left.left.right = new Node(4);
        root.left.right = new Node(6);

        // Right subtree
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(14);

        root = delete(root , 3);
        System.out.println();
        inOrder(root);
    }
}