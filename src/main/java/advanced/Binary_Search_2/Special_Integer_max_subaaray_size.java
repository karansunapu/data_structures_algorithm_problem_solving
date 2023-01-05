package advanced.Binary_Search_2;

import java.util.ArrayList;
import java.util.Arrays;

public class Special_Integer_max_subaaray_size {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int B = 10;
        System.out.println(solve(A, B));
    }

    public static int solve(ArrayList<Integer> A, int B) {
        int ans =0;                             //if none then return 0
        int left=1, right=A.size();             //search space... check for size 1,2,3,4...A.size()..

        // O(log.N)
        while (left <= right){
            int mid = (left+right)/2;

            if ( slidingWindow(A, mid, B)){
                ans = mid;
                left = mid + 1;
            } else {
                right = mid-1;
            }
        }

        return ans;
    }

    // O(N)
    static boolean slidingWindow(ArrayList<Integer> A, int windowSize, int B){
        int sum =0;

        for (int i=0; i<windowSize; i++)
            sum += A.get(i);
        if (sum > B)
            return false;

        int i=1, j=windowSize;
        while (j< A.size()){
            sum = sum + A.get(j) - A.get(i-1);
            i++;j++;
            if (sum > B)
                return false;
        }

        return true;
    }
}
