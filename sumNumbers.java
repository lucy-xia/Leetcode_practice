class Solution {
    public int sumNumbers(TreeNode root) {
        if(root==null) return result;
        helper(root, 0);
        return result;
    }
    public static int result=0; //最后都会加到result里面，所以这是个global的变量
    private void helper(TreeNode node, int current){
        if(node.left== null && node.right==null){
            result+=(current *10+node.val);
            return;
        }
        helper(node.left, current *10+node.val);
        helper(node.right, current *10+node.val);
    }
}