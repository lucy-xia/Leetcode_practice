class Solution {
    public int[] searchRange(int[] nums, int target) {
    	int[] result= {-1,-1};
    	if(nums==null || nums.length==0) //|| nums.length==0
    		return result;
        
 		result[0]=findLeft(nums, target);
 		result[1]=findRight(nums, target);
        
 		return result;
    }
    
    private int findLeft(int[] nums, int target){
    	int left=0;
    	int right=nums.length-1;
    	while(left<right-1){
    		int mid=left+(right-left)/2;
    		if(nums[mid]>=target)
    			right=mid;
    		else
    			left=mid;
    	}
    	if(nums[left]==target) //因为是寻找left所以优先返回left
    		return left;
    	else if (nums[right]== target)
    		return right;
    	else
    		return -1;
    }
    
    private int findRight(int[] nums, int target){
    	int left=0;
    	int right=nums.length-1;
    	while(left<right-1){
    		int mid=left+(right-left)/2;
    		if(nums[mid]<=target)
    			left=mid;
    		else
    			right=mid;
    	}
    	if(nums[right]== target)
    		return right;
    	else if (nums[left]==target)
    		return left;
    	else
    		return -1;
    }
}

//method2
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] output= {-1,-1};
        int[] output1={0,0};
        
        int endnum=0;
        int startnum=0;
        
        int alreadyappeared=0;
        
        if(nums.length==1 && nums[0]==target)
            return output1;
        if(nums.length==0)
            return output;
            
        for(int i=0; i< nums.length;i++){
            if (nums[i]==target && alreadyappeared==0){
                output[0]=i;
                output[1]=i;
                alreadyappeared++;
            }
            else if(nums[i]==target && alreadyappeared!=0)
                output[1]=i;
        }
            return output;
     }
}