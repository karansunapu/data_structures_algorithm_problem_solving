package advanced.Two_pointers;

import java.util.ArrayList;
import java.util.Arrays;

public class three_Sum_Zero {
    public static void main(String[] args) {
        int[] A ={-1,-1,-1,-1,-1,-1,-1};
//        System.out.println(threeSum(A));
        System.out.println(Arrays.deepToString(threeSum(A)));
    }

    public static int[][] threeSum(int[] A) {
        ArrayList<int[]> ans = new ArrayList<>();
        Arrays.sort(A);
        for (int i=0; i<A.length-2; i++){
            if (i>0 && A[i]==A[i-1]) {       // a>0
                continue;
            }
            if (A[i]>0)
                break;
            int target = -1*(A[i]);
            // find pairs
            int a=i+1, b=A.length-1;
            while (a<b){
                if (A[a]+A[b] == target){
                    ans.add(new int[]{A[i] ,A[a] ,A[b]});
                    a++; b--;
                    while (b>a && A[b]==A[b+1])           // for distinct elements
                        b--;
                    while (a<b && A[a]==A[a-1])       // a>0
                        a++;
                } else if (A[a]+A[b] > target)
                    b--;
                else
                    a++;
            }
        }
        return ans.toArray(new int[0][]);
    }
}
