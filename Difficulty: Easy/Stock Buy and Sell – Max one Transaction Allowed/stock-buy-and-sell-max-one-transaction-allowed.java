class Solution {
    public int maxProfit(int[] prices) {
        int bestBuy=prices[0];
        int maxProfit=0;
    
        for(int i=1;i<prices.length;i++){
            maxProfit=Math.max(maxProfit,prices[i]-bestBuy);
            //find min buy price
            bestBuy=Math.min(bestBuy,prices[i]);
        }
        
        return maxProfit>0 ?maxProfit:0;
        
        
    }
}