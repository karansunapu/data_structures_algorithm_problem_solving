package advanced.Hashing_1;

import java.util.Arrays;
import java.util.HashSet;

public class Sub_array_with_0_sum {
    public static void main(String[] args) {
        int[] A = { 96, -71, 18, 66, -39, -32, -16, -83, -11, -92, 55, 66, 93, 5,
                    50, -45, 66, -28, 69, -4, -34, -87, -32, 7, -53, 33, -12, -94,
                    -80, -71, 48, -93, 62 };
//        System.out.println(Arrays.toString(A));
//        for (int i=1; i<A.length; i++)
//            A[i] = A[i] + A[i-1];
//        System.out.println(Arrays.toString(A));
//        Arrays.sort(A);
//        System.out.println(Arrays.toString(A));

        System.out.println(solve(A));
    }

    public static int solve(int[] A) {
        int pf=0;
        HashSet<Integer> hset = new HashSet<>();
        for (int i=0; i<A.length; i++){
            pf += A[i];
            if (hset.contains(pf) || pf==0)
                return 1;
            else
                hset.add(pf);
        }
        return 0;
    }
}
