package intermediate;

public class maxElementFreq {
    public static void main(String[] args) {

        int[] arr = {2, 8, 1, 4, 89, 0 ,8, 1, 3, 8};
        int[] sol = {arr[0], 0};

        for(int elem : arr) {
            if(elem == sol[0]){
                sol[1]++;
            } else if(elem > sol[0]) {
                sol[0] = elem;
                sol[1] = 1;
            }
        }

        System.out.println(sol[0] + "    dsdsdsds    " + sol[1]);
    }
}
