package intermediate;

import java.util.Arrays;

public class leftMaxArray {
    public static void main(String[] args) {

        int[] arr = {-3, 6, 2, 4, 5, 2, 8, -9, 3, 1};

        // traverse -> for each -> if( arr[i-1] > arr[i] -> update arr[i] else cotinue -> )
        int n = arr.length;

//        for(int i=1; i<n; i++){
//            if(arr[i] > arr[i-1])
//                continue;
//            else
//                arr[i] = arr[i-1];
//        }

        for(int i=1; i<n; i++){
            arr[i] = Math.max(arr[i], arr[i-1]);
        }

        Arrays.stream(arr).forEach( x -> System.out.print(x + " "));
    }
}
