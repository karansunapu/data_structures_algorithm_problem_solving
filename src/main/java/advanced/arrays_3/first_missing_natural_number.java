package advanced.arrays_3;

public class first_missing_natural_number {
    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 2, -10, 7};
        System.out.println(solve(arr));
    }

    static int solve(int[] arr){

        for (int i=1; i<=arr.length; i++){
            boolean flag = false;
            for (int num: arr){
                if (i == num)
                    flag= true;
            }
            if (flag == false)
                return i;
        }

        // all num 1 -> N ..are present
        return arr.length +1;
    }

}
