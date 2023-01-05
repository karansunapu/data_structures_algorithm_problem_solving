package intermediate.Day12_IntermediateDSAArraysSubarrays;

public class maxSumContiguousSubArray {
    public static void main(String[] args) {
        int[] A = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(A));
    }

    public static int maxSubArray(final int[] A) {

        // MISTAKES ---->>>
        // Basic carry-forward approach is giving O(n^2) - TLE
        // needed kadens
        // n_logn  solution also
            // https://www.geeksforgeeks.org/maximum-subarray-sum-using-divide-and-conquer-algorithm/

        // KADANES / DP
        int sum = Integer.MIN_VALUE;
        int last = 0;

        /*
            for(every element) {
                add the element to last_sum and check
                sum = max( sum , last_sum )
                // if new sum is greater or pehle wla hi bda tha

                if ( last_sum < 0)
                    then no use to continue the sum (pehle se jo aa ra h) and start from fresh.. last_sum = 0

            }
         */
        for (int num : A) {
            last += num;
            sum = Math.max(sum, last);
            if (last < 0)
                last = 0;
        }
        return sum;

    }

//    public static int maxSubArray(final int[] A) {

//        //BASIC APPROACH - TC -> O(n^2)
//        int len = A.length;
//        int max_sum = 0;
//
//        for(int i=0; i<len; i++) {
//            int sum=0;
//            for (int j=i; j<len; j++) {
//                sum += A[j];
//                max_sum = Math.max(max_sum, sum);
//            }
//        }
//        return max_sum;
//    }
}
