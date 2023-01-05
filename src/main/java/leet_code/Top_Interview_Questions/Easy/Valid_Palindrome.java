package leet_code.Top_Interview_Questions.Easy;

import java.util.Locale;

public class Valid_Palindrome {
    public static void main(String[] args) {
//        String s= "A man, a plan, a canal: Panama";
        String s= "  ";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        int start=0, end=s.length()-1;
        s = s.toLowerCase();
        while (start < end){
            while ( start<end && !((s.charAt(start)>='a'&&s.charAt(start)<='z')
                    || (s.charAt(start)>='A' &&s.charAt(start)<='Z') || (s.charAt(start)>='0' &&s.charAt(start)<='9')))
                start++;
            while ( start<end &&  !((s.charAt(end)>='a'&&s.charAt(end)<='z')
                    || (s.charAt(end)>='A' &&s.charAt(end)<='Z') || (s.charAt(end)>='0' &&s.charAt(end)<='9')))
                end--;
            System.out.println(s.charAt(start) +" : "+ s.charAt(end));
            if (s.charAt(start++) != s.charAt(end--))
                return false;
        }
        return true;
    }
}
