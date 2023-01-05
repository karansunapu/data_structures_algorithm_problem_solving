package intermediate;

import java.util.Arrays;

public class reverseArrayNoExtraSpace {
    public static void main(String[] args) {

        int[] arr = {2, 8, 1, 4, 89, 0 ,8, 1, 3, 8};

        for(int i=0; i<= (arr.length/2)-1; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        Arrays.stream(arr).limit(arr.length-1).forEach(x -> System.out.print(x + ", "));
    }
}
