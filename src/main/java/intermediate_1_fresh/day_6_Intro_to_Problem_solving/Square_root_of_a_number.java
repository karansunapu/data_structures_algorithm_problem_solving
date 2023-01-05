package intermediate_1_fresh.day_6_Intro_to_Problem_solving;

public class Square_root_of_a_number {
    public static void main(String[] args) {
        int A =25;
        System.out.println(solve(A));
    }

    public static int solve(int A) {
        for (int i=1; i*i<=A; i++){
            if (i*i == A)
                return i;
        }
        return -1;
    }
}
