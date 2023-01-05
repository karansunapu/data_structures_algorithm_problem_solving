package leet_code.Top_Interview_Questions.Easy;

public class Excel_Sheet_Column_Number {
    public static void main(String[] args) {
        String columnTitle = "ZY";
        System.out.println(titleToNumber(columnTitle));

//        System.out.println('A'-64);
    }

    public static int titleToNumber(String columnTitle) {
        int factor=1, sum=0, n=columnTitle.length();
        for (int i=n-1; i>=0; i--){
            sum += factor * (columnTitle.charAt(i)-64);
            factor *= 26;
        }
        return sum;
    }
}
