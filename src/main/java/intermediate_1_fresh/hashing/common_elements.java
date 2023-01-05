package intermediate_1_fresh.hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class common_elements {
    public static void main(String[] args) {
        int[] A = {1, 2, 2, 1};
        int[] B = {2, 3, 1, 2};
        Map<Integer, Long> freq = Arrays.stream(A).boxed().
                collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()));
        System.out.println(freq.values());
//        System.out.println(Arrays.toString(solve(A, B)));
    }

    public static int[] solve_2(int[] A, int[] B) {
        HashMap<Integer, Integer> a = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> b = new HashMap<Integer, Integer>();
        for(int x: A){
            a.put(x, a.getOrDefault(x, 0)+1);
        }
        for(int x: B){
            b.put(x, b.getOrDefault(x, 0)+1);
        }
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int k: a.keySet()){
            if(b.containsKey(k)){
                for(int i = 0; i < Math.min(a.get(k), b.get(k)); ++i){
                    ans.add(k);
                }
            }
        }
        return ans.stream().mapToInt(i -> i).toArray();
    }

    public static int[] solve(int[] A, int[] B) {
        HashMap<Integer, Integer> a_map = new HashMap<>();
        HashMap<Integer, Integer> b_map = new HashMap<>();

        for (int n : A) {
            if (a_map.containsKey(n))
                a_map.put(n, a_map.get(n) + 1);
            else
                a_map.put(n, 1);
        }

        for (int n : B){
            if (b_map.containsKey(n))
                b_map.put(n, b_map.get(n)+1);
            else
                b_map.put(n, 1);
        }

        int count=0;
        for (int a_key : a_map.keySet()){
            if (b_map.containsKey(a_key)){
                int min = Math.min(a_map.get(a_key), b_map.get(a_key));
                count += min;
                a_map.put(a_key, min);
            } else {
                a_map.put(a_key, 0);
            }
        }
        int[] ans = new int[count];
        int[] i= {0};
        a_map.entrySet().stream().forEach(integerIntegerEntry -> {

            int freq = integerIntegerEntry.getValue();
            while (freq-- > 0){
                ans[ i[0]++ ] = integerIntegerEntry.getKey();
            }
        });

        return ans;
    }
}
