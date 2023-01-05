package advanced.sorting_1;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_with_consecutive_elements {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(3, 2, 1, 4, 5));
        System.out.println(solve(A));
    }

    public static int solve(ArrayList<Integer> A) {

        int max=Integer.MIN_VALUE, min=Integer.MAX_VALUE, sum=0;

        for (int num : A){
            min = Math.min(min, num);
            max = Math.max(max, num);
            sum += num;
        }

        if (max-min+1 != A.size())
            return 0;

        if (rangeSum(max) - rangeSum(min-1) != sum)
            return 0;

        return 1;
    }

    static int rangeSum(int n){
        return (n*(n+1)/2);
    }
}
