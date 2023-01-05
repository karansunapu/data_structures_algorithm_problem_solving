package advanced.array_1;

public class max_subarray_sum {
    public static void main(String[] args) {
        int[] arr = {-7, -2, -8};
//        System.out.println(solve(arr));
        System.out.println(solve(arr));
    }

    // kadens
    static int solve(int[] arr) {
        int max_sum = Integer.MIN_VALUE, curr_sum = 0;
        for (int i : arr) {

            curr_sum += i;

            max_sum = Math.max(curr_sum, max_sum);

            if (curr_sum < 0)
                curr_sum = 0;

        }

        return max_sum;
    }

    static int solve_all_subarrays(int[] arr){
        int max_sum = Integer.MIN_VALUE;

        for (int i=0; i<arr.length; i++){
            int sum =0;
            for (int j=i; j<arr.length; j++){
                sum += arr[j];

                max_sum = Math.max(sum, max_sum);
            }
        }
        return max_sum;
    }
}
