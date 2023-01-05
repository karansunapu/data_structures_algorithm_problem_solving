package leet_code.Top_Interview_Questions.Easy;

public class Climbing_Stairs {
    public static void main(String[] args) {
        int n= 44;
        System.out.println(climbStairs(n));
    }

    public static int climbStairs(int n) {
        if (n <= 1)
            return 1;

        int[] cache = new int[n+1];
        cache[0] = 1;
        cache[1] = 1;

//        if (cache[n] == 0) {
//            cache[n] = climbStairs(n - 1) + climbStairs(n - 2);
//            return cache[n];
//        } else
//            return cache[n];


//        for (int i = 2; i <= n; i++) {
//            cache[i] = cache[i-1] + cache[i-2];
//        }
//        return cache[n];

        int result=0, stepOne=1,stepTwo=1;
        for(int i=2;i<=n;i++){
            result=stepOne+stepTwo;
            stepTwo=stepOne;
            stepOne=result;
        }
        return result;

    }

    public static int climbStairs_naive(int n) {
        if (n <= 1)
            return 1;
        return climbStairs_naive(n - 1) + climbStairs_naive(n - 2);
    }
}
