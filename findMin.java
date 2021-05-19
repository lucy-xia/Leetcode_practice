class Solution {
    public int findMin(int[] nums) {
        int left=0;
        int right= nums.length-1;
        
        while(left<right-1){
            int mid=(left+right)/2;
            //这里必须呀用right来做比较
            if(nums[mid]>nums[right])
                left=mid;
            else if(nums[mid]<nums[right])
                right=mid;
        }
        
        if(nums[left]<nums[right])
            return nums[left];
        else 
            return nums[right];
    }
}