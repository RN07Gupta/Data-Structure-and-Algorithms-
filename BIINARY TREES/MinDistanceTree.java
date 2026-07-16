public class MinDistanceTree {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    // Find LCA
    public static Node lca(Node root, int n1, int n2) {

        if (root == null)
            return null;

        if (root.data == n1 || root.data == n2)
            return root;

        Node leftLca = lca(root.left, n1, n2);
        Node rightLca = lca(root.right, n1, n2);

        if (leftLca != null && rightLca != null)
            return root;

        if (leftLca != null)
            return leftLca;

        return rightLca;
    }

    // Distance from root to target
    public static int distance(Node root, int target) {

        if (root == null)
            return -1;

        if (root.data == target)
            return 0;

        int left = distance(root.left, target);

        if (left != -1)
            return left + 1;

        int right = distance(root.right, target);

        if (right != -1)
            return right + 1;

        return -1;
    }

    // Minimum Distance
    public static int minDistance(Node root, int n1, int n2) {

        Node ancestor = lca(root, n1, n2);

        int d1 = distance(ancestor, n1);
        int d2 = distance(ancestor, n2);

        return d1 + d2;
    }

    public static void main(String[] args) {

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int n1 = 4;
        int n2 = 7;

        System.out.println("Minimum Distance = " + minDistance(root, n1, n2));
    }
}