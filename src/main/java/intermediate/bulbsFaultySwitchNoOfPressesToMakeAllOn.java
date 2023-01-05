package intermediate;

public class bulbsFaultySwitchNoOfPressesToMakeAllOn {
    public static void main(String[] args) {
        int[] A = {0, 1, 0, 1} ;
//        System.out.println(solveNaive(A));
        System.out.println(bulbs(A));
    }

    public static int bulbs(int[] A) {

        int count = 0;

        for(int i : A) {

            // if , count = even -> switch same state .... 0 -> press
            //                                             1 -> dont press
            // if , count = odd -> switch different state ....0 -> dont press (diff state - 1)
            //                                                1 -> press (diff state - 0)

            if(i == 0)
                count += (i = (count%2 == 0)?1:0 );
            else
                count += (i = (count%2 == 0)?0:1 );
        }

        return count;
    }
}
