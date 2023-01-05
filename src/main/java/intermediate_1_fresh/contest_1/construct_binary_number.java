package intermediate_1_fresh.contest_1;

public class construct_binary_number {
    public static void main(String[] args) {
        int A=3, B=2;
        System.out.println(solve(A, B));
    }

    public static int solve(int A, int B) {
        int sum=0, product= (int) Math.pow(2, B);
        for (int i=0; i<A; i++){
            sum += product;
            product = product*2;
        }
        return sum;
    }
}
