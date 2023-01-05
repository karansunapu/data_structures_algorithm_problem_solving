package intermediate_1_fresh.strings;

import java.util.Arrays;
import java.util.Locale;

public class to_lower {
    public static void main(String[] args) {
        char[] A = {'S', 'c', 'a', 'L', 'e', 'r', '#', '2', '0', '2', '0'};
        char[] B = {'S', 'c', 'a', 'l', 'e', 'r', '#', '2', '0', '2', '0'};
//        System.out.println(Arrays.toString(toLower(A)));
        System.out.println(isAlpha(B));
    }

    static char[] toLower(char[] A){
        System.out.println(new String(A).toLowerCase(Locale.ROOT));
        return new String(A).toLowerCase(Locale.ROOT).toCharArray();
    }

    static int isAlpha(char[] A){
        for (char ch : A){
            if ( (ch-0 >= 'A' && ch-0 <= 'Z') || (ch-0 >= 'a' && ch-0 <= 'z')
                    || (ch-0 >= '0' && ch-0 <= '9'))
                continue;
            else
                return 0;
        }
        return 1;
    }
}
