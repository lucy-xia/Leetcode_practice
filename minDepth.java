class Solution {
	public int minDepth(TreeNode root) {
		if(root==null)
			return 0;
		if(root.left!=null && root.right!=null) //如果兩邊都是合理的leave存在
            return 1+Math.min(minDepth(root.left),minDepth(root.right));
		else //如果兩邊有一個是不合理的leave存在，那麼反而不能用他
            return 1+Math.max(minDepth(root.left),minDepth(root.right));
	}
}