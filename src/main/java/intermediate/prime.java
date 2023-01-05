package intermediate;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int count =0;

        for(int i=1; i*i<=n; i++){
            if(n%i == 0){
                count++;
                if( i*i != n)
                    count++;
            }

        }

        if(count==2)
            System.out.print("YES");
        else
            System.out.print("NO");

    }
}
