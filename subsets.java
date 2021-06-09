//method1:
class Solution {
    List<List<Integer>> result= new ArrayList<>();
    List<Integer> tmp= new ArrayList<>();
    
    public List<List<Integer>> subsets(int[] nums) {
        //corner case
        if(nums.length==0)
            return result;
        
        dfs(0, nums);
        return result;
    }
    
    private void dfs(int index, int[] nums){
        if(index==nums.length){
            result.add(new ArrayList<Integer>(tmp));
            return;
        }
        tmp.add(nums[index]);
        dfs(index+1,nums);
        tmp.remove(tmp.size()-1);
        dfs(index+1,nums);
    }
}


//method2: backtracking
class Solution {
    List<List<Integer>> result= new ArrayList<>();
    
    public List<List<Integer>> subsets(int[] nums) {
        if(nums.length==0)
            return result;
        for(int k=0; k<=nums.length; k++)
            helper(new ArrayList<Integer>(), nums, 0,k);
        return result;
    }
    
    private void helper(ArrayList<Integer> tmp, int[] nums, int index,int k){
        if(k==0){
            result.add(new ArrayList<Integer>(tmp));
            return;
        }
        for(int i=index; i<nums.length; i++){
            tmp.add(nums[i]);
            helper(tmp, nums,i+1, k-1);
            tmp.remove(tmp.size()-1);
        }
    }
}

//method3: recursive
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result= new ArrayList<>();
        result.add(new ArrayList<Integer>()); //1.加入空集[]
        
        for(int num: nums){
            List<List<Integer>> tmp= new ArrayList<>();
            for(List<Integer> subset:result){
                List<Integer> newSubset= new ArrayList<Integer>(subset); //先复制原本的子集
                newSubset.add(num); //加入当前数字
                tmp.add(newSubset); 
            }
            result.addAll(tmp);
        }
        return result;
    }
}






