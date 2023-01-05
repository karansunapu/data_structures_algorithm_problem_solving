package intermediate.Arrays_2D_matrices;

import java.util.Arrays;

public class Rotate_Matrix_90_degree {
    public static void main(String[] args) {
        int[][] A = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        System.out.println(Arrays.deepToString(solve(A)));

    }

    public static int[][] solve(int[][] A) {
        int rows = A.length;
        int cols = A[0].length;

        //transpose -> n*n -> only upper / lower triangle
        for(int i=0; i<rows-1; i++){
            for(int j=i+1; j<cols; j++){
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }

        // fix rows -> reverse
        for(int cur_row=0; cur_row<rows; cur_row++) {
            int i=0; int j=cols-1;
            while(i<j){
                int temp = A[cur_row][i];
                A[cur_row][i] = A[cur_row][j];
                A[cur_row][j] = temp;
                i++;
                j--;
            }
        }

        return A;
    }

}
