package leet_code.Top_Interview_Questions.Easy;

import java.util.Arrays;

public class Missing_Number {
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        int sum_n = (nums.length * (nums.length+1))/2;
        int sum_arr = Arrays.stream(nums).sum();
        return sum_n - sum_arr;
    }
}
