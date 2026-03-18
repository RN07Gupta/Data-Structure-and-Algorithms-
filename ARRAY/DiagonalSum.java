class DiagonalSum{

    // public static void Dsum(int matrix[][]){ //O(n^2)
    //     int n= matrix[0].length;
    //     int m = n;
    //     int Psum = 0;
    //     int Ssum = 0;
    //     int Tsum;
    //     int S = 0;
    //     for (int i = 0; i < n; i++) {
    //         for (int j = 0; j < m; j++) {
    //             if( i == j){
    //                 Psum = Psum + matrix[i][j];
                    
    //             }

    //             if(i +j == n -1){
    //                 Ssum = Ssum + matrix[i][j];
                    
    //             }

    //             if(n % 2 != 0){
    //                 S = matrix[n/2][n/2];
    //             }
    //         }
    //     }

    //     System.out.println(Psum);
    //     System.out.println(Ssum);
    //     System.out.println(S);
    //     Tsum = Psum + Ssum - S;
    //     System.out.println(Tsum); 
    // }


    
    public static void Dsum(int matrix[][]){
        int sum =0;
        for(int i=0; i< matrix.length ; i++){
            // pd
            sum += matrix[i][i];
            // sd
            if(i != matrix.length - 1-i)
            sum += matrix[i][matrix.length-i-1]; 
        }
        System.out.println(sum);
    }
    public static void main(String args[]){
        // int matrix[][] = {
        //     {1, 2, 3, 4},
        //     {5, 6, 7, 8},
        //     {9,10,11,12},
        //     {13,14,15,16}
        // };

        int matrix[][] = {
            {1, 2, 3, 4 ,5 },
            {6, 7, 8,9,10},
            {11,12,13,14,15},
            {16,17,18,19,20},
            {21,22,23,24,25}
        };

        // int matrix[][] = {
        //     {1,2,3},
        //     {4,5,6},
        //     {7,8,9}
        // };

        Dsum(matrix);
    }
}

