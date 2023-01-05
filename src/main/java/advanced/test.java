package advanced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class test {
    public static void main(String[] args) {

        int[] A = {1, 2, 2, 3, 3, 44, 3};

        ArrayList<Integer> arrlist = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 3, 44, 3));

        int[] a = arrlist.stream().mapToInt(i -> i).toArray();
        System.out.println(Arrays.toString(a));


//        Set<Integer> arrSet =  Arrays.stream(A).boxed().sorted().collect(Collectors.toSet());
//
//        ArrayList<Integer> arrlist = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 3, 44, 3));
//
//        Set<Integer> set = arrlist.stream().sorted().collect(Collectors.toSet());
//
//        System.out.println(set);
//        System.out.println(arrSet);
    }
}
