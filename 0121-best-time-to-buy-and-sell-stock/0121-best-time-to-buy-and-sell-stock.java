class Solution {
    public int maxProfit(int[] prices) {
     int maxP=0;
     int sum=0;
     for(int i=1;i<prices.length;i++){
        sum+=prices[i]-prices[i-1];
        if(sum<0) sum=0;
        maxP=Math.max(sum,maxP);
     }   
     return maxP; 
    }
}