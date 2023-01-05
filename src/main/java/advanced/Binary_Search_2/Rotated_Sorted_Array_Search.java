package advanced.Binary_Search_2;

import java.util.Arrays;
import java.util.List;

public class Rotated_Sorted_Array_Search {
    public static void main(String[] args) {
        List<Integer> A = Arrays.asList(4, 5, 6, 7, 0, 1, 2, 3);
        int B = 2;
        System.out.println(search(A, B));
    }

    public static int search(final List<Integer> A, int B) {
        int size = A.size();
        // find the pivot
        int pivot_index = findPivotIndex(A);

        if (B > A.get(size-1))
            return binarySearch(A, 0, pivot_index, B);
        else
            return binarySearch(A, pivot_index+1, size-1, B);
    }

    static int findPivotIndex(final List<Integer> A){
        int size = A.size();
        if (A.get(0) < A.get(size-1))
            return -1;                 // ascending order only ..no rotations
        if (A.get(0) > A.get(1))
            return 0;

        int left=1, right=size-2;
        while (left <= right){
            int mid = (left+right)/2;

            if (A.get(mid) > A.get(mid-1)  && A.get(mid) > A.get(mid+1))
                return mid;
            else if (A.get(mid) > A.get(size-1))
                left = mid + 1;
            else
                right = mid -1;
        }
        return 0;
    }

    static int binarySearch(final List<Integer> A, int left, int right, int B){
        while (left<=right){
            int mid = (left+right)/2;

            if (A.get(mid) == B)
                return mid;
            else if (A.get(mid) < B)
                left = mid+1;
            else
                right = mid-1;
        }

        return -1;
    }
}
