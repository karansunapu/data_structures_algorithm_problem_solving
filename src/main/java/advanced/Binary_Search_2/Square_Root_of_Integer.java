package advanced.Binary_Search_2;

public class Square_Root_of_Integer {
    public static void main(String[] args) {
        System.out.println(sqrt(5));
    }

    public static int sqrt(int A) {
        int ans=1;                // hold the last best answer
        int left=1, right=A/2;    // Search space

        if (A == 0) return 0;

        while (left <= right){
            int mid= (left+right)/2;

            if (mid == A/mid   &&  A % mid==0 )
                return mid;
            else if (mid <= A/mid){
                ans = mid;
                left = mid+1;
            }
            else
                right = mid-1;
        }

        return ans;

    }
}
