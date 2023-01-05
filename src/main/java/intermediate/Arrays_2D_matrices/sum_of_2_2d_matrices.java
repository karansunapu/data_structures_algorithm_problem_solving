package intermediate.Arrays_2D_matrices;

import java.util.Arrays;

public class sum_of_2_2d_matrices {
    public static void main(String[] args) {
       int[][] A = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        int[][] B = {{9, 8, 7},{6, 5, 4},{3, 2, 1}};

        System.out.println(Arrays.deepToString(solve(A, B)));
    }

    public static int[][] solve(int[][] A, int[][] B) {
        int rows = A.length;
        int col = A[0].length;

        for(int i=0; i<rows; i++) {
            for (int j=0; j<col; j++) {
                B[i][j] += A[i][j];
            }
        }

        return B;
    }
}
