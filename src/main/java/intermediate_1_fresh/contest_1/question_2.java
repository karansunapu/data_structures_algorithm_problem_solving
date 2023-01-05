package intermediate_1_fresh.contest_1;

public class question_2 {
    public static void main(String[] args) {
        int[] A = {1, 4, 2};
        int B = 3;
        System.out.println(solve(A, B));
    }
    public static int solve(int[] A, int B) {
        int count=0, is_present=0;
        for (int n : A){
            if (n > B)
                count++;
            if (n == B)
                is_present=1;
        }
        if (is_present==1)
            return count;
        else
            return -1;
    }
}
