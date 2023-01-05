package intermediate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class oddEvenSepLines {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int no_of_test_cases = scan.nextInt();
//        for(int test_case =0; test_case<no_of_test_cases; test_case++){
//            int arrSize = scan.nextInt();
//            ArrayList<Integer> intArrayList = Arrays.stream(scan.nextLine().trim().split(" ")).map(Integer::parseInt).collect(Collectors.toCollection(ArrayList::new));
//            int no_to_find = scan.nextInt();
//        }

        for(int test_case =0; test_case<no_of_test_cases; test_case++){
            // INPUT
            int arrSize = scan.nextInt();
//            int[] arr = Arrays.stream(scan.nextLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
            ArrayList<Integer> intArrayList = Arrays.stream(scan.nextLine().trim().split(" ")).map(Integer::parseInt).collect(Collectors.toCollection(ArrayList::new));

            // CHECK INPUT
            // System.out.println(arrSize);
            // System.out.println(intArrayList.toString());
            // System.out.println("\n\n");

            ArrayList<Integer> even = new ArrayList<>();
            ArrayList<Integer> odd = new ArrayList<>();

            for(Integer i: intArrayList) {
                if(i%2 == 0){
                    even.add(i);
                } else
                    odd.add(i);
            }

            for(int i: even)
                System.out.print(i + " ");

            System.out.println();

            for(int i: odd)
                System.out.print(i + " ");

            System.out.println();

        }

    }
}
