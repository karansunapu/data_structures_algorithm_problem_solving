package advanced.Two_pointers;

public class Pairs_with_given_sum_II {
    public static void main(String[] args) {
//        int[] A = {1, 1, 1, 2, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] A = {2, 2, 3, 4, 4, 5, 6, 7, 10};
        int B = 8;
        System.out.println(solve(A, B));
    }

    public static int solve(int[] A, int B) {
        int i=0, j=A.length-1, count=0,  mod = 1000 * 1000 * 1000 + 7;;
        while (i<j){
            if (A[i] + A[j] == B){
                if (A[i] == A[j]) {
                    // equal A[i] and A[j]
                    long cnt = j - i + 1;
                    count += (cnt * (cnt - 1) / 2) % mod;
                    count %= mod;
                    break;
                } else {
                    int start=1, end=1;
                    while (i<j && A[i] == A[i+1]){
                        start++; i++;
                    }
                    while (i<j && A[j] == A[j-1]){
                        end++; j--;
                    }
                    count+= (start*end);
                    i++; j--;
                }
            } else if (A[i] + A[j] > B)
                j--;
            else
                i++;
        }
        return count;
    }
}
