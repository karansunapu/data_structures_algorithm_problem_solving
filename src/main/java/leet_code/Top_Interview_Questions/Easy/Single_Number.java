package leet_code.Top_Interview_Questions.Easy;

public class Single_Number {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        int ans = 0;
        for (int n : nums)
            ans = ans ^ n;
        return ans;
    }
}
