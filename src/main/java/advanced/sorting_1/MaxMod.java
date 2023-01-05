package advanced.sorting_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MaxMod {
    public static void main(String[] args) {
        ArrayList<Integer> arrlist = new ArrayList<>(Arrays.asList(1, 2, 44, 3));
//        System.out.println(solve(arrlist));
        System.out.println(solveBySort(arrlist));
    }

    public static int solve(ArrayList<Integer> A) {
        int maxMod = Integer.MIN_VALUE;

        for (int i=0; i<A.size(); i++){
            if (A.get(i)==0) continue;
            for (int j=i; j<A.size(); j++){
                if (A.get(j) ==0) continue;
                maxMod = Math.max(maxMod, Math.max(A.get(i)%A.get(j),A.get(j)%A.get(i)));
            }
        }

        return maxMod;
    }

    public static int solveBySort(ArrayList<Integer> A) {
        A.sort(Comparator.naturalOrder());
        int size = A.size();
        int i= size-2;
        while (A.get(i) == A.get(size-1))
            i--;

        return A.get(i) % A.get(A.size()-1);
    }


}
