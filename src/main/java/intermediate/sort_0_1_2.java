package intermediate;//        Input: nums = [2,0,2,1,1,0]
//        Output: [0,0,1,1,2,2]

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class sort_0_1_2 {

    public static void main(String[] args) {

    String str = "(((()())()()()()";

    int open_count = 0;
    int close_count = 0;

    for(char c : str.toCharArray()){
       if (c == '(')
           open_count++;
       else
           close_count++;
    }

        System.out.println(Math.abs(open_count-close_count));

    }
}
