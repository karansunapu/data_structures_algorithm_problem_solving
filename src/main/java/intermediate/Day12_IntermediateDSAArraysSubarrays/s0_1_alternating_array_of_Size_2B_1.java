package intermediate.Day12_IntermediateDSAArraysSubarrays;

import java.util.ArrayList;
import java.util.Arrays;

public class s0_1_alternating_array_of_Size_2B_1 {
    public static void main(String[] args) {
        int[] A = {0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1 };
        int B = 2;
//        System.out.println(Arrays.toString(solve(A, B)));
        System.out.println(Arrays.toString(solve_hint(A, B)));
    }

    public static int[] solve_hint(int[] A, int B) {
        ArrayList < Integer > l1 = new ArrayList < > ();
        int n = A.length;
        int len = 2 * B + 1;
        for (int i = 0; i < n - len + 1; i++) {
            int curr = -1;
            int flag = 1;
            for (int j = i; j < i + len; j++) {
                if (A[j] == curr) {
                    flag = 0;
                    break;
                }
                curr = A[j];
            }
            if (flag == 1) {
                l1.add(i + B);
            }
        }
        int[] ret = new int[l1.size()];
        for (int i = 0; i < l1.size(); i++) {
            ret[i] = l1.get(i);
        }
        return ret;
    }

    public static int[] solve(int[] A, int B) {

        // LEARN
        // How to toggle 1 & 0 ...can do with N XOR 1

        int len = A.length;
        ArrayList<Integer> ans_arr = new ArrayList<>();

        for(int i=B; i<len-B; i++) {
            int req = 1 - A[i];
            int forward_count = 1;
            boolean valid_subarray = true;
            while(forward_count <= B) {

                //Spread ur wings left and right to check if leftRight are ( req ones(0->1 & 1->0) and equal)
                if (A[i+forward_count] != req ||  A[i-forward_count] != req) {
                    valid_subarray = false;
                    break;
                }
                forward_count++;
                req = 1 - req;
            }
            if (valid_subarray)
                ans_arr.add(i);
        }

        return ans_arr.stream().filter(i -> i != null).mapToInt(i -> i).toArray();
    }
}
