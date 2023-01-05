package intermediate.subsets_subsequeces;

public class test {
    public static void main(String[] args) {

        int[] arr = { 4, 6, 3, 7};
        int req_sum = 10;
//        int i = 6;
        for (int i=1; i< Math.pow(2, arr.length); i++){
            int num = i;
            int len =0;
            String str = Integer.toBinaryString(i);
            System.out.println("For : " + num + " - " + str );
            int sum =0;
            while (num>0){
                if ((num&1) == 1){
//                    System.out.println(arr[3 -1 -len]);
                    sum += arr[arr.length -1 -len];
                }
                len++;
                num = (num>>1);
            }
            if (sum == req_sum)
                System.out.println(str);
            System.out.println();
        }

    }
}
