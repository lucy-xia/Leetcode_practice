class Solution {
    public int mySqrt(int x) {
    	long start = 0;
    	long end = x;
    	if(x == 0) return 0;
    	if(x ==1) return 1;
    	while(start++ < end){
    		long mid=start +(end - start)/2;
    		if((mid * mid)==x)
    			return (int)mid; //do not to forget turn the long type back to int
    		if((mid * mid)<x)
    			start = mid;
    		else 
    			end = mid;
    	}
    	return (int)start;
    }
}