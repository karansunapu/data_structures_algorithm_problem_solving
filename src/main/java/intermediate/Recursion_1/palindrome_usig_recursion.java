package intermediate.Recursion_1;

public class palindrome_usig_recursion {
    public static void main(String[] args) {
        String str = "MALAYALAM";
        System.out.println(rec(str, 0, str.length()-1));
    }

    public static String rec(String str, int start, int end){

        if (start>=end)
            return "YES";
        if (str.charAt(start) != str.charAt(end))
            return "NO";
        else
            return rec(str, start+1, end-1);

    }
}
