package advanced.Two_pointers;

public class Container_With_Most_Water {
    public static void main(String[] args) {
        int[] A = {1,5,4,3};
        System.out.println(maxArea(A));
    }

    public static int maxArea(int[] A) {
        int i=0, j=A.length-1, ans=0;
        while (i<j){
            ans= Math.max(ans, (j-i)*Math.min(A[i],A[j]));
            if (A[i]<=A[j])
                i++;
            else
                j--;
        }
        return ans;
    }
}
