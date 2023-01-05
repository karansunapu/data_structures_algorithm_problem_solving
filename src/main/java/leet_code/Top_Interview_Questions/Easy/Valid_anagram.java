package leet_code.Top_Interview_Questions.Easy;

import java.util.Map;
import java.util.stream.Collectors;

public class Valid_anagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagsram";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Object, Long> smap = s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c-> c, Collectors.counting()));
        for (char ch : t.toCharArray()){
            if (smap.containsKey(ch)){
                if (smap.get(ch) == 1)
                    smap.remove(ch);
                else
                    smap.put(ch, smap.get(ch)-1);
            } else
                return false;
        }

        return smap.size()==0;
    }
}
