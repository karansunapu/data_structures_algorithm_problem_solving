package intermediate.Arrays_2D_matrices;

import java.util.Arrays;

public class print_all_Anti_Diagonals {
    public static void main(String[] args) {
        int[][] A = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};

//        System.out.println(Arrays.deepToString(diagonal(A)));
        diagonal_2(A);
    }

    public static void diagonal_2(int[][] A) {
        int n = A.length;

        for (int row=0,col=0; col<n; col++)
            print_diag(A, row, col, n);

        for (int row=1,col=n-1; row<n; row++)
            print_diag(A, row, col, n);

    }

    static void print_diag(int[][] A, int s_row, int s_col, int n){
        System.out.println();
        while(s_row < n && s_col>=0){
            System.out.print(A[s_row][s_col] + " ");
            s_row++; s_col--;
        }
    }

    public static int[][] diagonal(int[][] A) {
        int rows = A.length;
        int cols = A[0].length;
        // rows + cols -1 -> no of diagonals, cols -> max no of elem in a diagonal
        int[][] sol = new int[rows + cols -1][cols];
        int final_ans_array_row_index = 0;

        // fix row=0 , iterate col (0 -> cols)
        for(int j=0; j<cols; j++){
            sol[final_ans_array_row_index] = printAntiDiagonals(0, j, rows, cols, A);
            final_ans_array_row_index++;
        }

        // iterate row (from 1 -> rows) , fix col= last_column
        for(int i=1; i<rows; i++){
            sol[final_ans_array_row_index] = printAntiDiagonals(i, cols-1, rows, cols, A);
            final_ans_array_row_index++;
        }

        return sol;
    }

    public static int[] printAntiDiagonals(int start_i, int start_j, int rows, int cols, int[][] A){
        int i=0;
        int[] sol_row = new int[cols];

        while (start_i<rows && start_j>=0){
            sol_row[i] = A[start_i][start_j];
            i++;
            start_i++;
            start_j--;
        }

        return sol_row;
    }
}
