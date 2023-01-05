package intermediate;

public class specialSubsequencesAG {
    public static void main(String[] args) {
        String str = "ABCGAG";
        System.out.println(solve(str));

    }

    public static int solve(String A) {

        int prev_g_count = 0;
        int sequences = 0;
        for (int i=A.length()-1; i>=0; i--) {
            if(A.charAt(i) == 'G')
                prev_g_count++;
            else if(A.charAt(i) == 'A')
                sequences += prev_g_count;
        }

        return sequences;

    }
}
