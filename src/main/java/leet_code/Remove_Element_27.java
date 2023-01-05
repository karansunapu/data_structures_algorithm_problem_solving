package leet_code;

import java.util.Arrays;

public class Remove_Element_27 {
    /*
    Given an integer array nums and an integer val,
    remove all occurrences of val in nums in-place.
    The relative order of the elements may be changed.

        Input: nums = [0,1,2,2,3,0,4,2], val = 2
        Output: 5, nums = [0,1,4,0,3,_,_,_]


      IDEA ->
        jo bhi 2(value) age m h usko piche feko not-2 wala jagah pr
        or jo bhi 2 ny h piche se usko age feko 2 k jagah pr
     */

    public static void main(String[] args) {
//        int[] nums ={0,1,2,2,3,0,4,2};
        int[] nums ={};
        int val =2;
        System.out.println(removeElement(nums, val));
    }
    public static int removeElement(int[] nums, int val) {
        int start=0, end=nums.length-1;

        if (nums.length==0)
            return 0;

        while (start<=end){
            while (start<end && nums[end] == 2)
                end--;

            while (start<end && nums[start] != 2)
                start++;

            nums[start] = nums[end];
            end--;
        }

        System.out.println(Arrays.toString(nums));

        if (start==0 && nums[0]==val)
            return 0;

        return start+1;

    }
}
