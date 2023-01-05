package intermediate.Recursion_2;

public class Kth_Symbol_TLE {
    public static void main(String[] args) {
//        System.out.println(createSring("0110"));
        System.out.println(solve(4, 5));
    }

    public static int solve(int A, int B) {
        String finalString = "0";
        while(A>0){
            finalString = createSring(finalString);
            System.out.println(finalString);
            A--;
        }
        return finalString.charAt(B -1) - '0';
    }

    public static String createSring(String str){
        //base condn
        if(str.length() ==1){
//            return str.equals("0")?"01":"10";
            if (str.equals("0"))
                return "01";
            else
                return "10";
        }

        String replacement = str.charAt(0)=='0'?"01":"10";
        // rec function
        return  replacement + createSring(str.substring(1));
    }
}
