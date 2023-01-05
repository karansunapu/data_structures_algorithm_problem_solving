package advanced.Binary_Search_1;

import java.util.ArrayList;
import java.util.Arrays;

public class Sorted_Insert_Position {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 3, 5, 7));
        int B = 3;
        System.out.println(searchInsert(A, B));
    }

    public static int searchInsert(ArrayList<Integer> A, int B) {
        int left= 0;
        int right= A.size()-1;

        while (left <= right){

            int mid = (left + right)/2;

            if (A.get(mid) == B)
                return mid;
            else if (A.get(mid) < B)
                left = mid+1;
            else
                right = mid-1;
        }

        return right+1;

    }
}
