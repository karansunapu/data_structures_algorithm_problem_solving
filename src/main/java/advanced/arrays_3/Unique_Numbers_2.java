package advanced.arrays_3;

public class Unique_Numbers_2 {
    public static void main(String[] args) {
        int[] a = {2, 3, 7, 10, 3, 9, 7, 2, 10, 5};
        System.out.println(solve(a));
    }

    static int solve(int[] arr){
        int len= arr.length;
        int total_xor=0;
        for (int n : arr)
            total_xor = total_xor ^ n;

        //padding of 0's for 32 bit
        String str =String.format("%32s", Integer.toBinaryString(total_xor))
                            .replaceAll(" ", "0");

        int zero_bits =0, one_bits =0;
        for (int i=0; i<32; i++) {
            // first set bit
            if ((total_xor & (1<<i)) != 0){
                // divide into groups
                for (int j=0; j<len; j++){
                    if ((arr[j] & (1<<i)) == 0)
                        one_bits = one_bits ^ arr[j];
                    else
                        zero_bits = zero_bits ^ arr[j];
                }
                break;
            }
        }

        System.out.println(one_bits + " ; " + zero_bits);
        return total_xor;
    }
}
