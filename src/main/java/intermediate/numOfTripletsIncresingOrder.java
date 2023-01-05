package intermediate;

import java.util.Arrays;

public class numOfTripletsIncresingOrder {
    public static void main(String[] args) {
        int[] arr = {2, 6, 9, 4, 10};

        System.out.println(solve(arr));
    }

    public static int solve(int[] arr) {

        // Make the prefix array
        int n = arr.length;
        int[] pf = new int[n];
        for(int i=n-2; i>=0; i--) {
            if(arr[i] < arr[i+1])
                pf[i] = pf[i+1] + 1;
            else
                pf[i] = pf[i+1];
        }

        System.out.println("pf :- " + Arrays.toString(pf));

        int count = 0 ;

        for(int i=0; i<=n-3; i++) {
            for(int j=i+1; j<=n-2; j++) {
                if(arr[i] > arr[j]) continue;

                System.out.println("index: " + i + ", " + j+ "-> " +pf[j]);
                count += pf[j];

            }
        }

        return count;

    }
 }
