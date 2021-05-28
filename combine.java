class Solution {
    public List<List<Integer>> combine(int n, int k) {
        int[] nums= new int[n]; //把備選的數字存入int[]中
        for(int i=0; i<n; i++)
        	nums[i]=i+1; //開頭的第一個數字是1，不是0
        List<List<Integer>> result= new ArrayList<>();
        helper(result,nums, new ArrayList<Integer>(), 0, k);
        return result;
    }

    private void helper(List<List<Integer>> result, int[] nums, List<Integer> tmp, int index, int count){
    	if(count==0){
    		result.add(new ArrayList<> (tmp));
    		return ;
    	}
    	
    	for(int i=index; i<nums.length; i++){
    		tmp.add(nums[i]); //從int[]中抓數字進來
    		helper(result, nums, tmp, i+1, count-1);
    		tmp.remove(tmp.size()-1);
    	}
    }
}