package intermediate_1_fresh.Arrays_SubArrays;

public class Maximum_Subarray_Easy {
    public static void main(String[] args) {
        int[] A = {2, 1, 3, 4, 5};
        int B = 12;
        System.out.println(maxSubarray(A.length, B, A));
    }

    public static int maxSubarray(int A, int B, int[] C) {
        int sum=0, max_sum=Integer.MIN_VALUE;

        for (int i=0; i<A; i++){
             sum += C[i];
             if (sum<=B && sum>max_sum)
                 max_sum= sum;
             if (sum < 0)
                 sum= 0;
        }
        return max_sum;
    }
}
