//method1: recursive method
class Solution {
    public void flatten(TreeNode root) {
    	if(root==null) 
    		return ;
    	if(root.left!=null)
    		flatten(root.left);
    	if(root.right!=null)
    		flatten(root.right);

    	TreeNode temp= root.right;
    	root.right= root.left;
    	root.left=null;

    	while(root.right!=null)
    		root=root.right;
    	root.right=temp;
    }
}

//method2: stack method

class Solution {
    public void flatten(TreeNode root) {
        if(root== null)
            return ;

        Stack<TreeNode> stack= new Stack();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode cur=stack.pop();
            if(cur.right !=null)
                stack.push(cur.right);
            if(cur.left !=null)
                stack.push(cur.left);

            if(!stack.isEmpty())
                cur.right=stack.peek();

            cur.left=null;
        }
    }
}