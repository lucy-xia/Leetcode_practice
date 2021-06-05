class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result= new ArrayList<>();
        //corner case
        if(nums.length==0 || nums== null)
            return result;
        Arrays.sort(nums);
        helper(nums, result, new ArrayList<Integer>(), 0);
        return result;
    }
    
    private void helper(int[] nums, List<List<Integer>> result, List<Integer> tmp, int index){
        result.add(new ArrayList<Integer>(tmp));

        for(int i=index; i<nums.length; i++){
            if(i!=index && nums[i]==nums[i-1])
                continue;
            tmp.add(nums[i]);
            helper(nums, result, tmp, i+1);
            tmp.remove(tmp.size()-1);
        }
    }
}