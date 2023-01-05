package intermediate;

import java.util.Arrays;
import java.util.Scanner;

public class pairOfIndicesWithGivenSum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // INPUT
        int arrSize = scan.nextInt();
        int[] arr = Arrays.stream(scan.nextLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
        int targetSUm = scan.nextInt();


        // CHECK INPUT
        System.out.println(arrSize);
        System.out.println(Arrays.toString(arr));
        System.out.println(targetSUm);
        System.out.println("\n\n");

        System.out.println(checkIndiesForSum(arr, arrSize, targetSUm));


    }

    public static int checkIndiesForSum(int[] arr, int arrSize, int targetSUm) {

        for(int i=0; i<arrSize; i++){
            int iThElement = arr[i];
            for(int j=i+1; j<arrSize; j++){
                if(targetSUm - iThElement == arr[j])
                    return 1;
            }
        }
        return 0;
    }
}
