package advanced.sorting_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Kth_Smallest_Element {
    public static void main(String[] args) {
        final List<Integer> A = Arrays.asList(2, 1, 4, 3, 2);
        int B = 3;
        System.out.println(kthsmallest(A, B));
    }

    public static int kthsmallest(final List<Integer> arrList, int B) {
        int swaps=0;
        List<Integer> A = new ArrayList<>(arrList);
        for (int i=0; i<B; i++){
            int min = A.get(i);
            int swap_pos = i;
            for (int j=i; j<A.size(); j++){
               if (A.get(j) < min){
                   min = A.get(j);
                   swap_pos = j;
               }
            }
            swap(A, i, swap_pos);
            System.out.println("SWAP : " + swaps++);
        }

        return A.get(B-1);
    }

    static void swap(final List<Integer> A, int i, int j){
        int temp = A.get(i);
        A.set(i, A.get(j));
        A.set(j, temp);
    }
}
