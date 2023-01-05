package intermediate;

import java.util.Arrays;
import java.util.Scanner;

//4 1 2 3 4
//        2

public class rotate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // INPUT
        int arrSize = scan.nextInt();
        int[] arr = Arrays.stream(scan.nextLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rotateBy = scan.nextInt();
        // IMPORTANT - esle IndexOutOfBound exception
        rotateBy = rotateBy%arrSize;

        // CHECK INPUT
        System.out.println(arrSize);
        System.out.println(Arrays.toString(arr));
        System.out.println(rotateBy);
        System.out.println("\n\n");

        // reverse(ab)
        reverse(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

        // reverse(b)
        reverse(arr, 0, rotateBy-1);
        System.out.println(Arrays.toString(arr));

        // reverse(a)
        reverse(arr, rotateBy, arrSize-1);
        System.out.println(Arrays.toString(arr));
        Arrays.stream(arr).forEach(x -> System.out.println(x + " "));

    }

    public static void reverse(int[] arr, int start, int end) {
        int temp;
        for(int i=start,j=end; i<=j; i++,j--){
//            arr[i] = arr[i] + arr[j];
//            arr[j] = arr[i] - arr[j];
//            arr[i] = arr[i] - arr[j];
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
