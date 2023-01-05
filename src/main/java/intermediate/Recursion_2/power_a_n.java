package intermediate.Recursion_2;

public class power_a_n {
    public static void main(String[] args) {
        int a = 2;
        int n = 3;
        System.out.println(solve(a, n));
    }

    public static int solve(int a, int n) {

        if(n == 1)              // Base conditon
            return a;

        return solve(a, n-1) * a;    // rec function
    }
}
