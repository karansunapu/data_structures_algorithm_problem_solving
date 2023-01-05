package advanced.Binary_Search_2;

public class Ath_Magical_Number {
    public static void main(String[] args) {
        int A=807414236, B=3788, C=38141;
        System.out.println(solve(A, B, C));
    }

    public static int solve(int A, int B, int C) {
        long left = Math.min(B, C);
        long right = (long) Math.min(B, C) *A;
        long ans = Math.min(B, C);
        long gcd = findGCD(B, C);

        while (left <= right){
            long mid= (left+right)/2;
            long numOfMul = numOfMultiplesInRange(mid, B, C, gcd);

            if (numOfMul >= A){
                ans = mid;
                right = mid-1;
            } else {
                left = mid+1;
            }
        }

        return (int)(ans % (1000 * 1000 * 1000 + 7));
    }

    static long numOfMultiplesInRange(long range, int b, int c, long gcd){
        long lcm = (long) b *c/gcd;
        return ( range/b + range/c - range/lcm);
    }

    static int findGCD(int x, int y) {
        if (x == 0)
            return y;
        return findGCD(y % x, x);
    }
}
