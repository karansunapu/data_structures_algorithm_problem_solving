package intermediate;// all permutations of -> wor

//WORD  WROD
// WDOR  WODR WRDO
// WDRO

import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class test3 {
    public static void main(String[] args) {
        String str = "word";

        char[] charArr = str.toCharArray();

        System.out.println(rec(str));

//        for(int i=0; i<charArr.length; i++){
//            for(int j=i+1; j<)
//        }

    }

    public static String rec(String str) {

        if(str.length() == 1){
            return str.charAt(0) + "";
        } else {
            return (str.charAt(0) + rec(str.substring(1))) + "_" + (rec(str.substring(1)) + str.charAt(0) );
        }


    }
}
