package advanced.Hashing_1;

import java.util.Arrays;
import java.util.HashSet;

public class Longest_Consecutive_Sequence {
    public static void main(String[] args) {
        int[] A = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(A));
    }

    public static int longestConsecutive(final int[] A) {
        HashSet<Integer> hset = new HashSet<>();
        int ans=1, chain=0, next=0;
        for (int n : A)
            hset.add(n);
        for (int n : hset){
            if (hset.contains(n-1))
                continue;
            else {
                chain=1; next=n+1;
                while (hset.contains(next)){
                    chain++; next++;
                }
            }
            ans = Math.max(ans, chain);
        }
        return ans;
    }

    public static int sort_longestConsecutive(final int[] A) {
        // USING SORTING
        Arrays.sort(A);
        int chain=1, ans=1;
        for (int i=1; i<A.length; i++){
            if (A[i] == A[i-1])
                continue;               // non - distinct elements
            if (A[i] - A[i-1] == 1)
                chain++;
            else {
                ans = Math.max(ans, chain);
                chain=1;
            }
        }
        ans = Math.max(ans, chain);
        return ans;
    }
}
