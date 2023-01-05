package leet_code.Top_Interview_Questions.Easy;

import java.util.Arrays;

public class Remove_Duplicates_from_Sorted_Array {
    public static void main(String[] args) {
//        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int[] nums = {1,1};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }

    public static int removeDuplicates(int[] nums) {
         int next=1, putAt=1;
        while (next<nums.length){
            while (next<nums.length && nums[next]==nums[next-1])
                next++;
            if (next>=nums.length)
                break;
            nums[putAt] = nums[next];
            putAt++;
            next++;
        }
        return putAt;
    }
}
