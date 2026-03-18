
class Practice {

// Question 1
    // public static int gridWays(int i, int j, int n, int m, boolean[][] vis) {
    //     // boundary or already visited
    //     if (i < 0 || j < 0 || i >= n || j >= m || vis[i][j]) {
    //         return 0;
    //     }
    //     // destination
    //     if (i == n-1 && j == m-1) {
    //         return 1;
    //     }
    //     vis[i][j] = true; // mark visited
    //     int w1 = gridWays(i+1, j, n, m, vis); // down
    //     int w2 = gridWays(i, j+1, n, m, vis); // right
    //     int w3 = gridWays(i-1, j, n, m, vis); // up
    //     int w4 = gridWays(i, j-1, n, m, vis); // left
    //     vis[i][j] = false; // backtrack
    //     return w1 + w2 + w3 + w4;
    // }
    public static void main(String[] args) {

        // int n = 4, m = 4;
        // boolean[][] vis = new boolean[n][m];
        // System.out.println(gridWays(0,0,n,m,vis));
        char[][] L ={{},
                    {},
                    {'a', 'b', 'c'},
                    {'d', 'e', 'f'},
                    {'g', 'h', 'i'},
                    {'j', 'k', 'l'},
                    {'m', 'n', 'o'},
                    {'p', 'q', 'r', 's'},
                    {'t', 'u', 'v'},
                    {'w', 'x', 'y', 'z'}};
    }
}
