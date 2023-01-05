package intermediate_1_fresh.day_6_Intro_to_Problem_solving;

import java.util.Scanner;

public class Is_It_Perfect {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int no_of_num = scan.nextInt();
        while (no_of_num>0){
            int n= scan.nextInt();
            int sum_of_factors =0;
            for(int i=1; i*i <= n; i++){
                if (n%i == 0){
                    if (i*i == n)
                        sum_of_factors += i;
                    else
                        sum_of_factors += i + (n/i);
                }
            }

            if (sum_of_factors-n == n)
                System.out.println("YES");
            else
                System.out.println("NO");

            no_of_num--;
        }
    }
}
