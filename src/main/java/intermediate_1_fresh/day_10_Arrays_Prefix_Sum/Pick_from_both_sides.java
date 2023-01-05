package intermediate_1_fresh.day_10_Arrays_Prefix_Sum;

public class Pick_from_both_sides {
    public static void main(String[] args) {
        int[] A = {5, -2, 3 , 1, 2};
        int B = 3;
        System.out.println(solve(A, B));
    }

    public static int solve(int[] A, int B) {
        int sum=0, maxSum=0, n=A.length;

        for (int i=0; i<B; i++)
            sum += A[i];

        maxSum= sum;

        int left=B-1, right=n-1;
        for (int i=0; i<B; i++){
            sum = sum - A[left] + A[right];
            maxSum = Math.max(maxSum, sum);
            left--; right--;
        }

        return maxSum;
    }
}
