package intermediate_1_fresh.strings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class reverse_the_string {
    public static void main(String[] args) {
        String A = "crulgzfkif gg ombt vemmoxrgf qoddptokkz op xdq hv ";
//        System.out.println(solve(A));
        reverse("karan");
    }

    static void reverse(String str){
        String ans = "";
        for (int i=str.length()-1; i>=0; i--){
            ans += str.charAt(i);
        }
        System.out.println(ans);
    }

    public static String solve(String A) {
        String[] strArr = A.trim().replaceAll(" +", " ").split(" ");
        for (int i=0,j=strArr.length-1; i<=j; i++,j--){
            swap(strArr, i, j);
        }
        return Arrays.stream(strArr).collect(Collectors.joining(" "));
    }

    static void swap(String[] A, int i, int j){
        String temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

}
