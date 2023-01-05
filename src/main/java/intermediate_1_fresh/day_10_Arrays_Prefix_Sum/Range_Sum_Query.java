package intermediate_1_fresh.day_10_Arrays_Prefix_Sum;

import java.util.Arrays;

public class Range_Sum_Query {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int[] pf = new int[A.length];
        pf[0] = A[0];

        for (int i=1; i<A.length; i++)
            pf[i] = pf[i-1] + A[i];

        System.out.println(Arrays.toString(pf));
    }

}
