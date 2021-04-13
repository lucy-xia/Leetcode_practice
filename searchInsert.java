class Solution {
    public int searchInsert(int[] nums, int target) {
        int result=0;
        if(nums[0]>target)
                 return 0;
        if(nums[nums.length-1]<target)
                 return nums.length;
        int i=0;
        while(i<nums.length){
             if(nums[i] == target){
                 result = i;
                 i=nums.length+1;
             }
             else if(nums[i]<target && nums[i+1]>target){
                 result = ++i;
                 i=nums.length+1;
             } 
            i++;
         }   
        return result;
    }
}