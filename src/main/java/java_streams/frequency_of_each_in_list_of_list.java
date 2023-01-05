package java_streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class frequency_of_each_in_list_of_list {
    public static class Example {
        private List<Integer> ids;

        public Example(List<Integer> ids) {this.ids = ids;}

        public List<Integer> getIds() {return this.ids;}
    }

    public static void main(String[] args) {
        List<Example> examples = Arrays.asList(
                new Example(Arrays.asList(1,2, 2, 4, 5, 4)),
                new Example(Arrays.asList(7, 9, 9, 10, 11, 11))
        );

        Map<Integer, Long> freqOneList = examples.get(0).getIds().stream()
                                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(freqOneList);

        Map<Integer, Long> freqAllList = examples.stream()
//                                        .map(Example::getIds)
//                                        .flatMap(List::stream)
                        // either above -- OR -- below
                                        .flatMap(example -> example.getIds().stream())
                                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(freqAllList);

        List<Map<Integer, Long>> freqSeperateList = examples.stream()
                        .map(example -> example.getIds().stream()
                                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())))
                                .collect(Collectors.toList());
        System.out.println(freqSeperateList);

//        System.out.println(examples.get(0).getIds().stream().max(Collectors.groupingBy(Function.identity(), Collectors.counting())));



        /*
        counting() {
            return reducing(0L, e -> 1L, Long::sum);
        }
         to change it to integer just do Collectors.reducing(0, e -> 1, Integer::sum);
         */


    }
}
