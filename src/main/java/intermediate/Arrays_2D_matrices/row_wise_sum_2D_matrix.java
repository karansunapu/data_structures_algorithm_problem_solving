package intermediate.Arrays_2D_matrices;

import java.util.Arrays;

public class row_wise_sum_2D_matrix {
    public static void main(String[] args) {
        int[][] A = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        System.out.println(Arrays.toString(solve(A)));
    }

    public static int[] solve(int[][] A) {
        int rows = A.length;
        int cols = A[0].length;
        int[] sol = new int[rows];

        for(int i=0; i<rows; i++) {
            int sum=0;
            for (int j=0; j<cols; j++) {
                sum += A[i][j];
            }
            sol[i] = sum;
        }

        return sol;
    }
}
