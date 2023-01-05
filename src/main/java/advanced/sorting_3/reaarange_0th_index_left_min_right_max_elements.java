package advanced.sorting_3;

import java.util.Arrays;

public class reaarange_0th_index_left_min_right_max_elements {
    public static void main(String[] args) {
//        int[] arr = {10,3,8,15,6,12,2,18,19,1};
//        int[] arr = {2,3,8,15,6,12,10,18,19,1};
        int[] arr = {1,2,3,4,5};
        solve(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void solve(int[] arr){
        int i=1, swap_pointer=arr.length-1;

        while (i <= swap_pointer){
            if (arr[0] > arr[i])
                i++;
            else{
                swap(arr, i, swap_pointer);
                swap_pointer--;
            }
        }
        swap(arr, 0, swap_pointer);
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
