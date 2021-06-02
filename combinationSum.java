class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result= new ArrayList<>();
        helper(candidates, result, target, new ArrayList<>(), 0);
        return result;
    }
    private void helper(int[] candidates, List<List<Integer>> result, int target, List<Integer> tmp, int start){
		if(target<0)
			return ; //開始回溯
		if(target==0){
			result.add(new ArrayList<>(tmp));
			return ;
		}
		for(int i=start; i< candidates.length;i++){
			tmp.add(candidates[i]);
			helper(candidates, result, target-candidates[i], tmp, i);
			tmp.remove(tmp.size()-1);
		}
	}
}