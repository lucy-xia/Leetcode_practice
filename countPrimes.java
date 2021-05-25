//mathod1:
class Solution {
    public int countPrimes(int n) {
    	if(n<3)
    		return 0;
    	for(int i=2;i<n-1; i=i+1){
    		if(n&i==0)
    			return false;
    		else 
    			return true;
    	}
    }
}
//method2:
class Solution {
    public int countPrimes(int n) {

        boolean[] nums= new boolean[n];

        for(int i=2; i<n; i++){
        	nums[i]=true;
        }

        for(int i=2; i*i<n; i++){
        	if(!nums[i])
        		continue;
        	else{
				for(int j=i*i; j<n; j+=i)
        			nums[j]=false;
        	}        	
        }
        
        int result=0;
        for(int i=2;i<n;i++){
        	if(nums[i]==true)
        		result++;
        }
        return result;
    }
}
