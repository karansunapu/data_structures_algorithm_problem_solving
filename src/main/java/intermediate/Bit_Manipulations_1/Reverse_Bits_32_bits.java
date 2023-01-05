package intermediate.Bit_Manipulations_1;

public class Reverse_Bits_32_bits {
    public static void main(String[] args) {
        long A= 3L;
        System.out.println(reverse(A));
    }

    public static long reverse(long A) {
        // convert long to binary
        String binStr = Long.toBinaryString(A);
        int len = binStr.length();
        while(len < 32) {
            binStr = "0" + binStr;
            len++;
        }
        //reverse
        char[] charArray = binStr.toCharArray();
        for(int i=0,j=charArray.length-1; i<j; i++,j-- ){
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
        }
        System.out.println(binStr);
        String res = "";
        for(char c : charArray)
            res += c;
        System.out.println(res);


        return Long.parseLong(res, 2);
    }
}
