package intermediate.Bit_Manipulations_2;

public class Subarrays_with_Bitwise_OR_1 {
    public static void main(String[] args) {
        int A = 77;
        int[] B = {0, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1,
                0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1,
                0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1,
                0, 1, 1, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1,
                1, 1, 0, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0};
//        int[] B = {0, 1, 0, 0, 0, 1};
        System.out.println(solve(A, B));
    }

    public long solve_scalar_hint(int A, int[] B) {
        int last=0;
        long ans=0;
        for(int i=0;i<A;i++){
            if(B[i]==1)last=i+1;
            ans += last;
        }
        return ans;
    }

    public static long solve(int A, int[] B) {
        long total_subArr_count = ((long) (B.length) * (B.length+1) /2);
        int count_0 =0;
        for(int num : B) {
            if (num == 1 && count_0==0){
                continue;
            }
            else if (num ==1 && count_0>0) {
                total_subArr_count -= ((long) (count_0) *(count_0+1) / 2);
                count_0=0;
            }
            else {
                count_0++;
            }
        }
        if (count_0 > 0)
            total_subArr_count -= ((long) (count_0) *(count_0+1) / 2);
        return total_subArr_count;
    }

}
