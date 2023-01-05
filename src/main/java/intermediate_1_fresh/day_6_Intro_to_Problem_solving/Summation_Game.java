package intermediate_1_fresh.day_6_Intro_to_Problem_solving;

import java.util.Scanner;

public class Summation_Game {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(n*(n+1)/2);
    }
}