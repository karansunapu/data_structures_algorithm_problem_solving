package intermediate_1_fresh.sorting;

import java.util.Arrays;

public class sort_by_color {
    public static void main(String[] args) {
        int[] A = {0, 1, 2, 0, 1, 2, 0};
        System.out.println(Arrays.toString(sortColors(A)));
    }

    public static int[] sortColors(int[] A) {
        int count_0=0, count_1=0, count_2=0;
        for (int n : A){
            switch (n){
                case 0: count_0++;break;
                case 1: count_1++;break;
                case 2: count_2++;break;
            }
        }

        int i=0;
        while (count_0>0){
            A[i++] = 0;
            count_0--;
        }
        while (count_1>0){
            A[i++] = 1;
            count_1--;
        }
        while (count_2>0){
            A[i++] = 2;
            count_2--;
        }

        return A;
    }

    public static int[] sortColors_bubble(int[] A) {
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
