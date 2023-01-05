package intermediate_1_fresh.sorting;

import java.util.Arrays;

public class noble_integer {
    public static void main(String[] args) {
       int[] A = { -4, -2, 0, -1, -6 };
       A = sort(A);

       for (int i=0; i<A.length-1; i++){
           if (A[i] == A[i+1])
               continue;
           if (A[i] == A.length-1 -i)
               System.out.println(A[i]);
       }
//       System.out.println(Arrays.toString(A));
    }

     public static int[] sort(int[] A) {
         int n = A.length;
         for (int i=0; i<n; i++){
             for (int j=0; j<n-1-i; j++){
                 if (A[j] > A[j+1])
                     swap(A, j, j+1);
             }
         }
         return A;
     }

     static void swap(int[] A, int i, int j){
         int temp = A[i];
         A[i] = A[j];
         A[j] = temp;
     }
}
