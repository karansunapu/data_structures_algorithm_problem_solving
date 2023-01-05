package intermediate.Day12_IntermediateDSAArraysSubarrays;

public class Sum_of_All_Subarrays {
    public static void main(String[] args) {
        int[] A = {1, 2, 3};
        System.out.println(subarraySum(A));
    }

    public static long subarraySum(int[] A) {

        int sum =0;
        for(int i=0; i<A.length; i++) {
            // WRONG - sum += (i+1) * (A.length-i) * A[i];
            // convert A[i] -> int to long

            // WRONG - sum += (i+1) * (A.length-i) * (long)A[i];
            // dot know why ..just keep -> (long)A[i] in front

            sum += (long)A[i] * (i+1) * (A.length-i) ;


        }

        return sum;

    }
}
