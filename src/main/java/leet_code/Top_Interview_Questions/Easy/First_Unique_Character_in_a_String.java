package leet_code.Top_Interview_Questions.Easy;

import java.util.Map;
import java.util.stream.Collectors;

public class First_Unique_Character_in_a_String {
    public static void main(String[] args) {
        String s= "loveleetcode";
        System.out.println(firstUniqChar(s));
    }

    public static int firstUniqChar(String s) {
        Map<Character, Long> map =
                s.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        for (int i=0; i<s.length(); i++){
            if (map.get(s.charAt(i))==1)
                return i;
        }
        return -1;
    }
}
