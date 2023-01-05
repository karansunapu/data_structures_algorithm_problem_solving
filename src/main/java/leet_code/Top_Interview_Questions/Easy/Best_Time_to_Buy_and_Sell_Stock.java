package leet_code.Top_Interview_Questions.Easy;

public class Best_Time_to_Buy_and_Sell_Stock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int profit=0, max_profit=0, n=prices.length, max=prices[n-1];
        for (int i=n-2; i>=0; i--){
            profit = max - prices[i];
            if (profit>0)
                max_profit = Math.max(max_profit, profit);
            max = Math.max(max, prices[i]);
        }
        return max_profit;
    }


    public static int maxProfit_naive(int[] prices) {
        int profit= 0, n=prices.length;
        for (int i=0; i<n-1; i++){
            for (int j=i+1; j<n; j++){
                if (prices[j] > prices[i])
                    profit = Math.max(profit, prices[j]-prices[i]);
            }
        }
        return profit;
    }


}
