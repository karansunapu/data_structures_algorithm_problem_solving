package leet_code;

import java.util.Arrays;

public class Remove_Duplicates_from_Sorted_Array_26 {

    /*
    Given an integer array nums sorted in non-decreasing order,
    remove the duplicates in-place such that each unique element appears only once.
    The relative order of the elements should be kept the same.

    -> sorted - so same elements in adjacent only ---> IMPORTANT
    -> in-place - so swapping hi krna hga shyd
    -> relaive order should be mantianed ....loop start se hi krna hga

    -> could have used indices like a(0) mein 0....a(1) mein 1....but not continuos elements ..random h ...so not this approach

     */
    public static void main(String[] args) {
        int[] nums = {2,2,7,7,8,9,9,9};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int current_elemnt =nums[0], pos =0;

        for (int i=1; i<nums.length; i++) {
            if (nums[i] == current_elemnt) {
                continue;
            }
            else {
                nums[pos] = current_elemnt;
                pos++;
                current_elemnt =nums[i];
            }
        }

        nums[pos] = current_elemnt;
        pos++;

        System.out.println(Arrays.toString(nums));
        return pos;
    }
}
