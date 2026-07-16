import java.util.*;

public class LCAPathMethod {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    static boolean found;

    public static void findPath(Node root, Node target, ArrayList<Node> path) {

        if (root == null || found)
            return;

        path.add(root);

        if (root == target) {
            found = true;
            return;
        }

        findPath(root.left, target, path);
        findPath(root.right, target, path);

        if (!found)
            path.remove(path.size() - 1);
    }

    public static void main(String[] args) {

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Node p = root.left.left;      
        Node q = root.left.right;     

        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        found = false;
        findPath(root, p, path1);

        found = false;
        findPath(root, q, path2);

        System.out.print("Path to " + p.data + " : ");
        for (Node node : path1)
            System.out.print(node.data + " ");

        System.out.println();

        System.out.print("Path to " + q.data + " : ");
        for (Node node : path2)
            System.out.print(node.data + " ");

        System.out.println();

        Node lca = null;

        int i = 0;
        while (i < path1.size() && i < path2.size()) {

            if (path1.get(i) == path2.get(i))
                lca = path1.get(i);
            else
                break;

            i++;
        }

        System.out.println("Lowest Common Ancestor = " + lca.data);
    }
}