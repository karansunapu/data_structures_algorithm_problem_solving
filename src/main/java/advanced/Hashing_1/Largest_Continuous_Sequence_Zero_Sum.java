package advanced.Hashing_1;

import java.util.Arrays;
import java.util.HashMap;

public class Largest_Continuous_Sequence_Zero_Sum {
    public static void main(String[] args) {
        int[] A ={1,2,-2,4,-4};
        System.out.println(Arrays.toString(lszero(A)));
    }

    public static int[] lszero(int[] A) {
        int start=0, len=0, pf=0;
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for (int i=0; i<A.length; i++){
            pf += A[i];
            if (pf == 0 && len<i+1){
                start=0; len=i+1;
            } else if (hmap.containsKey(pf)){
                int dis = i - hmap.get(pf);
                if (len < dis){
                    start = hmap.get(pf)+1;
                    len = dis;
                }
            } else {
                hmap.put(pf, i);
            }
        }
        System.out.println(start + ":" + len);
//        return new int[]{0,0};
        return Arrays.copyOfRange(A, start, start+len);
    }
}
