package intermediate;

public class longestSubstringPalindrome {
    public static void main(String[] args) {

//        char[] arr = {'a', 'b', 'a', 'c', 'a', 'b', 'a', 'b', 'c', 'd'};

        char[] arr = {'a', 'b', 'd', 'c'};

        int len = arr.length;

        int t_max = 0;

        for(int i=1; i<len-1; i++) {

            int left = i - 1;
            int right = i + 1;
            int e_max = 1;

            while(left >= 0  && right<len  &&  arr[left]==arr[right]) {
                e_max += 2;
                left--;
                right++;
            }

            t_max = Math.max(t_max, e_max);
        }

        System.out.println(t_max);
    }
}
