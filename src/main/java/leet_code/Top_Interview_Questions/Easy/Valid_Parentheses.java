package leet_code.Top_Interview_Questions.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Valid_Parentheses {
    public static void main(String[] args) {
        String s = "[({{([]({})[])}})]";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        ArrayList<Character> arr = new ArrayList<Character>(
                s.chars().mapToObj(e -> (char)e).collect(Collectors.toCollection(ArrayList::new)));

        if (arr.size() == 1)
            return false;

        for (int i=0; i<arr.size(); i++){
            if (arr.get(0)==')' || arr.get(0)=='}' || arr.get(0)==']')
                return false;

            if (arr.get(i) == ')'){
                if (arr.get(i-1) == '('){
                    arr.remove(i);
                    arr.remove(i-1);
                    i= i - 2;
                } else
                    return false;
            } else if (arr.get(i) == '}'){
                if (arr.get(i-1) == '{'){
                    arr.remove(i);
                    arr.remove(i-1);
                    i= i - 2;
                } else
                    return false;
            } else if (arr.get(i) == ']'){
                if (arr.get(i-1) == '['){
                    arr.remove(i);
                    arr.remove(i-1);
                    i= i - 2;
                } else
                    return false;
            }
        }

        if (arr.size() == 0)
            return true;
        else
            return false;

    }
}
