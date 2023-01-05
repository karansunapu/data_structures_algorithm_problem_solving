package java_streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class list_of_lists_in_one_list {

    public static class Example {
        private List<Integer> ids;

        public Example(List<Integer> ids) {
            this.ids = ids;
        }

        public List<Integer> getIds() {
            return this.ids;
        }

    }

    public static void main(String[] args) {
        List<Example> examples = Arrays.asList(
                                    new Example(Arrays.asList(1,2, 2, 4, 5, 4)),
                                    new Example(Arrays.asList(7, 9, 9, 10, 11, 11))
                                );

        List<Integer> combinedExamples = examples.stream()
                                                .map(Example::getIds)
                                                .flatMap(List::stream)
                                                .collect(Collectors.toList());

        List<Long> countEachExamples = examples.stream()
                                        .map(example -> example.getIds().stream().count())
                                        .collect(Collectors.toList());


//        int count = examples.stream().collect(Collectors.reducing(0, e -> 1, Integer::sum));

        List<Integer> countEachExampleInteger = examples.stream()
                .map(example -> example.getIds().stream().map(e -> 1).reduce(0, Integer::sum))
                .collect(Collectors.toList());


        Map<Example, Integer> exampleCount = examples.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.reducing(0, e -> 1, Integer::sum)));

        Map<String, Integer> exampleToStrngWithCount = examples.stream()
                .collect(Collectors.groupingBy(Example::toString, Collectors.reducing(0, e -> 1, Integer::sum)));

        Map<String, Integer> exampleEachFrequency = examples.stream()
                .collect(Collectors.groupingBy(Example::toString, Collectors.reducing(0, e -> 1, Integer::sum)));

        System.out.println(combinedExamples);
        System.out.println(countEachExamples);
        System.out.println(countEachExampleInteger);
        System.out.println(exampleCount);
        System.out.println(exampleToStrngWithCount);
    }
}
