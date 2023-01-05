package leet_code.Top_Interview_Questions.Easy;

import java.util.ArrayList;
import java.util.HashSet;

public class Happy_Number {
    public static void main(String[] args) {

        // can also by - Approach 2: Floyd's Cycle-Finding Algorithm
        // https://leetcode.com/problems/happy-number/solutions/421162/happy-number/
        int n=2;
        System.out.println(isHappy(n));
    }

    public static boolean isHappy(int n) {
        int num = sumSqaures(n);
        HashSet<Integer> hashSet = new HashSet<Integer>();
        hashSet.add(n);hashSet.add(num);
        while (num != 1){
            num = sumSqaures(num);
            if (hashSet.contains(num))
                return false;
            else
                hashSet.add(num);
        }
        return true;
    }

    static int sumSqaures(int n){
        int sum=0;
        while (n>0){
            sum += (n%10) * (n%10);
            n = n/10;
        }
        return sum;
    }
}
