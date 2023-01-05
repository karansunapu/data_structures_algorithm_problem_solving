package leet_code.Top_Interview_Questions.Easy;

import java.util.HashMap;

public class Roman_to_Integer {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> hmap = new HashMap<Character, Integer>() {{
                put('I', 1);put('V', 5);put('X', 10);put('L', 50);
                put('C', 100);put('D', 500);put('M', 1000);
        }};
        int sum=0, i=0;
        for (; i<s.length()-1; i++){
            if (s.charAt(i)=='I' && (s.charAt(i+1)=='V' || s.charAt(i+1)=='X')){
                sum += hmap.get(s.charAt(i+1)) - hmap.get(s.charAt(i));
                i++;
            } else if (s.charAt(i)=='X' && (s.charAt(i+1)=='L' || s.charAt(i+1)=='C')){
                sum += hmap.get(s.charAt(i+1)) - hmap.get(s.charAt(i));
                i++;
            } else if (s.charAt(i)=='C' && (s.charAt(i+1)=='D' || s.charAt(i+1)=='M')){
                sum += hmap.get(s.charAt(i+1)) - hmap.get(s.charAt(i));
                i++;
            } else {
                sum += hmap.get(s.charAt(i));
            }
        }

        if (i==s.length()-1)
            sum += hmap.get(s.charAt(i));

        return sum;
    }
}
