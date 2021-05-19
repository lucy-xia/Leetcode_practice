//method1:
class Solution {
    public int findPeakElement(int[] nums) {
    	int start=0;
    	int end=nums.length-1;

    	while(start+1<end){
    		int mid=start+(end-start)/2;
    		if(nums[mid]<nums[mid+1])
    			start=mid;
    		else
    			end=mid;
    	}

    	//最后start和end一定在相邻的位置
    	if(nums[start]>nums[end])
    		return start;
    	else
    		return end;
    }
}
//method2:
class Solution {
    public int findPeakElement(int[] nums) {
    	int start=0;
    	int end=nums.length-1;

    	while (start < end) {
            int mid = (start + end) / 2;
            if (nums[mid] > nums[mid + 1])
                end = mid;
            else
                start = mid + 1;
        }
        return start;
    }
}

//method3:
class Solution {
    public int findPeakElement(int[] nums) {
        return search(nums, 0, nums.length - 1);
    }
    public int search(int[] nums, int start, int end) {
        if (start == end)
            return start;
        int mid = (start + end) / 2;
        if (nums[mid] > nums[mid + 1])
            return search(nums, start, mid);
        return search(nums, mid + 1, end);
    }
}
