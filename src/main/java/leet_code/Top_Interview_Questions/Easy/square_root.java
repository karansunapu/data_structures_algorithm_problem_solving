package leet_code.Top_Interview_Questions.Easy;

public class square_root {
    public static void main(String[] args) {
//        System.out.println(mySqrt(2147395600));
        System.out.println(mySqrtBiinary(2147395600));
    }


    public static int mySqrtBiinary(int x) {
        long start=0, end=x, ans=0;
        if(x==1)
            return 1;

        while (start<end){
            long mid=(start+end)/2;
            if (x == mid*mid)
                return (int) mid;

            if (x < mid*mid)
                end = mid;
            else{
                start = mid+1;
                ans = mid;
            }
        }
        return (int) ans;
    }

    public static int mySqrt(int x) {
        long ans=0;
        for(long i=1; i<=x; i++){
            if(x < i*i)
                return (int) ans;
            ans = i;
        }
        return (int) ans;
    }
}
