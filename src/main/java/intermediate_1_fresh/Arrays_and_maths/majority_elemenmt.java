package intermediate_1_fresh.Arrays_and_maths;

import java.util.Arrays;

public class majority_elemenmt {
    public static void main(String[] args) {
        int[] A = {2, 1, 2, 2, 4, 2, 4, 2};
        System.out.println(majorityElement(A));
    }

    public static int majorityElement(final int[] A) {
        int maj=-1, freq=0;
        for (int n: A){
            if (maj == -1){
                maj= n;
                freq= 1;
            } else if (maj == n ){
                freq++;
            } else {
                freq--;
                if (freq == 0)
                    maj= -1;
            }
        }
        final int majority = maj;

        int count_maj = (int) Arrays.stream(A).filter(x -> x==majority).count();

        if (count_maj >= Math.floorDiv(A.length, 2))
            return majority;

        return -1;
        }
}
