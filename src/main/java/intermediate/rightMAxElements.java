package intermediate;

import java.util.ArrayList;
import java.util.Arrays;

public class rightMAxElements {
    public static void main(String[] args) {
        int[] A = {16, 17, 4, 3, 5, 2};
        System.out.println(Arrays.toString(solve(A)));
    }

    public static int[] solve(int[] A) {

        ArrayList<Integer> ans = new ArrayList<>();
        int max = Integer.MIN_VALUE;

        for(int i=A.length-1; i>=0; i--) {
            if(A[i] > max){
                max = A[i];
                ans.add(A[i]);
            }
        }

        return ans.stream().mapToInt(i -> i).toArray();

    }
}
