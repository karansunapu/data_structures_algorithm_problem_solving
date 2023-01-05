package advanced.sorting_1;

import java.util.ArrayList;
import java.util.Arrays;

public class checkCows {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2, 6, 11, 14, 19, 25, 30, 39, 43));
        System.out.println(check(arr, 12, 4));
    }

    static boolean check(ArrayList<Integer> arr, int mid, int m){

        int lastPlaced = 0;
        m--;                        // placed cow_1 at 0th pos

        while (m > 0){
//            int placeAvailable = nextAvailable(arr, mid, lastPlaced);
            int placeAvailable = nextAvailableBinary(arr, mid, lastPlaced);
            if (placeAvailable == -1)
                return false;
            else{
                lastPlaced = placeAvailable;
                m--;
            }
        }
        return true;
    }

    static int nextAvailable(ArrayList<Integer> arr, int mid, int lastPlaced) {

        for (int i=lastPlaced+1; i<arr.size(); i++){
            if (arr.get(i) >= arr.get(lastPlaced)+mid)
                return i;
        }
        return -1;
    }

    static int nextAvailableBinary(ArrayList<Integer> arr, int distance, int lastPlaced) {
        int ans=-1;
        int left=lastPlaced+1, right=arr.size()-1;
        while (left <= right){
            int mid= (left+right)/2;

            if (arr.get(mid) < arr.get(lastPlaced)+distance){
                left = mid+1;
            } else {
                ans = mid;
                right = mid-1;
            }
        }

        return ans;
    }
}
