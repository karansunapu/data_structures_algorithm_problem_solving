package intermediate.Arrays_Interview_Problems;

import java.util.Scanner;

public class print_hollow_diamond_star_pattern {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int n=num;
        while(n >= 1){
            for(int i=1; i<=n; i++)
                System.out.print("*");

            for(int i=1; i<=(num-n)*2; i++)
                System.out.print(" ");

            for(int i=1; i<=n; i++)
                System.out.print("*");

            System.out.println();
            n--;
        }

        n=1;
        while(n <= num){
            for(int i=1;i<=n;i++)
                System.out.print("*");

            for(int i=1;i<=(num-n)*2;i++)
                System.out.print(" ");

            for(int i=1;i<=n;i++)
                System.out.print("*");

            System.out.println();
            n++;
        }
    }
}
