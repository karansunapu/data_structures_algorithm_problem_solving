package advanced.array_1.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Beggars_Outside_Temple {
    public static void main(String[] args) {
        int A= 5;
        ArrayList<ArrayList<Integer>> B = new ArrayList<ArrayList<Integer>>(){{
            add(new ArrayList<>(Arrays.asList(1, 2, 10)));
            add(new ArrayList<>(Arrays.asList(2, 3, 20)));
            add(new ArrayList<>(Arrays.asList(2, 5, 25)));
        }};

        System.out.println(solve(A, B));
    }

    public static ArrayList<Integer> solve(int A, ArrayList<ArrayList<Integer>> B) {

        int[] arr = new int[A];

        for (ArrayList<Integer> step : B){
            arr[step.get(0)-1] += step.get(2);               // add   -> +(ve)
            if (step.get(1)-1 +1 <= A-1)
                arr[step.get(1)-1 +1] -= step.get(2);           // subtrace  -> -(ve)
        }

        for (int i=1; i<arr.length; i++){
            arr[i] = arr[i] + arr[i-1];
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for (int i: arr){
            ans.add(i);
        }

//        return Arrays.stream(arr).boxed().collect(Collectors.toCollection(ArrayList::new));
        return ans;
    }
}
