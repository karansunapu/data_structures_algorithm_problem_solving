package intermediate_1_fresh.day_10_Arrays_Prefix_Sum;

public class Special_Index_remove_oddEven_same {
    public static void main(String[] args) {
        int[] A = {1, 1, 1};
        System.out.println(solve(A));
    }

    public static int solve(int[] A) {
        int evenRsum=0, oddRsum=0, evenLsum=0, oddLsum=0, n=A.length, count=0;

        for (int i=0; i<n; i++){
            if (i%2 == 0)
                evenRsum += A[i];
            else
                oddRsum += A[i];
        }

        for (int i=0; i<n; i++){
            if (i%2 == 0)
                evenRsum -= A[i];
            else
                oddRsum -= A[i];

            if (evenLsum + oddRsum == oddLsum + evenRsum)
                count++;

            if (i%2 == 0)
                evenLsum += A[i];
            else
                oddLsum += A[i];
        }

        return count;
    }
}
