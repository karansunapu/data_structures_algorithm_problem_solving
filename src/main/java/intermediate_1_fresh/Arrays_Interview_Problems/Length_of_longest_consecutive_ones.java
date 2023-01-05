package intermediate_1_fresh.Arrays_Interview_Problems;

import java.util.Arrays;

public class Length_of_longest_consecutive_ones {
    public static void main(String[] args) {
        String A = "1110111";
        System.out.println(solve(A));

//        int[] intArr = A.chars().map(x -> x-48).toArray();
//        int total_1 = (int) Arrays.stream(intArr).filter(x-> x==1).count();
//        System.out.println(Arrays.toString(intArr));
    }

    public static int solve(String A) {

        char[] arr = A.toCharArray();
        int max_count=0, total_1_count=0, count=0;

        for (char ch : arr){
            if (ch == '1'){
                count++;
                total_1_count++;
            } else {
                max_count = Math.max(max_count, count);
                count=0;
            }
        }

        for (int i=0; i<arr.length; i++){
            int r_count=0, l_count=0;
            if (arr[i] == '0'){
                for (int j=i-1; j>=0; j--){
                    if (arr[j] == '1')
                        l_count++;
                    else
                        break;
                }
                for (int j=i+1; j<arr.length; j++){
                    if (arr[j] == '1')
                        r_count++;
                    else
                        break;
                }

                if (r_count + l_count == total_1_count)
                    return l_count+r_count;

                max_count = Math.max(max_count, r_count+l_count+1);
            }
        }

        return max_count;
    }
}
