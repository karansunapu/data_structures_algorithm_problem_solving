package advanced.sorting_2;

import java.util.Arrays;
import java.util.List;

public class sorted_2Arrays_ai_greaterThan_bj_ijPairs {
    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(3, 6, 8, 10, 15, 20, 30, 40);
        List<Integer> b = Arrays.asList(1, 2, 7, 12, 18);

        solve(a, b);
    }

    static void solve(List<Integer> a,List<Integer> b){
        int n = a.size();
        int m = b.size();
        int count =0, p2 =0;
        int totalCount =0;
        int iterations =0;

        for (int i=0; i<n; i++){
            System.out.println("Doing for a : " + a.get(i));
            for (int j=p2; j<m; j++){
                iterations++;
                System.out.println("count = " + count + "..p2 = " + p2);
                if (a.get(i) > b.get(j)){
                    count++;
                    p2++;
                }
                else
                    break;
            }
            System.out.println("Adding to toatal_count : + " + count);
            totalCount += count;
        }

        System.out.println();
        System.out.println("totalCount = " + totalCount);
        System.out.println("iterations = " + iterations);





    }
}
