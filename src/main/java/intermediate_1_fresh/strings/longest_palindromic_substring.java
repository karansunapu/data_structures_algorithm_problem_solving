package intermediate_1_fresh.strings;

public class longest_palindromic_substring {
    public static void main(String[] args) {
        String A = "caccbcbaabacabaccacaaccaccaaccbbcbcbbaacabccbcccbbacbbacbccaccaacaccbbcc";
        System.out.println(longestPalindrome(A));
    }

    public static String longestPalindrome(String A) {
        int n = A.length(), max_length=1, start=0, end=0;
        for (int i=0; i<n; i++){
            int left=i, right=i;
            while(left>=0 && right<n){
                if (A.charAt(left) != A.charAt(right))
                    break;
                left--; right++;
            }
            if (right-left+1-2 > max_length) {
                max_length = right-left+1-2;
                start= left+1;
                end= right-1;
            }
        }
        for (int i=0; i<n-1; i++){
            int left=i, right=i+1;
            while(left>=0 && right<n){
                if (A.charAt(left) == A.charAt(right)){
                    left--; right++;
                } else
                    break;

            }
            if (right-left+1-2 > max_length) {
                max_length = left + right + 1;
                start= left+1;
                end= right-1;
            }
        }
        System.out.println(start+ "::" + end);
        return A.substring(start, end+1);
    }
}
