class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0) return null; //先排除空樹的情況

        return help(nums, 0, nums.length-1); //呼叫help函數
 
    }
    private TreeNode help(int[] nums, int left, int right){
    	if(left > right ) return null; //終止條件

    	int mid= left+(right-left)/2; //確定mid 節點，
    	TreeNode node= new TreeNode(nums[mid]);

    	node.left= help(nums, left, (mid-1)); //recursive呼叫 左邊是從left開始，即傳遞給help函數的左邊界
    	node.right= help(nums, (mid+1), right); 

    	return node;
    }
}