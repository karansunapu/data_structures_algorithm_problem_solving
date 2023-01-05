package intermediate_1_fresh.Arrays_SubArrays;

public class sum_of_all_subarrays {
    public static void main(String[] args) {

        int[] A = {1, 2, 3};
        System.out.println(subarraySum(A));
    }

    public static long subarraySum(int[] A) {
        int start_options=1, end_options=A.length, sum=0;
        for (int i: A) {
            sum += i * (start_options * end_options);
            start_options++; end_options--;
        }
        return sum;
    }
}
