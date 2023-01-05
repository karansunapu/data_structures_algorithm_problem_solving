package intermediate;

import java.util.Arrays;

public class secondHighestInArray {
    public static void main(String[] args) {

        int[] A = {2, 1, 3, 2, 5};
        System.out.println(solve(A));


    }

    public static int solve(int[] A) {

        int length = A.length;
        int highest,second_highest;

        if(length == 1)
            return -1;
        else if(length == 2)
            return A[1];
        else {
            highest = Integer.max(A[0], A[1]);
            second_highest = Integer.min(A[0], A[1]);
            for(int i=2; i<length; i++){
                if(A[i] <= highest) {
                    if (A[i] > second_highest)
                        second_highest = A[i];
                }else {
                    second_highest = highest;
                    highest = A[i];
                }
            }
        }

        return second_highest;
    }
}
