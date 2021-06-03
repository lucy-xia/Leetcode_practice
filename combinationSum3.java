//前任不行
//綠茶不行
class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result= new ArrayList<>();
        //corner case
        int dummy_sum=0;
        int dummy_count=0;
        for(int i=9; i>=1; i--){
            if(dummy_count<k){
                dummy_sum+=i; 
                dummy_count++;
            }
        }
        if(dummy_sum<n)
            return result;
        
        dfs(result, k, n, new ArrayList<Integer>(),1);
        return result;
    }
    
    private void dfs(List<List<Integer>> result, int k, int n, List<Integer> tmp, int start){
		if(k==0 && n==0){
			result.add(new ArrayList<>(tmp));
			return ;
		}
		for(int i=start; i<=9;i++){
			tmp.add(i);
			dfs(result, k-1, n-i, tmp,i+1);
			tmp.remove(tmp.size()-1);
		}
    }
}