package intermediate.Arrays_Interview_Problems;

import java.util.Arrays;

public class Length_of_longest_consecutive_ones {
    public static void main(String[] args) {
        String A = "11010110000000000";
        System.out.println(solve(A));
    }

    public static int solve(String str) {
        int max_sum= 0;
        int[] arr = (str.chars().map(x -> x-48)).toArray();

        int total_num_1 = (int)Arrays.stream(arr).filter(x -> x==1).count();

        for(int i=0; i<arr.length; i++) {

            if(arr[i] == 0){                            // if elem == 0
                int l_countOf_1 = 0, left = i-1;
                while(left >= 0){
                    if(arr[left] == 0)
                        break;
                    l_countOf_1++;
                    left--;
                }

                int r_countOf_1 = 0, right = i+1;
                while(right < arr.length){
                    if(arr[right] == 0)
                        break;
                    r_countOf_1++;
                    right++;
                }

                if(l_countOf_1+r_countOf_1 == total_num_1)
                    return l_countOf_1+r_countOf_1;        // 111-0-111 -> 111-111-0  == len =>ls+ rs =>6
                max_sum = Math.max(max_sum, l_countOf_1+r_countOf_1+1);
            }
        }

        return max_sum;
    }
}
