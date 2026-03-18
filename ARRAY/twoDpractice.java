
class twoDpractice {

    public static void main(String[] args) {
        // Question 1 :Print the number of 7’s that are inthe 2d array.Example :Input - 
        // int array[][] = { {4,7,8},{8,8,7} };
        // int count = 0;
        // for(int i=0; i<array.length ; i++){
        //     for(int j=0 ; j<array[0].length ; j++){
        //         if(array[i][j] == 7){
        //             count = count + 1;
        //         }
        //     }
        // }
        // System.out.println(count);

        // Question 2 :Print out the sum of the numbers inthe second row of the “nums” array.Example :Input - 
        // int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
        // int sum =0;
        // for(int i=0 ; i<nums.length ; i++){
        //     if(i == 1){
        //         for(int j =0; j<nums[0].length ; j++){
        //             sum = sum + nums[i][j];
        //         }
        //     }
        // }
        // System.out.println(sum);
        // Question 3 :Write a program to FindTransposeofa Matrix.What is Transpose?Transpose of a matrix is the process ofswapping therows to columns. For a 2x3 matrix,
        // Matrix 
        // a11    a12    a13 
        // a21    a22    a23
        // Transposed Matrix 
        // a11   a21
        // a12   a22
        // a13   a23 
        int array[][] = {{4, 7, 8}, {8, 8, 7}};

        int n = array.length, m = array[0].length;
        int T[][] = new int[m][n];

// Transpose
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                T[j][i] = array[i][j];
            }
        }

// Print Transpose
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(T[i][j] + " ");
            }
            System.out.println();
        }
    }
}
