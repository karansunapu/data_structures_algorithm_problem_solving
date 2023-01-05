package leet_code.Top_Interview_Questions.Easy;

public class Longest_common_prefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder ans = new StringBuilder(strs[0]);
        for (int i=1; i<strs.length; i++){
            StringBuilder s = new StringBuilder();
            int len = Math.min(ans.length(), strs[i].length());
            for (int j=0; j<len; j++){
                if (ans.charAt(j) != strs[i].charAt(j))
                    break;
                else {
                    s.append(ans.charAt(j));
                }
            }
            if (s.length() == 0)
                return "";
            ans = s;
        }
        return ans.toString();
    }
}
