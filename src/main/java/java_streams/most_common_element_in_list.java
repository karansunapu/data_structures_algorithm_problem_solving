package java_streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class most_common_element_in_list {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1,3,4,3,4,3,2,3,3,3,3,3));

        int maxOccured = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();

        System.out.println(maxOccured);

    }
}
