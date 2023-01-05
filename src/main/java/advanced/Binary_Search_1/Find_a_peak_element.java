package advanced.Binary_Search_1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Find_a_peak_element {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 1000000000, 1000000000));
        System.out.println(solve(A));
    }

    public static int solve(ArrayList<Integer> A) {
        // Base cases/ Edge cases
        if (A.get(0) > A.get(1))
            return 0;
        if (A.get(A.size()-1) > A.get(A.size()-2))
            return A.size()-1;

        //initialize search space
        int left = 1;
        int right = A.size()-2;

        while (left <= right){

            int mid= (left+right)/2;

            if (A.get(mid) >= A.get(mid-1) && A.get(mid) >= A.get(mid+1))
                return mid;
            else if (A.get(mid) >= A.get(mid-1))
                left = mid+1;
            else
                right = mid-1;
        }

        return -1;
    }
}

