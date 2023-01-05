package advanced.array_1.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

//{-7, -2, 5, 3, -1, 6, 1, 1, -2}
//{0, 0, -1, 0}
//1967513926, 1540383426, -1303455736, -521595368
public class Max_Non_Negative_SubArray {
    public static void main(String[] args) {
        ArrayList<Integer> arr = Arrays.stream(new int[]{756898537, -1973594324, -2038664370, -184803526, 1424268980 })
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(maxset(arr));
    }

    public static ArrayList<Integer> maxset(ArrayList<Integer> A) {

        int max_end= 0;
        int max_len= 0;
        long max_sum= 0;
        long cur_sum= 0;
        int cur_len= 0;

        for (int i=0; i<A.size(); i++){

            if (A.get(i) >= 0){
                cur_sum += A.get(i);
                cur_len++;
            } else{
                    if (max_sum == cur_sum) {
                        if (max_len < cur_len) {
                            max_len = cur_len;
                            max_end = i - 1;
                        }
                    }else if (max_sum < cur_sum){
                            max_sum= cur_sum;
                            max_len= cur_len;
                            max_end = i - 1;
                    }

                    //reset everything
                    cur_len= 0;
                    cur_sum= 0;
            }
        }

        if (max_sum == cur_sum) {
            if (max_len < cur_len) {
                max_len = cur_len;
                max_end = A.size()-1;
            }
        }else if (max_sum < cur_sum){
            max_sum= cur_sum;
            max_len= cur_len;
            max_end = A.size()-1;
        }

        System.out.println(max_end);
        System.out.println(max_len);

        ArrayList<Integer> ans = new ArrayList<>();
        while (max_len > 0){
            ans.add(0, A.get(max_end));
            max_end--;
            max_len--;
        }

        return ans;
    }
}
