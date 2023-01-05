package intermediate.Recursion_2;

public class Kth_Symbol {
    public static void main(String[] args) {
        System.out.println(solve(4, 5));
    }

    public static int solve(int A, int B) {
        return solveQ(A, B) ? 1 : 0;
    }


    static boolean solveQ(int n, int k) {

        //edge case
        if (n == 1 && k == 1)
            return false;

        //cz - row 4 = (row 3) + NOT (row 3)
        // row 3 -- 0110
        // row 4 -- 0110-1001
        int mid = (int) Math.pow(2, n - 1) / 2;

        // take previous row 3 (same as row 4 first half)
        if (k <= mid)
            return solveQ(n - 1, k);
        // take NOT OF previous row 3 (NOT of row 4 first half) - and k = k-mid
        else
            return !solveQ(n - 1, k - mid);
    }
}
