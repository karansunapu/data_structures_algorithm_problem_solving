package advanced.Binary_Search_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class aggresive_cows {
    public static void main(String[] args) {
//      int[] A = {1, 3, 4, 8, 9};
        int[] A = {5, 17, 100, 11};
      ArrayList<Integer> arr = Arrays.stream(A).boxed().collect(Collectors.toCollection(ArrayList::new));
      int B = 2;
        System.out.println(solve(arr, B));

//      int n=A.length;
//      for (int i=1;i<A[n-1] - A[0]; i++){
//          System.out.println("For distance :"+i+" : "+isDistPosble(i,B,A));
//      }
    }

    public static int solve(ArrayList<Integer> A, int B) {
        Collections.sort(A);
        int n=A.size(), start=1, end=A.get(n-1) - A.get(0), max_distance=0;
        while (start<=end){
            int mid=(start+end)/2;
            if (isDistPosble(mid,B,A)) {
                max_distance = mid;
                start = mid+1;
            }
            else
                end = mid-1;
        }
        return max_distance;
    }

    static boolean isDistPosble(int d, int cows, ArrayList<Integer> stalls){
        int last_stall = stalls.get(0);
        cows--;
        for (int i=1; i<stalls.size() && cows>=1; i++){
            if (stalls.get(i) - last_stall >= d){
                last_stall = stalls.get(i);
                cows--;
            }
        }
        if (cows == 0)
            return true;
        else
            return false;
    }
}
