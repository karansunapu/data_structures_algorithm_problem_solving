package intermediate_1_fresh.Arrays_Carry_forward;

public class Closest_MinMax {
    public static void main(String[] args) {
        int[] A = {7,2,1,6,7,1,3,4,1};
        System.out.println(solve(A));
    }

    public static int solve(int[] A) {
        int min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;

        for (int i: A){
            min = Math.min(i, min);
            max = Math.max(i, max);
        }

        if (min == max) return 1;    // same elememt so shortest ->1

        // to remember where was last min/max found
        int near_min=-1, near_max=-1, ans=A.length+2;

        for (int i=A.length-1; i>=0; i--){

            if (A[i] == min){
                near_min = i;

                if (near_max != -1)
                    ans = Math.min(ans, near_max-near_min+1);
            } else if (A[i] == max){
                near_max = i;

                if (near_min != -1)
                    ans = Math.min(ans, near_min-near_max+1);
            }
        }
        return ans;
    }
}
