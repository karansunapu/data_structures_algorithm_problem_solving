package intermediate.Recursion_2;

public class Is_magic {
    public static void main(String[] args) {
        System.out.println(solve(83557));
    }

    public static int solve(int A) {

        if(A < 10){
            if(A == 1) return 1;
            else return 0;
        }

        return solve(sumOfDigits(A));
    }

    public static int sumOfDigits(int n){

        if (n == 0)
            return 0;

        return sumOfDigits(n/10) + n%10;
    }
}
