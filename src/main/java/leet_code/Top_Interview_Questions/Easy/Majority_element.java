package leet_code.Top_Interview_Questions.Easy;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Majority_element {
    public static void main(String[] args) {
        int[] nums= {2,2,1,1,1,2,2};
        Map<Integer, Long> map =
                Arrays.stream(nums).boxed()
                        .collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()));
        System.out.println(map);
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        int maj=-1, freq=0;
        for (int n : nums){
            if (maj == -1){
                maj = n;
                freq=1;
            } else if (maj == n){
                freq++;
            } else {
                freq--;
                if (freq == 0)
                    maj = -1;
            }
        }
        return maj;
    }
}
