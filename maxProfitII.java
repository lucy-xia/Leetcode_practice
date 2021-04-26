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