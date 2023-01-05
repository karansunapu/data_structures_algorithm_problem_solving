package java_streams;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class print_map_with_nested_map {
    public static void main(String[] args) {

        HashMap<String, Map<String, Integer>> resultMap = new HashMap<>();

        resultMap.put("webSite1", new HashMap<String, Integer>()
                                        {{
                                            put("randomWord",30);
                                            put("randomWord2",15);
                                            put("randomWord3",0);
                                        }});
        resultMap.put("webSite2", new HashMap<String, Integer>()
                                        {{
                                            put("randomWord",9);
                                            put("randomWord2",8);
                                            put("randomWord3",1);
                                        }});

        System.out.println(resultMap.entrySet().stream()
                .flatMap(entry -> entry.getValue().entrySet().stream())
                .map(e -> e.getKey() + "=" + e.getValue())
                .collect(Collectors.joining(",")));

        System.out.println(resultMap.entrySet().stream()
                .map(entry -> entry.getKey() + "=  " + entry.getValue().entrySet().stream().map(e -> e.getKey() + ":" + e.getValue()).collect(Collectors.joining(",")))
                .collect(Collectors.joining("\n")));




    }
}
