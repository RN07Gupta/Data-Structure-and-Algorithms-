import java.util.Scanner;

class Msearch {

    public static boolean search(int matrix[][], int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == target) {
                    System.out.println("Element found at: " + i + ", " + j);
                    return true;
                }
            }
        }

        System.out.println("Element not found");
        return false;
    }

    public static void main(String args[]) {
        int matrix[][] = new int[3][3];

        Scanner sc = new Scanner(System.in);

        int n = matrix.length;
        int m = matrix[0].length;

        // input
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // print matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // search element
        System.out.print("Enter element to search: ");
        int target = sc.nextInt();

        search(matrix, target);
    }
}
