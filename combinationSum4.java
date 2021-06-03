class Solution {
    public int result=0;
    public int combinationSum4(int[] nums, int target) {  
        if(nums==null || nums.length==0)
            return result;
        helper(nums, target, new ArrayList<>(), 0);
        return result;
    }
    
    private void helper(int[] candidates, int target, List<Integer> tmp, int index){
        if(target<0)
            return; //開始回溯
        if(target==0){
            result++;
            return;
        }
        for(int i=0; i< candidates.length;i++){
            tmp.add(candidates[i]);
            helper(candidates, target-candidates[i], tmp,i);
            tmp.remove(tmp.size()-1);
        }
    }
}