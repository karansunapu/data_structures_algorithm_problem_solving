package intermediate.Arrays_2D_matrices;

import java.util.Arrays;

public class column_wise_sum_of_matrix {

    /*
            1, 2, 3
            4, 5, 6
            7, 8, 9
     */
    public static void main(String[] args) {
        int[][] A = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        System.out.println(Arrays.toString(solve(A)));
    }

    public static int[] solve(int[][] A) {
        int rows = A.length;
        int cols = A[0].length;
        int[] sol = new int[cols];

        // for( fix col 0 -> col)
        //      iterate row= 0 -> row;
        for(int j=0; j<cols; j++) {
            int sum=0;
            for (int i=0; i<rows; i++) {
                sum += A[i][j];
            }
            sol[j] = sum;
        }

        return sol;
    }


}
