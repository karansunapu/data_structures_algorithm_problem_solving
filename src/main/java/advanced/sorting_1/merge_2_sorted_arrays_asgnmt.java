package advanced.sorting_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class merge_2_sorted_arrays_asgnmt {
    public static void main(String[] args) {
        final List<Integer> A = new ArrayList<>(Arrays.asList(4, 7, 9 ));
        final List<Integer> B = new ArrayList<>(Arrays.asList(2, 11, 19));

        System.out.println(solve(A, B));
    }

    public static ArrayList<Integer> solve(final List<Integer> A, final List<Integer> B) {
        ArrayList<Integer> ans = new ArrayList<>();
        int p1=0, p2=0, p3=0;

        while (p1 < A.size() && p2 < B.size()){
            if (A.get(p1) < B.get(p2))
                ans.add(p3++, A.get(p1++));
            else
                ans.add(p3++, B.get(p2++));
        }

        while (p1 < A.size())
            ans.add(p3++, A.get(p1++));

        while (p2< B.size())
            ans.add(p3++, B.get(p2++));

        return ans;
    }
}
