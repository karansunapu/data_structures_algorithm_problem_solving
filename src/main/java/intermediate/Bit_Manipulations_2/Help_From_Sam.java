package intermediate.Bit_Manipulations_2;

public class Help_From_Sam {
    public static void main(String[] args) {
        int A = 49;
        System.out.println(solve(A));
    }

    public static int solve(int A) {
        int count_of_help =0;
        while(A>0){
            if (A % 2 == 1)       // (A&1) > 0 -> check for odd
                count_of_help++;
            A = A /2;             // right shift towards lower significant bit -> divide by 2
        }

        return count_of_help;
    }
}
