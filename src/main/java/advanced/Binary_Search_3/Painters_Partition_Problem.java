package advanced.Binary_Search_3;

public class Painters_Partition_Problem {
    public static void main(String[] args) {
        int A=1, B=1000000;
        int[] C ={1000000, 1000000};
        System.out.println(paint(A, B, C));
    }

    public static int paint(int A, int B, int[] C) {
        int max=0, sum=0;                   // start - end -> search space
        for (int i=0; i<C.length; i++){
            long mul= (C[i]*B)% 10000003;
            C[i] = (int) mul;
            max = Math.max(max, C[i]);
            sum += C[i];
        }
        int start=max, end=sum, ans=max;
        while (start<=end){
            int mid= (start+end)/2;
            if (check(C, A, mid)){
                ans= mid;
                end= mid-1;
            } else {
                start = mid + 1;
            }
        }
        return ans% 10000003;
    }

    static boolean check(int[] arr, int painters, int time){
        int current_time=0, painters_used=1;
        for (int i=0; i<arr.length; i++){
            if (current_time+arr[i] <= time)
                current_time += arr[i];
            else {
                painters_used++;
                current_time = arr[i];
            }
        }
        if (painters_used <= painters)
            return true;
        else
            return false;
    }
}
