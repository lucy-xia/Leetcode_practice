class Solution {
    public int maxDepth(TreeNode root) {
    	if(root == null)
    		return 0;
    	return 1+Math.max(maxDepth(node.left), maxDepth(node.right)); //不管是不是完整的葉節點
    }
}