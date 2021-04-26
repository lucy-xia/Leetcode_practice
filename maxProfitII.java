class Solution {
    public int maxProfitII(int[] prices) {
        int result=0;
        int low= prices[0];
        int high = prices[0];
        for(int i=1; i<prices.length; i++){
            if(prices[i]<low)
                low= prices[i];
            if((prices[i]>low && i<prices.length-1 && prices[i+1]<prices[i])  || (prices[i]>low && i==prices.length-1)){
                high= prices[i];
                result+=(high-low);
                low=Integer.MAX_VALUE;
            }
                
        }
        return result;
    }
}

/* Better solution
class Solution {
    public int maxProfit(int[] prices) { // 把峰值加起来 平滑的和下降的都不做考虑
        if(prices==null || prices.length==1) return 0;
        int result =0;
        for(int i=1; i<prices.length; i++){
            if(prices[i]>prices[i-1])
                result+=(prices[i]-prices[i-1]);
        }        
        return result;
    }
}
*/