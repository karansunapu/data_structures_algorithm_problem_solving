package advanced.Problems_on_Strings_with_Hashmaps;

import java.util.HashMap;

public class Permutations_of_A_in_B {
    public static void main(String[] args) {
        String A="abc", B="";
        System.out.println(solve(A, B));
    }

    public static int solve(String A, String B) {
        if (B.equals(""))
            return A.length();
      HashMap<Character, Integer> a = new HashMap<>();
      HashMap<Character, Integer> b = new HashMap<>();
      int count=0;

      for (char c : A.toCharArray())
          a.put(c, a.getOrDefault(c, 0)+1);

        for (char c : B.substring(0, A.length()).toCharArray())
            b.put(c, b.getOrDefault(c, 0)+1);

        count += check(a, b);

        int start=1, end=A.length();
        while (end < B.length()){
            char rem = B.charAt(start-1);
            char add = B.charAt(end);
            if (b.get(rem) == 1)
                b.remove(rem);
            else
                b.put(rem, b.get(rem) -1);

            b.put(add, b.getOrDefault(add, 0)+1);

            count += check(a, b);
            start++; end++;
        }
        return count;
    }

    static int check(HashMap<Character, Integer> a, HashMap<Character, Integer> b) {
        for (Character c : a.keySet()){
            if (a.get(c) != b.get(c))
                return 0;
        }
        return 1;
    }

//    static int check(HashMap<Character, Integer>)
}
