package leet_code.Top_Interview_Questions.Easy;

import java.util.Arrays;
import java.util.HashMap;

public class Two_Sum {
    public static void main(String[] args) {
        int[] nums= {2,7,11,2};
        int target = 4;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for (int i=nums.length-1; i>=0; i--){
            if (hmap.containsKey(target - nums[i]))
                return new int[]{i, hmap.get(target-nums[i])};
            else
                hmap.put(nums[i], i);
        }
        return new int[]{0, 1};
    }
}
