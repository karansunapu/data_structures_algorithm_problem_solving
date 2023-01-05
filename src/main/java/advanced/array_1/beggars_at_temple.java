package advanced.array_1;

import java.net.Inet4Address;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class beggars_at_temple {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>(){{
            put(1,2);
            put(2,1);
            put(4,2);
        }};

        int size = 7;
        System.out.println(Arrays.toString(solve(hm, size)));
    }

    static int[] solve(HashMap<Integer, Integer> hm, int size){
        int[] arr = new int[size];
        for (Map.Entry<Integer,Integer> entry : hm.entrySet()){
            arr[entry.getKey()] += entry.getValue();
        }

//        int sum_to_put =0;
//        for(int i=0; i< size; i++){
//            if (arr[i] != 0)
//                sum_to_put += arr[i];
//
//            arr[i] = sum_to_put;
//        }
//                  OR

        for(int i=1; i< size; i++){
            arr[i] += arr[i-1];
        }

        return arr;
    }

    static int[] solve_hm_extra_space(HashMap hm, int size){
        int[] arr = new int[size];
        int sum_to_put =0;

        for(int i=0; i< size; i++){
            if (hm.containsKey(i))
                sum_to_put += (int)hm.get(i);

            arr[i] = sum_to_put;
        }

        return arr;
    }
}
