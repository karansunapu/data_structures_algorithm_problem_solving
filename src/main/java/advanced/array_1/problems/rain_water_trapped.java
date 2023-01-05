package advanced.array_1.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class rain_water_trapped {
    public static void main(String[] args) {
        List<Integer> A = new ArrayList<>(Arrays.asList(4, 2, 5, 7, 4, 2, 3, 6, 8, 2, 3));
        System.out.println(trap_1_extra_space_rmax_or_lmax(A));
    }

    public static int trap_1_extra_space_rmax_or_lmax(final List<Integer> A) {
        int n = A.size();
        int left_max = Integer.MIN_VALUE;
        int[] right_max = new int[n];
        right_max[n-1] = A.get(n-1);

        for(int i=n-2; i>=0; i--){
            right_max[i] = Math.max(right_max[i+1], A.get(i));
        }

        int sum=0;
        for (int i=0; i<n; i++){
            left_max = Math.max(left_max, A.get(i));
            int contribution = Math.min(left_max, right_max[i]) - A.get(i);
            sum += contribution;
//            System.out.print(contribution + " ");
        }

//        System.out.println();
        return sum;
    }


    public static int trap_2_extra_space_lmax_rmax_array(final List<Integer> A) {
        int n = A.size();
        int[] left_max = new int[n];
        left_max[0] = A.get(0);
        int[] right_max = new int[n];
        right_max[n-1] = A.get(n-1);

        for(int i=1; i<n; i++){
            left_max[i] = Math.max(left_max[i-1], A.get(i));
            right_max[n-1 -i] = Math.max(right_max[n-1 -i +1], A.get(n-1 -i));
        }

//        System.out.println(Arrays.toString(left_max));
//        System.out.println(Arrays.toString(right_max));

        int sum=0;
        for (int i=0; i<n; i++){
            int contribution = Math.min(left_max[i], right_max[i]) - A.get(i);
            sum += contribution;
//            System.out.print(contribution + " ");
        }

//        System.out.println();
        return sum;
    }
}
