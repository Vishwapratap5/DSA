public class StockBuyAndSell {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int buyAt=0;
        int sellAt=0;
        int profit=0,maxProfit=0;

        for(int i=1;i<prices.length;i++){
            if(prices[i]<prices[buyAt]){
                buyAt=i;
            }else{
                sellAt=i;
                profit=prices[sellAt]-prices[buyAt];
                maxProfit=Math.max(maxProfit,profit);
            }
        }
        System.out.println(maxProfit);
    }
}
