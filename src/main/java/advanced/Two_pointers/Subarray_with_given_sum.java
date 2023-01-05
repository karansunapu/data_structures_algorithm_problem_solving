package advanced.Two_pointers;

import java.util.Arrays;

public class Subarray_with_given_sum {
    public static void main(String[] args) {
        int[] A = { 5, 10, 20, 100, 105};
        int B = 110;
        System.out.println(Arrays.toString(solve(A, B)));
    }

    public static int[] solve(int[] A, int B) {
        int[] ans = Arrays.copyOf(A, A.length);
        if (A[0] == B)
            return Arrays.copyOfRange(A, 0, 0 + 1);
        for (int i=1; i<A.length; i++){
            A[i] = A[i] + A[i-1];
            if (A[i] == B){
                return Arrays.copyOfRange(ans, 0, i + 1);
            }
        }
        int i=0, j=1;
        while (j<A.length){
            if (A[j]-A[i] == B){
                int[] subarray = new int[j - i];
                for (int k = 0; k < subarray.length; k++) {
                    subarray[k] = A[i+1 + k] - A[i+1 + k -1];
                }
                return subarray;
//                return new int[]{A[i+1]-A[i],A[j]-A[j-1]};
            }
            else if (A[j]-A[i] > B)
                i++;
            else
                j++;
        }
        return new int[]{-1};
    }
}
