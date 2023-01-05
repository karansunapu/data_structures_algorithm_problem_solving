package intermediate_1_fresh.contest_1;

import java.util.Arrays;

public class vowels_in_a_range {
    public static void main(String[] args) {
        String A = "interviewbit";
        int[][] B = { {0,2}, {2,4}};
        System.out.println(Arrays.toString(solve(A, B)));
    }

    public static int[] solve(String A, int[][] B) {
        StringBuilder str = new StringBuilder(A);
        int count=0;
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i'
                 || str.charAt(i)=='o' || str.charAt(i)=='u')
                str.setCharAt(i, (char) ('0'+ (++count)));
            else
                str.setCharAt(i, (char) ('0'+count));
        }
        System.out.println(str);

        int[] ans = new int[B.length];
        for (int i=0; i<B.length; i++){
            int start=B[i][0], end=B[i][1];
            if (start==0){
                ans[i] =  str.charAt(end) - '0';
            } else {
                ans[i] = str.charAt(end) - str.charAt(start-1);
            }
        }

        return ans;
    }
}
