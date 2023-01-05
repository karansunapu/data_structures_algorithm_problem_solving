package advanced.arrays_3;

public class row_with_max_no_of_1s {
    public static void main(String[] args) {
//        int[][] A = {{0,0,0,1,1},{0,0,0,0,1},{0,0,1,1,1},{0,1,1,1,1},{0,0,1,1,1}};
        int[][] A = {{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1}};
        System.out.println(solve(A));
    }

    static int solve(int[][] arr){
        int max = 0;
        int curr_count = 0;
        int row =0, column =arr[0].length-1;
        while (row < arr.length  &&  column >= 0){

            if(arr[row][column] == 1){
                curr_count++;
                column--;
            } else {
                max = Math.max(curr_count, max);
                row++;
            }
        }

        max = Math.max(curr_count, max);
        return max;
    }
}
