package leet_code.Top_Interview_Questions.Easy;

import java.util.Arrays;

public class Move_Zeroes {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums) {
        int start=0, end=nums.length;
        for (int i=0; i<nums.length; i++){
            if (nums[i] == 0)
                end--;
            else
                nums[start++] = nums[i];
        }

        while (end < nums.length)
            nums[end++] = 0;
    }
}
