package leet_code.Top_Interview_Questions.Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class Intersection_of_two_arrays {
    public static void main(String[] args) {
        int[] nums1= {4,9,5};
        int[] nums2= {9,4,9,8,4};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        int i=0, j=0;
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while (i<nums1.length && j<nums2.length){
            if (nums1[i] == nums2[j]){
                list.add(nums1[i]);
                i++; j++;
            }
            else if (nums1[i] < nums2[j])
                i++;
            else
                j++;
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
