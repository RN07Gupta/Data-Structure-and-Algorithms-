import java.util.*;

class Node {
    char data;
    Node next;

    Node(char data) {
        this.data = data;
        this.next = null;
    }
}

public class Practice {

    public static boolean isPalindrome(Node head) {
        Stack<Character> s = new Stack<>();

        Node temp = head;

        // Step 1: Push all elements into stack
        while (temp != null) {
            s.push(temp.data);
            temp = temp.next;
        }

        // Step 2: Compare with stack
        temp = head;
        while (temp != null) {
            if (temp.data != s.pop()) {
                return false;
            }
            temp = temp.next;
        }

        return true;
    }

    // Helper to create list
    public static Node createList(char[] arr) {
        Node head = new Node(arr[0]);
        Node temp = head;

        for (int i = 1; i < arr.length; i++) {
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        char[] arr = {'A' , 'B' , 'C' , 'B' , 'A'};
        Node head = createList(arr);

        System.out.println(isPalindrome(head)); // true
    }
}