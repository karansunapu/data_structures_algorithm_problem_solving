package advanced.arrays_3;

import java.util.Arrays;

public class next_smallest_palindrome {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4};
        int[] arr = {9, 9, 9, 9};
        System.out.println( Arrays.toString(solve(arr)) );
    }

    static int[] solve(int[] arr){

        // for all 9's
        int flag =0;
        int[] ans = new int[arr.length +1];
        for (int n: arr){
            if (n != 9)
                flag=1;
        }
        if (flag == 0) {
            ans[0] = 1;
            ans[ans.length - 1] = 1;
            return ans;
        }


        int left =0;
        int right =arr.length-1;
        while (left <= right){
            if (arr[left] == arr[right])
                continue;
            else{

            }

            left++;
            right--;
        }

        return ans;
    }
}
