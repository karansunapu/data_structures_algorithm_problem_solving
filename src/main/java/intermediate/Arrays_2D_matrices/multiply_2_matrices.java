package intermediate.Arrays_2D_matrices;

import java.util.Arrays;

public class multiply_2_matrices {
    public static void main(String[] args) {

        int A[][]={{94, 91}}; // m * n  - 1 * 2

        int B[][]={
                    {35, -52, -12, 26, -93, -61},
                    {29, -20, -36, -9, 66, 15}
                  }; // p * q - 2 * 6

        int matrix_1_rows = A.length;
        int matrix_2_cols = B[0].length;
        int matrices_common_row_col = A[0].length;

        int c[][]=new int[matrix_1_rows][matrix_2_cols];    // m * q

        for(int i=0;i<matrix_1_rows;i++){
            for(int j=0;j<matrix_2_cols;j++){
                c[i][j]=0;
                for(int k=0;k<matrices_common_row_col;k++)
                {
                    c[i][j]+=A[i][k]*B[k][j];
                }
            }
        }

        System.out.println(Arrays.deepToString(c));
    }
}
