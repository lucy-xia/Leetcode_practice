class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i=2; i<=n; i++) {
                dp[i] = dp[i - 1]+dp[i - 2]; //因为每次只能爬 11 级或 22 级，所以 f(x)f(x) 只能从 f(x - 1)f(x−1) 和 f(x - 2)f(x−2) 转移过来
        }
        return dp[n];
    }
}

//脑洞大开，泛化可以爬的阶梯数【排列问题】
class Solution {
    public int climbStairs(int n, int[] step) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i=2; i<=n; i++) {
        	for(int j=0; j<step.length ; j++){
        		int step= step[j];
        		if(step > i) //可以跨越的步数大于台阶数
        			continue;
                dp[i] = dp[i]+dp[i-step];
        	}
        		
        }
        return dp[n];
    }
}