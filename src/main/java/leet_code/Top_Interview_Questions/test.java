package leet_code.Top_Interview_Questions;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class test {
    public static void main(String[] args) {
//        HashSet<int[]> set = new HashSet<int[]>(){{
//            add(new int[]{1, 1});
//        }};
//
//        set.add(new int[]{1, 1});
//

//        int i=9;
//        int k=10;
//        String s = i + "" + k;
//
//        int j=10;

        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.stream(arr).reduce(0, Integer::sum));
        System.out.println(Arrays.stream(arr).sum());

        List<Integer> arrList =Arrays.asList(1,2,3,4,5);
        System.out.println(arrList.stream().mapToInt(Integer::intValue).sum());
        System.out.println(arrList.stream().reduce(0, Integer::sum));
        System.out.println(arrList.stream().reduce(0, (a,b) -> a+b));
        System.out.println(arrList.stream().collect(Collectors.summarizingInt(Integer::intValue)));


    }
}
