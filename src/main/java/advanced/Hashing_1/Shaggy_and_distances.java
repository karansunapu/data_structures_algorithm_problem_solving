package advanced.Hashing_1;

import java.util.HashMap;

public class Shaggy_and_distances {
    public static void main(String[] args) {
        int[] A ={7, 1, 3, 4, 1, 7};
        System.out.println(solve(A));
    }

    public static int solve(int[] A) {
        int ans = Integer.MAX_VALUE;
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for (int i=0; i<A.length; i++){
            int num= A[i];
            if (hmap.containsKey(num)){
                ans= Math.min(ans, i-hmap.get(num));
                hmap.put(num, i);
            } else
                hmap.put(num, i);
        }
        return ans == Integer.MAX_VALUE?-1:ans;
    }
}
