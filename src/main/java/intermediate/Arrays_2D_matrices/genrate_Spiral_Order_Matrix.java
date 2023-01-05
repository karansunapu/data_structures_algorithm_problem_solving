package intermediate.Arrays_2D_matrices;

import java.util.Arrays;

public class genrate_Spiral_Order_Matrix {
    public static void main(String[] args) {
        int A= 4;
        int[][] sol = generateMatrix(A);

        for(int i=0; i<sol.length; i++)
            System.out.println(Arrays.toString(sol[i]));
    }

    public static int[][] generateMatrix(int A) {
        int[][] sol = new int[A][A];
        int min_row = 0, min_col =0;
        int max_row = A-1, max_col =A-1;
        int num = 1;

        while (num<A*A) {

            // fix row=min_row, col= min_col -> max_col .. min_row++
//            num = insertElementsFromLoop(num, min_row, min_row, min_col, max_col, sol);
            for(int i=min_col; i<=max_col; i++)
                sol[min_row][i] = num++;
            min_row++;

            // row=min_row -> max_row, fix col=max_col ..max_col--
//            num = insertElementsFromLoop(num, min_row, max_row, max_col, max_col, sol);
            for(int i=min_row; i<=max_row; i++)
                sol[i][max_col] = num++;
            max_col--;

            // fix row=max_row, col= max_col -> min_col ..max_row--
//            num = insertElementsFromLoop(num, max_row, max_row, max_col, min_col, sol);
            for(int i=max_col; i>=min_col; i--)
                sol[max_row][i] = num++;
            max_row--;

            // row=max_row -> min_row, fix col= min_col .. min_col++
//            num = insertElementsFromLoop(num, max_row, min_row, min_col, min_col, sol);
            for(int i=max_row; i>=min_row; i--)
                sol[i][min_col] = num++;
            min_col++;
        }

        return sol;
    }

//    public static int insertElementsFromLoop(int num, int i_s, int i_e, int j_s, int j_e, int[][] sol){
//        System.out.println("for:" +i_s+ " : " +i_e+ " : " +j_s+ " : " +j_e);
//        for(int i=i_s; i<=i_e; i++){
//            for(int j=j_s; j<=j_e; j++){
//                sol[i][j] = num++;
//            }
//        }
//
//        return num;
//    }
}
