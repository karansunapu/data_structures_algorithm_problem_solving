package intermediate_1_fresh.Arrays_SubArrays;

public class Subarray_with_least_average {
    public static void main(String[] args) {
        int[] A = {3, 7, 90, 20, 10, 50, 40};
        int B = 3;
        System.out.println(solve(A, B));
    }

    public static int solve(int[] A, int B) {
        int sum=0, min_sum=0, n=A.length, ans=0;

        for (int i=0; i<B; i++)
            sum += A[i];

        min_sum = sum;

        for (int i=1; i<n-B; i++){
            sum = sum - A[i-1] + A[i+B-1];
            if (sum < min_sum){
                ans = i;
                min_sum = sum;
            }
        }
        return ans;



    }
}
