package advanced.sorting_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class merge_2_sorted_arrays {

    public static void main(String[] args) {
        int[] a = {2, 3, 7, 12, 20, 24, 29};
        int[] b = {6, 9, 10, 14, 15};

        System.out.println(Arrays.toString(solve(a, b)));
    }

    static int[] solve(int[] a, int[] b){
        ArrayList<Integer> c = new ArrayList<>();
        int ap=0, bp=0, cp=0;

        while (ap< a.length && bp< b.length){
            c.add(cp++, a[ap] < b[bp] ? a[ap++] : b[bp++]);
        }

        while (ap < a.length)
            c.add(cp++, a[ap++]);

        while (bp < b.length)
            c.add(cp++, b[bp++]);

        return c.stream().mapToInt(i -> i).toArray();
    }
}
