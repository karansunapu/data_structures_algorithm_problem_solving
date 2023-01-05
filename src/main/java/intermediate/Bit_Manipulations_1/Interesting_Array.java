package intermediate.Bit_Manipulations_1;

public class Interesting_Array {
    public static void main(String[] args) {
        int[] A = {3003, 3030, 228, 9856, 8173, 2480, 1799, 6404, 518, 2738,
                8169, 4429, 1783, 4619, 9782, 7419, 1674, 6404, 1214, 6976,
                5010, 5743, 9664, 3957, 1644, 1129, 1497, 8429, 3068, 2287,
                5059, 2325, 2426, 2655, 2418, 6542, 4141, 5899, 2659, 8630};
        System.out.println(solve(A));
    }

    public static String solve(int[] A) {
        int sum=0;
        for(int num : A){
            sum +=num;
        }
        if(sum % 2 == 0)
            return "Yes";
        else
            return "No";
    }
}
