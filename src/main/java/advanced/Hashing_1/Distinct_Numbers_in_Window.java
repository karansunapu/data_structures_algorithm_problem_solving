package advanced.Hashing_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Distinct_Numbers_in_Window {
    public static void main(String[] args) {
        int[] A= {1, 2, 1, 3, 4, 3};
        int B= 3;
        System.out.println(Arrays.toString(dNums(A, B)));
    }

    public static int[] dNums(int[] A, int B) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for (int i=0; i<B; i++){
            hmap.put(A[i], hmap.getOrDefault(A[i], 0) +1);
        }
        ans.add(hmap.size());
        for (int i=0,j=B; j<A.length; i++,j++){
            if (hmap.get(A[i]) == 1)
                hmap.remove(A[i]);
            else
                hmap.put(A[i], hmap.get(A[i]) -1);

            hmap.put(A[j], hmap.getOrDefault(A[j], 0) +1);

            ans.add(hmap.size());
        }

        return ans.stream().mapToInt(i -> i).toArray();
    }
}
