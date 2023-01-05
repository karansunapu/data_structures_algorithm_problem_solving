package intermediate;

public class subarrayWithAtleastOneMaxAndMin {
    public static void main(String[] args) {
        int[] A = {7, 2, 1, 6, 7, 1, 3, 4, 1} ;
//        System.out.println(solveNaive(A));
        System.out.println(solve(A));
    }


    public static int solve(int[] A) {

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int n =A.length;

        for(int i:A) {
            min = Math.min(min, i);
            max = Math.max(max, i);
        }

        if(max == min)    // same element
            return 1;

        int closest_min = -1, closest_max = -1, ans=n+2;

        for(int i=n-1; i>=0; i--) {
            if(A[i] == min ) {
                closest_min = i;

                // if max is found already
                if(closest_max != -1){
                    ans = Math.min(ans, Math.abs(closest_min - closest_max) +1);
                }
            } else if(A[i] == max ) {
                closest_max = i;

                // if min is found already
                if(closest_min != -1){
                    ans = Math.min(ans, Math.abs(closest_max - closest_min) +1);
                }
            }
        }
        return ans;
    }





    public static int solveNaive(int[] A) {
        // WROKS ONLY IF THERE ARE SINGLE OCCURFENCES OF MAX AND MIN...cz DOESNOT CONSIDERS MULTIPLE RANGES
        int min_index=0, max_index=0;

        for(int i=0; i<A.length; i++) {
            if(A[i] < A[min_index])
                min_index = i;

            if(A[i] > A[max_index])
                max_index = i;
        }

        return Math.abs(max_index-min_index) +1;
    }
}
