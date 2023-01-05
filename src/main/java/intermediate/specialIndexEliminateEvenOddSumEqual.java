package intermediate;

public class specialIndexEliminateEvenOddSumEqual {
    public static void main(String[] args) {

        int[] A = { 2, 3, 4, 5, 6, 13, 1, 2, 3, 4, 5, 6 };
        System.out.println(solve(A));
    }

    public static int solve(int[] A) {
        int count=0;
        int n = A.length, even_rsum=0, even_lsum=0, odd_rsum=0, odd_lsum=0;

        // to calculate the prefix sum ... we can use it as prefix right sum
        for(int i=0; i<n; i++){
            if(i%2 == 0)
                even_rsum += A[i];
            else
                odd_rsum += A[i];
        }

        for(int i=0; i<n; i++){    // start from index 1   --> O(n)
            // calculate the right sum ...
            if(i%2 == 0)
                even_rsum = even_rsum - A[i];
            else
                odd_rsum = odd_rsum - A[i];

            // check if leftSum = rightSum
            if(even_rsum + odd_lsum == odd_rsum + even_lsum)
                count++;

            // update the left sum ...
            if(i%2 == 0)
                even_lsum = even_lsum + A[i];
            else
                odd_lsum = odd_lsum + A[i];
        }

        if(count==0)
            return -1;
        else
            return count;

    }
}
