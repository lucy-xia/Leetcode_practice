class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
    	if(p==null && q==null) return true;
    	if(q!=null && p== null || q==null && p!= null ||q.val!=p.val) return false;
    	return isSameTree(q.left, p.left) && isSameTree(p.right, q.left);
    }
 }