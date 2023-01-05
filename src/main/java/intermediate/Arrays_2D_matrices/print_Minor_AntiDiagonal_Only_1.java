package intermediate.Arrays_2D_matrices;

public class print_Minor_AntiDiagonal_Only_1 {
    public static void main(String[] args) {
        int[][] A = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        System.out.println(solve(A));
    }

    public static int solve(final int[][] A) {
        int rows = A.length;
        int sum =0;
        int i=0, j=rows-1;
        while(i<=rows-1 || j>=0){
            sum += A[i][j];
            i++;
            j--;
        }

        return sum;
    }
}
