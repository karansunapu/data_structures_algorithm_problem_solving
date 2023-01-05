package advanced.array_1.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class add_one_to_number {
    public static void main(String[] args) {
        ArrayList<Integer> arr = Arrays.stream(new int[]{0})
                                    .boxed()
                                    .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(plusOne(arr));
    }

    public static ArrayList<Integer> plusOne(ArrayList<Integer> A) {

        // removing all forward zeros ..leftTrim
        while (A.size()!=0 && A.get(0) == 0){
            A.remove(0);
        }

        int size = A.size();
        // if all elements were 0
        if (size ==0){
            A.add(0, 1);
            return A;
        }


        if(A.get(size-1) < 9){
            A.set(size-1, A.get(size-1) + 1);
        }
        else{
            boolean add_one= true;
            for (int i=size-1; i>=0; i--){
                if (A.get(i) == 9){
                    A.set(i, 0);
                } else {
                    A.set(i, A.get(i) +1);
                    add_one= false;
                    break;
                }
            }

            if (add_one)
                A.add(0, 1);
        }

        return A;
    }
}
