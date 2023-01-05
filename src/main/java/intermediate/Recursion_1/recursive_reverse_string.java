package intermediate.Recursion_1;

import java.util.Scanner;

public class recursive_reverse_string {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        recReverse(str);
    }

    public static void recReverse(String str){

        // BAse cond
        if (str.length() == 0) return;

        // Rec func
        System.out.print(str.charAt(str.length()-1));
        recReverse(str.substring(0, str.length()-1));
    }
}
