class TransformTree{
    static class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class Main {

    static int transform(Node root) {

        if (root == null)
            return 0;

        int leftSum = transform(root.left);
        int rightSum = transform(root.right);

        int oldValue = root.data;

        root.data = leftSum + rightSum;

        return oldValue + root.data;
    }

    static void inorder(Node root) {

        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        Node root = new Node(10);

        root.left = new Node(5);
        root.right = new Node(3);

        root.left.left = new Node(2);
        root.left.right = new Node(1);

        root.right.right = new Node(6);

        transform(root);

        inorder(root);
    }
}
}