package advanced.Binary_Search_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Rotated_Sorted_Array_Search {
    public static void main(String[] args) {
        List<Integer> A = Arrays.asList(5, 1, 3);
        int B= 5;
        System.out.println(search(A, B));
    }

    public static int search(final List<Integer> A, int B) {
        int pivot_index = findPivot(A, B);

        if ( B > A.get(A.size()-1))
            return binarySearch(new ArrayList<>(A), 0, pivot_index, B);
        else
            return binarySearch(new ArrayList<>(A), pivot_index+1, A.size()-1, B);

    }

    public static int findPivot(final List<Integer> A, int B){
        int left= 0;
        int right= A.size()-2;

        if (A.get(0) < A.get(A.size()-1))
            return -1;
        if (A.get(0) > A.get(1))
            return 0;


        while (left <= right){
            int mid= (left + right)/2;
            if (A.get(mid) > A.get(mid-1) && A.get(mid) > A.get(mid+1))
                return mid;
            else if (A.get(mid) > A.get(A.size()-1) )
                left = mid+1;
            else
                right = mid-1;
        }

        return -1;
    }

    public static int binarySearch(ArrayList<Integer> A, int left, int right, int B) {

        while (left <= right){
            int mid = (left + right)/2;

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
