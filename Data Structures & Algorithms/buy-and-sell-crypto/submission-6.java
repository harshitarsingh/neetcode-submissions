class Solution {
    public int maxProfit(int[] prices) {

      int i=0;
        int maxP=0, profit=0;
      for(int j=1; j<prices.length; j++)
      {

        profit=prices[j]-prices[i];
        maxP=Math.max(maxP, profit);

        if(prices[j]<prices[i])
        i=j;
        
      }  
      return maxP;
    }
}
