class Solution {
    public int findMin(int[] nums) {
    	int left=0;
        int right= nums.length-1;
        
        while(left+1<right){  //关注点
            int mid=(left+right)/2;
            if(nums[mid]>nums[right]) 
                left=mid;        
            else if(nums[mid]<nums[right])
            	right=mid;
        }
   
        if(nums[left]<nums[right]){
            return nums[left];
        else 
        	return nums[right];
        }            
    }
}