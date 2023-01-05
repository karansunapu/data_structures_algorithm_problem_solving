package intermediate;

import java.util.Arrays;
import java.util.Scanner;

public class MaxAndMinOfArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // INPUT
        int arrSize = scan.nextInt();
        int[] arr = Arrays.stream(scan.nextLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();

        // CHECK INPUT
        System.out.println(arrSize);
        System.out.println(Arrays.toString(arr));
        System.out.println("\n\n");

        int max= Integer.MIN_VALUE, min=Integer.MAX_VALUE;

        for(int i=0; i<arrSize; i++) {
            max = Integer.max(max, arr[i]);
            min = Integer.min(min, arr[i]);
        }

        System.out.println("MAX: " + max + " ...." + "MIN: " + min);

    }
}
