package intermediate_1_fresh.day_9_Introduction_to_Arrays;

import java.util.HashSet;

public class Good_Pair {
    public static void main(String[] args) {
        int[] A = {1,2,3,4,5};
        int B = 10;
        System.out.println(solve(A, B));
    }
    public static int solve(int[] A, int B) {
        HashSet<Integer> hashSet = new HashSet<>();

        for (int n: A){
            if (hashSet.contains(B - n))
                return 1;
            else
                hashSet.add(n);
        }
        return 0;
    }
}
