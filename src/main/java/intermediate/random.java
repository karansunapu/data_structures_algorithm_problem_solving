package intermediate;

import java.util.Scanner;

public class random {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        for(int orig_num=1; orig_num<=n; orig_num++){
            int i = orig_num;
            int sum = 0;

            while(i>0){
                int last_digit = (i%10);
                sum += (last_digit * last_digit * last_digit);
                i = i / 10;
            }

            if( orig_num == sum)
                System.out.println(orig_num);
        }
    }
}
