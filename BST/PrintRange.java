class PrintRange{

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
    public static int rangeSumBST(Node root, int low, int high) {

        if (root == null) {
            return 0;
        }

        if (root.data < low) {
            return rangeSumBST(root.right, low, high);
        }

        if (root.data > high) {
            return rangeSumBST(root.left, low, high);
        }

        return root.data
                + rangeSumBST(root.left, low, high)
                + rangeSumBST(root.right, low, high);
    }
    public static void main(String[] args) {
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

        System.out.println(rangeSumBST(root , 4 , 11));
    }
}