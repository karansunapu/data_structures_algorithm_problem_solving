package advanced.Binary_Search_4;

public class Find_k_rotatedSortedArray {
    public static void main(String[] args) {
        int[] A = {4,5,6,1,2,3};
        System.out.println(findStart(A));
    }

    static int findStart(int[] arr){
        int start=0, end=arr.length-1;
        while (start<=end){
            int mid= (start+end)/2;
            if (mid==0)
                return 0;
            if (arr[mid]<arr[mid+1] && arr[mid]>arr[mid-1]){
                if (arr[mid]<arr[arr.length-1])
                    end= mid-1;
                else
                    start= mid+1;
            } else{
                if (arr[mid]>arr[arr.length-1])
                    return mid+1;
                else
                    return mid;
            }
        }
        return 0;
    }
}
