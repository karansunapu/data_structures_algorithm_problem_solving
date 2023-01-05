package java_streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class print_map_string_list_of_student {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Math", "John", "Smith", "Miami", 19),
                new Student("Programming", "Mike", "Miles", "New York", 21),
                new Student("Math", "Michael", "Peterson", "New York", 20),
                new Student("Math", "James", "Robertson", "Miami", 20),
                new Student("Programming", "Kyle", "Miller", "Miami", 20)
        );

        Map<String, List<Student>> map = students.stream().collect(Collectors.groupingBy(Student::getSubject));


        map.entrySet().stream().forEach( entry -> {
            System.out.println(
                    entry.getKey() + " - " +
                            entry.getValue().stream().map(Student::toString).collect(Collectors.joining("----"))
            );
        });
    }
}
