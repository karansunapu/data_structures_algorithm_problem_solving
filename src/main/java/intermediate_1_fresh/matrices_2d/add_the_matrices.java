package intermediate_1_fresh.matrices_2d;

import java.util.Arrays;

public class add_the_matrices {
    public static void main(String[] args) {
        int[][] A = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        int[][] B = {{9, 8, 7},{6, 5, 4},{3, 2, 1}};

        System.out.println(Arrays.deepToString(solve(A, B)));
    }

    public static int[][] solve(int[][] A, int[][] B) {
        int m=A.length, n=A[0].length;
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                A[i][j] += B[i][j];
            }
        }
        return A;
    }
}
