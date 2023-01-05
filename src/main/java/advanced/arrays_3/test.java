package advanced.arrays_3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class test {
    public static void main(String[] args) {
        String [] friends = new String [] {"C","A","B","D"};

//        Arrays.stream(friends).forEach(x -> System.out.print(x));
//        System.out.println();
//        Arrays.stream(friends).sorted().forEach(x -> System.out.print(x));


        // peek, Collections.reverseOrder(), Comparator.naturalOrder(), forEachOrdered ->
        Stream.of("C", "A", "B", "D")
                .peek(System.out::println)
//                .sorted(Comparator.naturalOrder())
                .sorted(Collections.reverseOrder())
                .forEachOrdered(System.out::println);

        // IntStream, boxed, ->
//        IntStream numbers = new Random().ints(10, 0, 20);
//        numbers.boxed()
//                .peek(n -> System.out.print(n+","))
//                .sorted()
//                .forEach(n -> System.out.print(n+"|"));
    }
}
