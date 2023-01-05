package leet_code.Top_Interview_Questions.Easy;

/*
 See the solution ways ..
 can be done by Divide and conquer
                Binary Search
                Tries
 */

public class Reverse_Vowels_of_a_String {
    public static void main(String[] args) {
        String s = ".,";
        System.out.println(reverseVowels(s));
    }

    public static String reverseVowels(String s) {
        if (s.length()==1)
            return s;

        StringBuilder str = new StringBuilder(s);
        int start=0, end=str.length()-1;
        while (start <= end){

            while (start<=end && !checkVowel(str.charAt(start)) )
                start++;
            while (start<=end && !checkVowel(str.charAt(end)))
                end--;
            if (start<=end){
                swap(start, end, str);
                start++; end--;
            }
        }
        return str.toString();
    }

    static StringBuilder swap(int start, int end, StringBuilder s){
        char temp = s.charAt(start);
        s.setCharAt(start, s.charAt(end));
        s.setCharAt(end, temp);
        return s;
    }

    static boolean checkVowel(char c){
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
          || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
            return true;
        else
            return false;
    }
}
