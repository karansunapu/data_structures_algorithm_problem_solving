package advanced.Two_pointers;

import java.util.Arrays;

public class Pairs_with_Given_Difference {
    public static void main(String[] args) {
        int[] A = { 1, 8, 2, 8, 8, 8, 8, 4, 4, 6, 10, 10, 9, 2, 9, 3, 7 };
        int B = 1;
        System.out.println(solve(A, B));
    }

    public static int solve(int[] A, int B) {
        Arrays.sort(A);
//        System.out.println(Arrays.toString(A));
        int count=0, a=0, b=1;
        while (a<b && b<A.length){
            if (A[b]-A[a] == B){
                // System.out.println(A[b]+","+A[a]);
                count++;
                b++;
                a++;
                while (b<A.length && A[b]==A[b-1])           // for distinct elements
                    b++;
                while (a>0 && a<A.length && A[a]==A[a-1])       // a>0
                    a++;
            }
            else if (A[b]-A[a] > B){
                a++;
                if (a==b)               // only i increases and can go >= b ...
                    b++;
            }
            else
                b++;
        }
        return count;
    }
}
