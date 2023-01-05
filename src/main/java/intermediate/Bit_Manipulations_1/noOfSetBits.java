package intermediate.Bit_Manipulations_1;

public class noOfSetBits {
    public static void main(String[] args) {
        int A = 11;
        System.out.println(numSetBits(A));
    }

    public static int numSetBits(int A) {
        int count =0;
        while(A>0){
            A = A & (A-1);  // A= 10010-100   A-1= 10010-011  -> A & (A-1) = unset last set bit
            count++;
        }
        return count;
    }

    public static int numSetBits_spaceExtra(int A) {
        String bin = Integer.toBinaryString(A);
        int count =0;
        for(char c : bin.toCharArray()){
            if(c - '0' == 1)
                count++;
        }

        return count;
    }

}
