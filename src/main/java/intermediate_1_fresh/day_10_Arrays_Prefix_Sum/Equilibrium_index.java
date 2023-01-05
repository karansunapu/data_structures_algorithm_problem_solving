package intermediate_1_fresh.day_10_Arrays_Prefix_Sum;

public class Equilibrium_index {
    public static void main(String[] args) {
        int[] A = {-7, 1, 5, 2, -4, 3, 0};
        System.out.println(solve(A));
    }

    public static int solve(int[] A) {
       int lsum=0, rsum=0, n=A.length;

       for (int i=0; i<n; i++)
           rsum += A[i];

       for (int i=0; i<n; i++){
           rsum = rsum - A[i];
           if (lsum == rsum) return i;
           lsum = lsum + A[i];
       }

       return -1;
    }
}
