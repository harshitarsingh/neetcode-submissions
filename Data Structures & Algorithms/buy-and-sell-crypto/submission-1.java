class Solution {
    public int maxProfit(int[] prices) {

      int i=0, j=1;
        int maxP=0, profit=0;
      while(i<j && j<prices.length)
      {
        if(prices[j]<prices[i])
        {
            i++;
            j=i+1;
        }
        else
        {
        profit=prices[j]-prices[i];
        maxP=Math.max(maxP, profit);
        j++;
        }
      }  
      return maxP;
    }
}
