class kthAncestor{


static class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class Main {

    static Node root;
    static int ans = -1;

    static void buildTree() {

        root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        root.left.left.left = new Node(8);
    }

    static int kthAncestor(Node root, int node, int k) {

        if (root == null)
            return -1;

        if (root.data == node)
            return 0;

        int left = kthAncestor(root.left, node, k);
        int right = kthAncestor(root.right, node, k);

        if (left == -1 && right == -1)
            return -1;

        int distance = Math.max(left, right) + 1;

        if (distance == k)
            ans = root.data;

        return distance;
    }

    public static void main(String[] args) {

        buildTree();

        int node = 8;
        int k = 2;

        kthAncestor(root, node, k);

        System.out.println(ans);
    }
}
}