package leet_code.Easy;

public class Make_The_String_Great {
    public static void main(String[] args) {
        String s = "DabBAcCE";
//        System.out.println(Math.abs('a' - 'A'));
        System.out.println(makeGood(s));
    }

    public static String makeGood(String s) {
        int i=0;
        while (i < s.length()-1){
            if (s.length()==0)
                return s;
            if (Math.abs(s.charAt(i) - s.charAt(i+1)) == 32){
                s = s.substring(0, i) + s.substring(i+2);
                i=0;
                continue;
            }
            i++;
        }
        return s;
    }
}
