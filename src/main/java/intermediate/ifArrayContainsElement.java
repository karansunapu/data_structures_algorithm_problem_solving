package intermediate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ifArrayContainsElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int no_of_test_cases = scan.nextInt();

        for(int test_case =0; test_case<no_of_test_cases; test_case++){
            // INPUT
            int arrSize = scan.nextInt();
//            int[] arr = Arrays.stream(scan.nextLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
            ArrayList<Integer> intArrayList = Arrays.stream(scan.nextLine().trim().split(" ")).map(Integer::parseInt).collect(Collectors.toCollection(ArrayList::new));
            int no_to_find = scan.nextInt();

            // CHECK INPUT
            System.out.println(arrSize);
            System.out.println(intArrayList.toString());
            System.out.println(no_to_find);
            System.out.println("\n\n");

            if(intArrayList.contains(no_to_find))
                System.out.println("1");
            else
                System.out.println("0");
        }


    }
}
