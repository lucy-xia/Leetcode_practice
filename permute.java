// backtracking 時間比較久
class Solution {
	public static List<List<Integer>> permute(int[] nums){
		List<List<Integer>> list= new ArrayList<>();

		helper(list, new ArrayList<>(), nums);
		return list;
	}

	private void helper(List<List<Integer>> list, List<Integer> tmp, int[] nums){
		if(tmp.size()== nums.length){
			list.add(new ArrayList<>(tmp));
			return ;
		}
		for(int i=0; i< nums.length;i++){
			if(tmp.contains(nums[i]))
				continue;
			tmp.add(nums[i]);
			helper(list, tmp, nums);
			tmp.remove(tmp.size()-1);
		}
	}
}
