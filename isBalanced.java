/*
class Solution {
    
    //既要滿足樹的左右兩邊的高度差小於等於1， 又要左右兩邊都各自是balance tree
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        int left_height = height(root.left); 
        int right_height = height(root.right);
        return (Math.abs(right_height-left_height))<=1 && isBalanced(root.left) && isBalanced(root.right);
    }
    
    //
    private int height(TreeNode node){
        if(node==null) return -1;
        return Math.max(height(node.right),height(node.left))+1;
    }
}
*/
class Solution {
	public boolean isBalanced(TreeNode root) {
		result = 0;
		balance(root);
		if(result==0)
			return true;
		else
			return false;
	}
	public static int result =0;
    
	public static int balance(TreeNode node){
		if(node==null)
			return -1;
		int left = balance(node.left);
		int right = balance(node.right);
		int hell = Math.abs(left-right);
		if(hell>1)
			result = 1; //隨時在檢測兩邊的高度差是不是大於1
		return Math.max(left,right)+1;
	}
}