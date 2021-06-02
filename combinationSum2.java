//method1:
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result= new ArrayList<>();
        if(candidates==null || candidates.length==0)
            return result;
        
        for(int x=0;x<candidates.length-1;x++){
    		for(int y=x+1;y<candidates.length;y++){
    			if(candidates[x]>candidates[y]){
    					int temp = candidates[x];
    					candidates[x] = candidates[y];
    					candidates[y] = temp;
    			}
    		}
    	}    
        helper(candidates, result, target, new ArrayList<>(), 0);
        return result;
    }
    
    private void helper(int[] candidates, List<List<Integer>> result, int target, List<Integer> tmp, int start){
		if(target<0)
			return; //開始回溯
		if(target==0){
            if(!result.contains(new ArrayList<Integer>(tmp)))
			    result.add(new ArrayList<Integer>(tmp));
			return;
		}
		for(int i=start; i< candidates.length;i++){
			tmp.add(candidates[i]);
			helper(candidates, result, target-candidates[i], tmp, i+1);
			tmp.remove(tmp.size()-1);
		}
    }
}

//method2:
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result= new ArrayList<>();
        if(candidates==null || candidates.length==0)
            return result;
        Arrays.sort(candidates); 
        helper(candidates, result, target, new ArrayList<>(), 0);
        return result;
    }
    
    private void helper(int[] candidates, List<List<Integer>> result, int target, List<Integer> tmp, int start){
        if(target<0)
            return; //開始回溯
        if(target==0){
                result.add(new ArrayList<Integer>(tmp));
            return;
        }
        for(int i=start; i< candidates.length;i++){
            if(i!=start && candidates[i]==candidates[i-1])
                continue;
            tmp.add(candidates[i]);
            helper(candidates, result, target-candidates[i], tmp, i+1);
            tmp.remove(tmp.size()-1);
        }
    }
}