package intermediate_1_fresh.day_6_Intro_to_Problem_solving;

import java.util.Scanner;

public class prime_or_not {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int factors =0;
        for(int i=1; i*i <= n; i++){
            if (n%i == 0){
                if (i*i == n)
                    factors+= 1;
                else
                    factors+= 2;
            }
        }

        System.out.println(factors);
    }
}
