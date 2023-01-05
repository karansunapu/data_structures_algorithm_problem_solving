package intermediate.Day12_IntermediateDSAArraysSubarrays;

public class min_sum_Subarray_of_size_K {

    // MISTAKES ---->>>
    // FORGOT TO UPDATE THE SUM

    public static void main(String[] args) {
        int[] A = {3, 7, 5, 20, -10, 0, 12};
        System.out.println(solve(A, 2));
    }

    public static int solve(int[] A, int B) {
        int min_sum = Integer.MAX_VALUE;
        int sum = 0;
        for (int i=0; i<B; i++) {
            sum += A[i];
        }
        min_sum =sum;

        int index = 0;
        int start = 1;
        int end = B;
        while (end < A.length) {
            sum = (sum + A[end] - A[start-1]);
            if (sum < min_sum){
                index = start;

                // FORGOT TO UPDATE THE SUM
                min_sum = sum;
            }
            start++;
            end++;
        }
        return index;
    }
}
