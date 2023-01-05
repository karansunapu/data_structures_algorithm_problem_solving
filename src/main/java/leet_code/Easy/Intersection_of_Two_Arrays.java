package leet_code.Easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Intersection_of_Two_Arrays {
    public static void main(String[] args) {
        int[] nums1={4,9,5};
        int[] nums2={9,4,9,8,4};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0, j=0;
        HashSet<Integer> hset = new HashSet<>();
        while (i<nums1.length && j< nums2.length){
            if (nums1[i] == nums2[j]){
                hset.add(nums1[i]);
                i++; j++;
            }
            else if (nums1[i] < nums2[j])
                i++;
            else
                j++;
        }
        return hset.stream().mapToInt(Integer::intValue).toArray();
    }
}
