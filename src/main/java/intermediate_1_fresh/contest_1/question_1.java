package intermediate_1_fresh.contest_1;

import java.util.Arrays;
import java.util.Scanner;

/*
2 3 4
1 2 3
3 1 2 2 2
2 1 2
4 1 2 2 3
 */
public class question_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n=scan.nextInt(), m= scan.nextInt(), q=scan.nextInt();
//        System.out.println(n+" "+m+" "+q);
        int[][] arr = new int[n][m];
        int num=1;
        for (int row=0; row<n; row++)
            for (int col=0; col<m; col++)
                arr[row][col] = num++;
//        System.out.println(Arrays.deepToString(arr));


        scan.nextLine();
        for (int qr=0; qr<q; qr++){
            int[] queries = Arrays.stream(scan.nextLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();

            if (queries[0] == 1){
                int c1=queries[1]-1, c2=queries[2]-1;
                // swap columns
                for (int row=0; row<n; row++){
                    int temp = arr[row][c1];
                    arr[row][c1] = arr[row][c2];
                    arr[row][c2] = temp;
                }

            } else if (queries[0] == 2){
                int r1=queries[1]-1, r2=queries[2]-1;
                // swap columns
                for (int col=0; col<m; col++){
                    int temp = arr[r1][col];
                    arr[r1][col] = arr[r2][col];
                    arr[r2][col] = temp;
                }

            } else if (queries[0] == 3){
                int x1=queries[1]-1, x2=queries[2]-1, x3=queries[3]-1, x4=queries[4]-1;
                System.out.println(arr[x1][x2] | arr[x3][x4]);
            } else {
                int x1=queries[1]-1, x2=queries[2]-1, x3=queries[3]-1, x4=queries[4]-1;
                System.out.println(arr[x1][x2] & arr[x3][x4]);
            }

        }








//        int[][] queries = new int[q][5];
//        scan.nextLine();
//        for (int qr=0; qr<q; qr++){
//            queries[qr] = Arrays.stream(scan.nextLine().split(" "))
//                            .mapToInt(Integer::parseInt).toArray();
//        }
////        System.out.println(Arrays.deepToString(queries));
//
//        //main logic
//        for (int i=0; i<queries.length; i++){
//            if (queries[i][0] == 1){
//                int c1=queries[i][1]-1, c2=queries[i][2]-1;
//                // swap columns
//                for (int row=0; row<n; row++){
//                    int temp = arr[row][c1];
//                    arr[row][c1] = arr[row][c2];
//                    arr[row][c2] = temp;
//                }
//
//            } else if (queries[i][0] == 2){
//                int r1=queries[i][1]-1, r2=queries[i][2]-1;
//                // swap columns
//                for (int col=0; col<m; col++){
//                    int temp = arr[r1][col];
//                    arr[r1][col] = arr[r2][col];
//                    arr[r2][col] = temp;
//                }
//
//            } else if (queries[i][0] == 3){
//                int x1=queries[i][1]-1, x2=queries[i][2]-1, x3=queries[i][3]-1, x4=queries[i][4]-1;
//                System.out.println(arr[x1][x2] | arr[x3][x4]);
//            } else {
//                int x1=queries[i][1]-1, x2=queries[i][2]-1, x3=queries[i][3]-1, x4=queries[i][4]-1;
//                System.out.println(arr[x1][x2] & arr[x3][x4]);
//            }
//        }

    }
}
