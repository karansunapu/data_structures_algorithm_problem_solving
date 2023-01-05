package intermediate.Arrays_Interview_Problems;

public class christmas_Trees_increasing_order_triplets_with_min_cost_B {
    public static void main(String[] args) {
//        int[] A = {1, 6, 4, 2, 6, 9};
//        int[] B = {2, 5, 7, 3, 2, 7};

        int[] A = {5, 9, 10, 4, 7, 8};
        int[] B = {5, 6, 4, 7, 2, 5};

        System.out.println(solve(A, B));
    }

    public static int solve(int[] A, int[] B) {
        int min_sum =Integer.MAX_VALUE;
        int a_len = A.length;
        int b_len = B.length;

        for(int i=1; i<=a_len-2; i++) {     // candidates for middle (j-th) element

            int left_min_cost = Integer.MAX_VALUE, right_min_cost = Integer.MAX_VALUE;
            //search for left_min and right_min -> condtn arr[left_min] < arr[i] < arr[right_min]
            for(int left=i-1; left>=0; left--){
                if(A[left] < A[i])
                    left_min_cost = Math.min(left_min_cost, B[left]);
            }

            for(int right=i+1; right<a_len; right++){
                if(A[right] > A[i])
                    right_min_cost = Math.min(right_min_cost, B[right]);
            }

            //if no element for left_min or right_min then can't be middle element
            if(left_min_cost==Integer.MAX_VALUE || right_min_cost==Integer.MAX_VALUE)
                continue;

            System.out.println("For : " +A[i]+ ": lmin="+left_min_cost+ ",rmin="+ right_min_cost);

            min_sum = Math.min(min_sum, left_min_cost + B[i] + right_min_cost);
        }

        return min_sum;
    }

    public static int solve_n3(int[] A, int[] B) {

        int min_sum =Integer.MAX_VALUE;
        int a_len = A.length;
        int b_len = B.length;
        //all triplets
        for(int i=0; i<=a_len-3; i++){
            for(int j=i+1; j<=a_len-2; j++){
                if(A[j]>A[i]){
                    for(int k=j+1; k<=a_len-1; k++){
                        int sum = 0;
                        if(A[k]>A[j]) {
                            sum = B[i] + B[j] + B[k];
                            min_sum = Math.min(min_sum, sum);
                        }
                    }
                }
            }
        }

        return min_sum;
    }
}
