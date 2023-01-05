package advanced.Problems_on_Strings_with_Hashmaps;

import java.util.HashSet;

public class Boring_substring {
    public static void main(String[] args) {
        String A= "aab";
        System.out.println(solve(A));
    }

    public static int solve(String A) {
        HashSet<Integer> even_set = new HashSet<>();
        HashSet<Integer> odd_set = new HashSet<>();

        for (char c: A.toCharArray()){
            int n= c-96;
            if (n%2 == 0)
                even_set.add(n);
            else
                odd_set.add(n);
        }

        if (odd_set.size()==0 || even_set.size()==0)
            return 1;               // if only even character - 2468

        for (int odd : odd_set){
            for (int i=2; i<=26; i+=2){
                if (i!=odd-1 && i!=odd+1){
                    if (even_set.contains(i))
                        return 1;
                }
            }
        }

        return 0;
    }
}
