package intermediate_1_fresh.Arrays_Interview_Problems;

public class Christmas_Trees {
    public static void main(String[] args) {
       int[] A = {1, 6, 4, 2, 6, 9};
       int[] B = {2, 5, 7, 3, 2, 7};
        System.out.println(solve(A, B));
    }

    public static int solve(int[] A, int[] B) {
        int min_sum=Integer.MAX_VALUE, n=A.length, sum=0;

        for (int i=0; i<n-3; i++){
            for (int j=i+1; j<n-2; j++){
                if (A[i] < A[j]){
                    for (int k=j+1; k<n; k++){
                        if (A[j] < A[k]){
                         min_sum = Math.min(min_sum, B[i] + B[j] + B[k]);
                        }
                    }
                }
            }
        }
        return min_sum;
    }
}
