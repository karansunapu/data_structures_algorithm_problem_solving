package intermediate_1_fresh.Arrays_SubArrays;

public class Max_Sum_Contiguous_Subarray {
    public static void main(String[] args) {
        int[] A = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(A));
    }

    public static int maxSubArray(final int[] A) {

        int n = A.length, max_sum=Integer.MIN_VALUE, current_range_sum=0;
//        for (int i=0; i<n; i++) {
//            int sum =0;
//            for (int j=i; j<n; j++){
//                sum += A[j];
//                max_sum = Math.max(max_sum, sum);
//            }
//        }

        for (int i=0; i<n; i++) {
            current_range_sum += A[i];
            max_sum = Math.max(current_range_sum, max_sum);
            if (current_range_sum < 0)
                current_range_sum =0;
        }

        return max_sum;
    }
}
