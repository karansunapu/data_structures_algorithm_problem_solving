package intermediate;

import java.util.TreeSet;

public class noOfSubstringsStartWithVowel {
    public static void main(String[] args) {
        String A = "ABEC";

        TreeSet<Character> se = new TreeSet<>();
        se.add('a'); se.add('e'); se.add('i'); se.add('o'); se.add('u');
        se.add('A'); se.add('E'); se.add('I'); se.add('O'); se.add('U');
        int n = A.length();
        long ans = 0;
        for(int i = 0; i < n; i++){
            if(se.contains(A.charAt(i))){
                ans += (n - i);
            }
        }
        System.out.println( (int)(ans%10003));
    }

    // MY SOLUTION ==>>>>>
    public int solve(String A) {
        String vowels = "aeiouAEIOU";
        long no_of_substrings = 0;
        int len = A.length();

        for (char c : A.toCharArray()) {
            len--;
            if (vowels.indexOf(c) != -1) {           // check if vowel
                no_of_substrings += len + 1;
            }
        }

        return 0;
    }
}
