package intermediate.Arrays_Interview_Problems;

import java.util.Arrays;

public class maximum_size_subarray_of_only_positive_elements {
    public static void main(String[] args) {
//        int[] A = {8986143, -5026827, 5591744, 4058312, 2210051, 5680315, -5251946, -607433, 1633303, 2186575};

        int[] A = {3228190, -9480742, 6561058, -7230196, -7496083, -344509, 6018633, 2027438, 462522, -4992363};

//        int[] B = new int[3];
//
//        System.arraycopy(A, 2, B, 0,2);
//
//        System.out.println(Arrays.toString(B));

        System.out.println(Arrays.toString(solve(A)));
    }

    public static int[] solve(int[] A) {
        int n = A.length;
        int i, j;
        int index_solution_start = 0;
        int max_len = Integer.MIN_VALUE;

        // to set the i,j to last non-negative number
        while (n!=0 && A[n-1 ] < 0)
            n--;
        i = j = n-1;

        while(j>=0) {
            // if prev is not negative
            if (j!=0 && A[j-1]>=0) {
                j--;
            }
            else {

                if( (i-j+1) >= max_len){
                    max_len = (i-j+1);
                    index_solution_start = j;
                }


                while (j!=0 && A[j-1 ] < 0)
                    j--;
                j = j - 1;
                i=j;
            }
        }

//        System.out.println("For "+index_solution_start+" : " +max_len+ ": lmin="+i+ ",rmin="+ j);

        int[] B = new int[max_len];
        System.arraycopy(A, index_solution_start, B, 0,max_len);
        return B;
    }
}
