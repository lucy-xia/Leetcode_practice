[1,2] 3
//recursive method
class Solution {
    int result=Integer.MAX_VALUE; //是interger下面的max value不是math下面的max value
    public int coinChange(int[] coins, int amount) {
        //先从大到小排列coins裡面的數值
        //corner case
        if(coins.length == 0)
            return -1;
        if(amount==0)
            return 0;
        helper(coins, amount, 0);
        
        if(result==Integer.MAX_VALUE)
            return -1;
        return result;
        
    }
    private void helper(int[] coins, int amount, int count) {
        if(result<0)
            return ;
        if(result==0){
            result=Math.min(result, count);
        }
        for(int i=0; i<coins.length;i++){
            helper(coins, amount-coins[i],count++);
        }  
    }
}

//dp
class Solution {
    public int coinChange(int[] coins, int amount) {
    	int[] dp= new int[amount + 1];
    	Arrays.fill(dp,amount+1); 
    	dp[0]=0;

    	for(int i=1; i<=amount; i++){ //目标金额数字大小
    		for(int coin:coins){ //dp[amount]=min{dp(amount-1)+1, dp(amount-2)+1}
    			if(i>=coin)
    				dp[i]=Math.min(dp[i], dp[i-coin]+1);
    		}
    	}

    	return dp[amount]==amount+1? -1: dp[amount];
    }
}


class Solution {
    public int coinChange(int[] coins, int amount) {
    	int[] dp= new int[amount + 1];
    	Arrays.fill(dp,Integer.MAX_VALUE); 
    	dp[0]=0;

    	for(int i=1; i<=amount; i++){ //目标金额数字大小
    		for(int coin:coins){ //dp[amount]=min{dp(amount-1)+1, dp(amount-2)+1}
    			if(i>=coin && dp[i-coin]!=Integer.MAX_VALUE)
    				dp[i]=Math.min(dp[i], dp[i-coin]+1);
    		}
    	}

    	return dp[amount]==Integer.MAX_VALUE? -1: dp[amount];
    }
}


for(i=1)
	for(coin=1)
		if(1>=1 && dp[0]!=Integer.MAX_VALUE)
			dp[1]=dp[0]+1=1;
	for(coin=2)
		if(i<2)
			continue;
for(i=2)	
	for(coin=1)
		if(2>=1 && dp[1]!=)
			dp[2]=dp[1]+1=2;
	for(coin=2)
		if(2>=2)
			dp[2]=dp[0]+1=1;
for(i=3)
	for(coin=1)
		if(3>=1 && dp[2]!=)
			dp[3]=dp[2]+1=2;
	for(coin=2)
		if(2>=1 && dp[1]!=)
			dp[3]=dp[1]+1=2;


