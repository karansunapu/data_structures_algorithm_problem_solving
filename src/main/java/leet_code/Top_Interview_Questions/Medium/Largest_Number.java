package leet_code.Top_Interview_Questions.Medium;

import java.util.*;
import java.util.stream.Collectors;

public class Largest_Number {
    public static void main(String[] args) {
        int[] nums = {10,2};
        List<String> strNums = Arrays.stream(nums).mapToObj(String::valueOf).collect(Collectors.toList());
        System.out.println(strNums);

        Collections.sort(strNums, new Comparator<String>()
        {
            // A comparison function which is used by
            // sort() in printLargest()
            @Override public int compare(String X, String Y)
            {
                String XY = X + Y;
                String YX = Y + X;
                return XY.compareTo(YX) > 0 ? -1 : 1;
            }
        });
        System.out.println(strNums);;
        System.out.println(strNums.stream().collect(Collectors.joining("")));

    }

    public static String largestNumber(int[] nums) {
        sort(nums);
        System.out.println(Arrays.toString(nums));
        return Arrays.stream(nums).mapToObj(String::valueOf).collect(Collectors.joining(""));
    }

    static void sort(int[] nums){
        int max, max_pos;
        for (int i=0; i<nums.length; i++){
            max=nums[i]; max_pos=i;
            for (int j=i; j<nums.length; j++){
                if (compare(nums[j], max)){
                    max = nums[j];
                    max_pos = j;
                }
            }
            swap(nums, i, max_pos);
        }
    }

    static boolean compare(int a, int b){
        int i=1;
        if (a==b)
            return false;
        while (findIthDigit(a, i) == findIthDigit(b, i))
            i++;
        if (findIthDigit(a, i) > findIthDigit(b, i))
            return true;
        return false;
    }

    static int findIthDigit(int n, int digit)
    {
        int digits = (int)(Math.log10(n))+1;
        if (digit>digits)
            return n%10;

        try {
            n = ((int)(n / (int)(Math.pow(10, digits - digit))))%10;
        } catch (Exception e){
            System.out.println("dividing ");
        }

        return n;
    }

    static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
