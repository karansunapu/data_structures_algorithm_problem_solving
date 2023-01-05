package intermediate.Bit_Manipulations_1;

public class add_2_BinaryNumbers {
    public static void main(String[] args) {
        String A = "100";
        String B = "11";
        System.out.println(addBinary(A, B));
    }

    public static String addBinary(String A, String B){
        if(A.charAt(0) == '0' && B.charAt(0) == '0'){
            return "0";
        }

        StringBuilder result = new StringBuilder("");
        int s = 0;

        // go from last index to first
        int i = A.length() - 1, j = B.length() - 1;
        while (i >= 0 || j >= 0 || s == 1)
        {
            s += ((i >= 0)? A.charAt(i) - '0': 0);
            s += ((j >= 0)? B.charAt(j) - '0': 0);

            result.append((char)(s % 2 + '0'));
            s /= 2;

            i--; j--;
        }

        // remove leading zzeros
        int start = result.length()-1;
        while(start >=0 && result.charAt(start) == '0') {
            start--;
        }
        if(start != result.length()-1) {
            result.delete(start+1,result.length());
        }

        return result.reverse().toString();
    }

    public static String addBinary_2(String A, String B) {

        int a=0, b=0;
        //can also covert by
        // Integer.parseInt("110", 2));

        for(int i=0; i<A.length(); i++){
            a += (int)Math.pow(2, i) * Integer.valueOf(A.charAt(A.length()-1 - i)+"");
        }

        for(int i=0; i<B.length(); i++){
            b += (int)Math.pow(2, i) * Integer.valueOf(B.charAt(B.length()-1 - i)+"");
        }

        a = a + b;

        return Integer.toBinaryString(a);
        // can also be done manually -- % and /
//        while(decimal > 0){
//            binary[index++] = decimal%2;
//            decimal = decimal/2;
//        }

    }
}
