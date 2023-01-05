package leet_code;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Two_Sum_1 {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target =9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hmap = new HashMap<>();

        for (int i=0; i<nums.length; i++){
            if (hmap.containsKey(target - nums[i])) {
                return new int[]{hmap.get(target - nums[i]), i};
            } else {
                hmap.put(nums[i], i);
            }
        }

        return new int[]{0,1};
    }
}
