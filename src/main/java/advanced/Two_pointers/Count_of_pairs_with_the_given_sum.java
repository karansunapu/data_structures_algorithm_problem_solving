package advanced.Two_pointers;

public class Count_of_pairs_with_the_given_sum {
    public static void main(String[] args) {
        int[] A = {5, 10, 20, 100, 105};
        int B = 8;
        System.out.println(solve(A, B));
    }

    public  static int solve(int[] A, int B) {
        int i=0, j=A.length-1, count=0;
        while (i<j){
            if (A[i] + A[j] == B){
                count++;
                i++; j--;
            } else if (A[i] + A[j] > B)
                j--;
            else
                i++;
        }
        return count;
    }

}
