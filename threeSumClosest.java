class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int result=0; //隨便設一個值
        int mingap=Integer.MAX_VALUE;
        Arrays.sort(nums);
        
        for(int i=0; i<nums.length-2; i++){ //為了保證右邊還有兩個數的位置
            int j=i+1;
            int k=nums.length-1;
            
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                int gap=Math.abs(sum-target);
                if(gap<mingap){ //比較和target的大小
                    result=sum;
                    mingap=gap;
                }
                if(sum<target) //依實際情況來看是否需要做調整
                    j++;
                else
                    k--;
            }
        }        
        return result;
    }
}