package intermediate;

public class equilibriumArray {

    public static void main(String[] args) {

        int[] A = {1, -7, 1, 5, 2, -4, 3, 0};
        System.out.println(solve(A));
    }

    public static int solve(int[] A) {

        int n = A.length, rsum=0, lsum=0;

        for(int i=0; i<n; i++){
            rsum += A[i];  // O(n)
        }

        if(rsum - A[0] == 0) return 0;  // edge case for index 1

        rsum = rsum - A[0];    // cz we are starting from index 1

        for(int i=1; i<n; i++){    // start from index 1   --> O(n)
            lsum = lsum + A[i-1];
            rsum = rsum - A[i];
            if(rsum == lsum)
                return i;
        }

        return -1;
    }
}
