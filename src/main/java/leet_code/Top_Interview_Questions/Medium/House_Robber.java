package leet_code.Top_Interview_Questions.Medium;

public class House_Robber {
    public static void main(String[] args) {
//        int[] nums = {2,7,3,9,100,7,500};
        int[] nums = {2,2,4,3,2,5};
        System.out.println(rob(nums));
    }

    public static int rob(int[] nums) {
        int n = nums.length, total_sum_0=0, total_sum_1=0;;
        for (int i=0; i<n;){
            System.out.println("taking sum total_sum_0: "+nums[i]);
            total_sum_0+=nums[i];
            int a_sum=0, b_sum=0, a=i+2, b=i+3;
            while (a<n){
                a_sum += nums[a];
                a += 2;
            }
            while (b<n){
                b_sum += nums[b];
                b += 2;
            }
            if (a_sum<b_sum)
                i+=3;
            else
                i+=2;
        }
        for (int i=1; i<n;){
            System.out.println("taking sum total_sum_1: "+nums[i]);
            total_sum_1+=nums[i];
            int a_sum=0, b_sum=0, a=i+2, b=i+3;
            while (a<n){
                a_sum += nums[a];
                a += 2;
            }
            while (b<n){
                b_sum += nums[b];
                b += 2;
            }
            if (a_sum<b_sum)
                i+=3;
            else
                i+=2;
        }
        return Math.max(total_sum_0, total_sum_1);
    }
}
